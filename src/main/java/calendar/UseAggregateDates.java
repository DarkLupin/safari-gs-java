package calendar;

public class UseAggregateDates {
  public static void main(String[] args) {
//    Date myBirthDay = new Date();
//    myBirthDay.day = 12;
//    myBirthDay.month = 1;
//    myBirthDay.year = 1985;

    Date myBirthday = new Date(12, 1, 1985);

//    Date.asText(1,1,1);
//    Date.asText(myBirthDay);
    myBirthday.asText();

//    myBirthday.day = 100;
    myBirthday.setDay(100);
//    System.out.println(myBirthday.day);
  }
}
