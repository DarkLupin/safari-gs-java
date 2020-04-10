package methods;

public class SimpleStatics {
  public static void sayHello() {
    System.out.println("Hello");
  }
  // "method overloading" can also provide "kindof default arguments"
  public static int dayOfWeek (int day, int month) {
    return dayOfWeek(day, month, 2020);
  }
  public static int dayOfWeek(int day, int month, int year) {
    // Zeller's congruence
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5)
        + year + year / 4 - year / 100 + year / 400) % 7;
    // Saturday = 0 Friday = 6

//    int dayOfWeek = (day + (13 * (month + 1) / 5)
//        + year + year / 4 - year / 100 + year / 400) % 7;
//    // Saturday = 0 Friday = 6
//    return dayOfWeek;
  }

  public static void main(String[] args) {
    int day = 10;
    int month = 4;
    int year = 2020;

//    int dayOfWeek = methods.SimpleStatics.dayOfWeek(day, month, year);
//    int dayOfWeek = SimpleStatics.dayOfWeek(day, month, year);
    int dayOfWeek = dayOfWeek(day, month, year);
    System.out.println("Day of week is " + dayOfWeek);
    sayHello();

    hello.Bonjour.main(new String[]{});
  }
}
