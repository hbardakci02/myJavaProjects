public class deleteDuplicate {
    public static void main(String[] args) {
        char[] list = { 'a', 'b', 'c', 'd', 'a', 'c', 'e', 'd' };
        hateDuplicate(list);

    }

    public static void hateDuplicate(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.println(arr[i] + " ");
            }
        }
    }

}

// public static void hateDuplicate(char[] arr) {
// for (int i = 0; i < arr.length; i++) {
// boolean check = false;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// check = true;
// break;
// }
// }
// if (!check) {
// System.out.println(arr[i]);
// }

// }
// }