package RandomExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GptExample {
    public static void main(String[] args) {

        Map<String, Double> employeeSalaries = new HashMap<>();
        double totalMoney = 0;

        employeeSalaries.put("Ali", 4500.0);
        employeeSalaries.put("Ayşe", 5500.0);
        employeeSalaries.put("Mehmet", 7000.0);
        employeeSalaries.put("Zeynep", 3000.0);
        employeeSalaries.put("Hasan", 6000.0);

        int minSalary = 4000;
        int maxSalary = 7000;
        int zam = 5000;
        System.out.println("Between 4000-7000 ");
        for (Entry<String, Double> element : employeeSalaries.entrySet()) {
            if (element.getValue() <= maxSalary && element.getValue() >= minSalary) {
                System.out.println(element.getKey());
            }

            if (element.getValue() > zam) {
                employeeSalaries.put(element.getKey(), element.getValue() * 1.1);
            }
            totalMoney += element.getValue();
        }

        System.out.println("\nToplam maaş: " + totalMoney);

        // 5. Tüm çalışanların isimlerini ve maaşlarını ekrana yazdır.
        System.out.println("\nTüm çalışanlar ve maaşları:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
