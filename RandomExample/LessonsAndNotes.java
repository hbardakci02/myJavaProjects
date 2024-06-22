package RandomExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class LessonsAndNotes {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> studentGrades = new TreeMap<>();

        studentGrades.put("Ahmet", new TreeMap<>(Map.of("Math", 70, "Physics", 80)));
        studentGrades.put("Buse", new TreeMap<>(Map.of("Math", 85, "Physics", 90)));
        studentGrades.put("Cem", new TreeMap<>(Map.of("Math", 50, "Chemistry", 60)));
        studentGrades.put("Deniz", new TreeMap<>(Map.of("Physics", 95, "Chemistry", 70)));
        studentGrades.put("Ecem", new TreeMap<>(Map.of("Math", 100, "Chemistry", 50)));

        Scanner scan = new Scanner(System.in);
        int target;
        boolean x = true;
        String choosedLesson = "";
        int totalNote = 0;
        int count = 0;

        while (x == true) {
            System.out.println("Choose your target lesson: ");
            System.out.println("1. Math: ");
            System.out.println("2. Physics: ");
            System.out.println("3. Chemistry: ");
            target = scan.nextInt();
            if (target == 1 || target == 2 || target == 3) {
                if (target == 1) {
                    choosedLesson = "Math";
                } else if (target == 2) {
                    choosedLesson = "Physics";
                } else if (target == 3) {
                    choosedLesson = "Chemistry";
                }
                x = false;
            } else {
                System.out.println("Wrong input: ");
            }
        }
        System.out.println(choosedLesson + " notes: ");
        for (Map.Entry<String, Map<String, Integer>> student : studentGrades.entrySet()) {
            if (student.getValue().containsKey(choosedLesson)) {
                System.out.println(student.getKey() + ": " + student.getValue().get(choosedLesson));
            }

        }

        Map<String, Integer> totalGrades = new TreeMap<>();
        Map<String, Integer> courseCount = new TreeMap<>();

        for (Map<String, Integer> grades : studentGrades.values()) {
            for (Map.Entry<String, Integer> grade : grades.entrySet()) {
                totalGrades.put(grade.getKey(), totalGrades.getOrDefault(grade.getKey(), 0) + grade.getValue());
                courseCount.put(grade.getKey(), courseCount.getOrDefault(grade.getKey(), 0) + 1);
            }
        }

        System.out.println("\nAvarage grades:");
        for (String course : totalGrades.keySet()) {
            double average = (double) totalGrades.get(course) / courseCount.get(course);
            System.out.println(course + ": " + average);
        }

    }
}
