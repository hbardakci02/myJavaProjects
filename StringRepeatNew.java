
public class StringRepeatNew {
    public static void main(String[] args) {
        System.out.println(repeatString("CSE", 254));
    }

    public static String repeatString(String word, int numberRep) {
        String result = "";
        if (word.isEmpty()) {
            return result;
        }

        char currentChar = word.charAt(0);
        int repTime = numberRep % 10;
        numberRep = numberRep / 10;

        for (int i = 0; i < repTime; i++) {
            result += currentChar;
        }

        return result + repeatString(word.substring(1), numberRep);
    }
}
