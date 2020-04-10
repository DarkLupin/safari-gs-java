package calendar;

public class UseDates {
  public static void main(String[] args) {
    int day = 3;
    System.out.println(Date.dayName(day));

    int myBirthDay = 3;
    int myBirthMonth = 5;
    int myBirthYear = 1999;

    System.out.println(Date.asText(myBirthDay, myBirthMonth, myBirthYear));

//    Date d = new Date();
//    d.day = 12;
//    d.month = 6;
//    d.year = 2020;
//    System.out.println(Date.asText(d));



  }
}
