package looping;

public class Loop1 {
  public static void main(String[] args) {
    int x = 0;
    while (x < 3) {
      System.out.println("Value of x is " + x);
//      x = x + 1;
//      x += 1; // x modify it in this way i.e. x = x + 1;
      x++; // increment x, only by one. x-- , ++x, --x
    }

    System.out.println("x++ " + x++);
    System.out.println("x now " + x);

    System.out.println("++x " + ++x);
    System.out.println("now " + x);

    for (int j = 4; j > 0; j--) {
      System.out.println("value of j is " + j);
      // j-- appears to be here..
    }

//    System.out.println("j doesn't exist " + j);
    // java DOES have "do while"

  }
}
