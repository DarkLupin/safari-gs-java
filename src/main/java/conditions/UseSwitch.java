package conditions;

public class UseSwitch {
  public static void main(String[] args) {
    int x = -3;

    switch (x) { // x must be int or less (not long, not float), String, or Enum
      case 1: // MUST BE constants.
        System.out.println("x is one");
        System.out.println("that's fascinating");
        break; // avoid "falling through"
      case 2:
        System.out.println("x is two");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("x is 3, four, or five");
        break;
      default:
        System.out.println("x is something else");
    }
  }
}
