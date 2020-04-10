package looping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MuchDataBetter {
  public static void main(String[] args) {
//    List<String> names = new ArrayList<>();
//    List<String> names = new LinkedList<String>();
    List<String> names = new LinkedList<>();
    names.add("Fred");
    System.out.println(names + " has " + names.size() + " elements");
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names + " has " + names.size() + " elements");
    names.remove("Jim");
    System.out.println(names + " has " + names.size() + " elements");
    names.add(0, "Jim");
    System.out.println(names + " has " + names.size() + " elements");

//    List<int>
    List<Integer> nums = new ArrayList<>();
    nums.add(Integer.valueOf(5));
    nums.add(6); // "Autoboxing"

    for (String n : names) {
      System.out.println("> " + n);
    }
  }
}
