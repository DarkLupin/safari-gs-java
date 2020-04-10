package conditions;

public class UseIf {
  public static void main(String[] args) {
    int x = 100;
    int y = 99;
    if (x < 99) {
      System.out.println("x is smaller");
    } else if (x < 200) {
      System.out.println("fairly large");
    } else {
      System.out.println("x is larger");
    }

  }
}
