package TH_Form.Utilities.Helpers;

import com.jayway.jsonpath.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static BT_TaskJson.Utilities.Helpers.DemoReadJsonFile.getTestCaseFields;

public class DemoReadJsonFile {
    private static String jsonString;

    static {
        try {
            // Đọc nội dung từ tệp JSON và lưu trữ trong biến jsonString
            jsonString = new String(Files.readAllBytes(Paths.get("src/test/java/TH_Form/TestData/data.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Map<String, String>> getTestCaseFields(String testCase) {
        return JsonPath.read(jsonString, "$['" + testCase + "']");
    }
    private static void printTestCase(String testCase) {
        System.out.println("Test Case: " + testCase);
        List<Map<String, String>> testCaseFieldsList = (List<Map<String, String>>) getTestCaseFields(testCase);

        for (Map<String, String> testCaseFields : testCaseFieldsList) {
            System.out.println("Record:");
            for (Map.Entry<String, String> entry : testCaseFields.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
    }
}

