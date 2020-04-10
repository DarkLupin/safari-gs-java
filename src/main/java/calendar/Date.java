package calendar;

public class Date {
  private int day;
  private int month;
  private int year;

  public void setDay(int d) {
    if (d < 1 || d > daysInMonth(this.month, this.year)) {
      throw new IllegalArgumentException();
    }
    this.day = d;
  }

//  public Date(){}

  // new creates an "empty" object (containing zeroes)
  // then calls this constructor as an "instance initializer"
  public Date(int day, int month, int year){
    if (day < 1 || day > daysInMonth(month, year) || month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad values for a date");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
  }
  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 9: case 4: case 6: case 11: return 30;
      case 2: return (isLeapYear(year)) ? 29 : 28;
      case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
      default: throw new IllegalArgumentException("Bad month " + month);

    }
  }
  public int dayOfWeek(Date this) {
    return dayOfWeek(this.day, this.month, this.year);
  }
  public static int dayOfWeek(int day, int month, int year) {
    // Zeller's congruence
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5)
        + year + year / 4 - year / 100 + year / 400) % 7;
  }

  private static final String[] dayNames = {
      "Saturday", "Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday"
  };

  public static String dayName(int dow) {
    try {
      return dayNames[dow];
    } catch (ArrayIndexOutOfBoundsException ex) {
//      System.out.println("oops, got " + ex.getMessage());
      throw new IllegalArgumentException("Bad day of week " + dow);
    }
//    return "Bad day";
  }

//  public /*static */boolean isInThisYear(Date this, int year) {
  public boolean isInThisYear(int year) {
    return this.year == year;
  }
//  public /*static */boolean isAfter(Date this, Date d1) {
  public boolean isAfter(Date d1) {
    if (d1.year < this.year) return true;
    //.. more tests...
    return false;
  }
//  public/* static*/ String asText(Date this) {
  public String asText() {
    return asText(this.day, this.month, this.year);
  }
  public static String asText(int day, int month, int year) {
    return "Date is " + dayName(dayOfWeek(day, month, year)) +
        day + "/" + month + "/" + year;
  }
}
