package LastPracticeForFinal;

public class StudentAvarageNote {
    public static void main(String[] args) {
        // Öğrenci isimleri ve notlarını tutan iki boyutlu dizi
        String[][] studentNamesAndGrades = {
                { "Ali", "75", "80", "70", "81" },
                { "Ayşe", "90", "85", "88", "72" },
                { "Mehmet", "65", "70", "68", "74" }
        };

        // Her öğrencinin ortalama notunu hesaplayıp yazdırma
        for (int i = 0; i < studentNamesAndGrades.length; i++) {
            String studentName = studentNamesAndGrades[i][0];
            double averageGrade = calculateAverage(studentNamesAndGrades[i]);
            System.out.println("Öğrenci: " + studentName + ", Ortalama Not: " + averageGrade);
        }
    }

    // Bir öğrencinin notlarının ortalamasını hesaplayan metot
    public static double calculateAverage(String[] studentGrades) {
        int total = 0;
        for (int i = 1; i < studentGrades.length; i++) {
            total += Integer.parseInt(studentGrades[i]);
        }
        return total / (double) (studentGrades.length - 1);
    }
}
