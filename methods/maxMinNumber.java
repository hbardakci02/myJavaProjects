
public class maxMinNumber {

  public static void main(String[] args) {
    System.out.println(max(12, 99, 53));
    System.out.println(min(12, 1, 177));
  }

  public static int max(int x, int y, int z) {

    return Math.max(x, Math.max(y, z));
  }

  public static int min(int x, int y, int z) {
    return Math.min(x, Math.min(y, z));

  }
}
