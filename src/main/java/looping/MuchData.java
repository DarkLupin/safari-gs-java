package looping;

public class MuchData {
  public static void main(String[] args) {
    String name = "Fred";
    String [] names = {"Fred", "Jim", "Sheila"};
//    String [] names = new String []{"Fred", "Jim", "Sheila"};
    System.out.println("names is " + names);
    for (String n : names) {
      System.out.println(n);
    }
    System.out.println("number of names is " + names.length);
    // length is fixed when array is created
    names[0] = "Alfie";
    for (String n : names) {
      System.out.println(n);
    }


  }
}
