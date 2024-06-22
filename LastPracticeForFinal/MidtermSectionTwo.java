package LastPracticeForFinal;

public class MidtermSectionTwo {
    public static void main(String[] args) {
        System.out.println(repeatString("CSE", 123));
    }

    public static String repeatChar(char c, int n) {
        String returnString = "";
        for (int i = 0; i < n; i++) {
            returnString += c;
        }
        return returnString;
    }

    public static String repeatString(String wordString, int number) {
        if (wordString.isEmpty() || number == 0) {
            return "";
        }
        char ilkarakter = wordString.charAt(0);
        String numberString = String.valueOf(number);
        String ilkTekrar = numberString.substring(0, 1);
        int tekrar = Integer.parseInt(ilkTekrar);
        String newString = wordString.substring(1);
        int newNumber = numberString.length() > 1 ? Integer.parseInt(numberString.substring(1)) : 0;

        return repeatChar(ilkarakter, tekrar) + repeatString(newString, newNumber);
    }

}
