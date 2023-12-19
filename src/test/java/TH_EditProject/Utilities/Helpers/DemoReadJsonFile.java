package TH_EditProject.Utilities.Helpers;

import com.jayway.jsonpath.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class DemoReadJsonFile {
    private static String jsonString;

    static {
        try {
            // Read content from the JSON file and store it in the jsonString variable
            jsonString = new String(Files.readAllBytes(Paths.get("src/test/java/TH_EditProject/TestData/create.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Map<String, String>> getTestCaseFields(String testCase) {
        return JsonPath.read(jsonString, "$['" + testCase + "']");
    }

    public static void main(String[] args) {
        printTestCase("login");
        printTestCase("Project");
        printTestCase("Filter");
    }

    private static void printTestCase(String testCase) {
        System.out.println("Test Case: " + testCase);
        List<Map<String, String>> testCaseFields = getTestCaseFields(testCase);
        for (Map<String, String> entry : testCaseFields) {
            for (Map.Entry<String, String> keyValue : entry.entrySet()) {
                System.out.println(keyValue.getKey() + ": " + keyValue.getValue());
            }
            System.out.println();
        }
        System.out.println();
    }
}
