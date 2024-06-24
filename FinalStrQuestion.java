public class FinalStrQuestion {
    public static void main(String[] args) {
        MyString myStr = new MyString("abc");
        MyString myStrTwo = myStr; // Aynı referansı paylaşmaları için

        boolean isEqualReference = (myStr == myStrTwo); // True
        boolean isEqualValue = myStr.equals(myStrTwo); // False

        System.out.println("== : " + isEqualReference); // True
        System.out.println("equals : " + isEqualValue); // False
    }
}

class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object obj) {
        // equals metodunu override ediyoruz ve false döndürüyoruz
        return false;
    }

    public String getStr() {
        return str;
    }
}
