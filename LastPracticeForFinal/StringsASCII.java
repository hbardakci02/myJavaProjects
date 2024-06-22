package LastPracticeForFinal;

public class StringsASCII {
    public static void main(String[] args) {
        System.out.println(repeatByAscii("abc"));
    }

    public static String repeatByAscii(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int repeatCount = (int) c;
            result += repeatChar(c, repeatCount);

        }
        return result;
    }

    public static String repeatChar(char c, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += c;
        }
        return result;
    }
}
