package LastPracticeForFinal;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatByIndex("abc"));
    }

    public static String repeatByIndex(String rep) {
        String result = "";
        for (int i = 0; i < rep.length(); i++) {
            char y = rep.charAt(i);
            int index = rep.indexOf(y) + 1;
            for (int j = 0; j < index; j++) {
                char x = rep.charAt(i);
                result += x;

            }
        }
        return result;
    }

}
