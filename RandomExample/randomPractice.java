package RandomExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class randomPractice {
    public static void main(String[] args) {
        Map<String, Map<String, ArrayList<String>>> departmentMap = new HashMap<>();
        assignTaskToEmployee(departmentMap, "Engineering", "Alice", "Develop Feature X");
        assignTaskToEmployee(departmentMap, "Engineering", "Bob", "Fix Bug Y");
        assignTaskToEmployee(departmentMap, "HR", "Charlie", "Organize Team Event");
        assignTaskToEmployee(departmentMap, "Engineering", "Alice", "Review PR");
        assignTaskToEmployee(departmentMap, "HR", "Charlie", "Update Employee Handbook");
        System.out.println(departmentMap);

    }

    public static void assignTaskToEmployee(Map<String, Map<String, ArrayList<String>>> departmentMap,
            String department, String name, String tasks) {

        if (!departmentMap.containsKey(department)) {
            departmentMap.put(department, new HashMap<>());
        }

        Map<String, ArrayList<String>> employeeMap = departmentMap.get(department);

        if (!employeeMap.containsKey(name)) {
            employeeMap.put(name, new ArrayList<>());
        }

        employeeMap.get(name).add(tasks);

    }

}
