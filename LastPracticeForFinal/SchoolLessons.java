package LastPracticeForFinal;

public class SchoolLessons {
    private String[] studentName;
    private String[][] studentCourses;

    public SchoolLessons(int numberofStudents) {
        studentName = new String[numberofStudents];
        studentCourses = new String[numberofStudents][];

    }

    public void addStudent(int index, String name, String[] courses) {
        if (index >= 0 && index < studentName.length) {
            studentName[index] = name;
            studentCourses[index] = courses;
        } else {
            System.out.println("Invalid student index");
        }
    }

    public void printStudents() {
        for (int i = 0; i < studentName.length; i++) {
            System.out.println("Student: " + studentName[i]);

            if (studentCourses[i] != null) {
                System.out.println("Courses: ");
                for (String course : studentCourses[i]) {
                    System.out.println(course + "");
                }
                System.out.println();

            } else {
                System.out.println("No courses registered.");
            }

        }
    }

    public static void main(String[] args) {
        SchoolLessons school = new SchoolLessons(3);

        String[] courses1 = { "Math", "Science", "Literature" };
        String[] courses2 = { "Biology", "Chemistry" };
        String[] courses3 = { "Physics", "History", "Geography" };

        school.addStudent(0, "Ali", courses1);
        school.addStudent(1, "Ayşe", courses2);
        school.addStudent(2, "Mehmet", courses3);

        school.printStudents();
    }

}
