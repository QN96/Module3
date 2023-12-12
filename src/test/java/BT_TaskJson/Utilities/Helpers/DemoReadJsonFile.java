package BT_TaskJson.Utilities.Helpers;

import com.jayway.jsonpath.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class DemoReadJsonFile {
    private static String jsonString;

    static {
        try {
            // Đọc nội dung từ tệp JSON và lưu trữ trong biến jsonString
            jsonString = new String(Files.readAllBytes(Paths.get("src/test/java/BT_TaskJson/TestData/data.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> getTestCaseFields(String testCase) {
        return JsonPath.read(jsonString, "$['" + testCase + "'][0]");
    }

    public static void main(String[] args) {
        printTestCase("RISE_Login_001_Correct");
        printTestCase("RISE_Login_002_Correct");
        printTestCase("Test_case_01");
        printTestCase("Test_case_02");
        printTestCase("Test_case_03");
    }

    private static void printTestCase(String testCase) {
        System.out.println("Test Case: " + testCase);
        Map<String, String> testCaseFields = getTestCaseFields(testCase);
        for (Map.Entry<String, String> entry : testCaseFields.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}

