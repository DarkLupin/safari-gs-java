package equality;

public class TestStuff {
  public static void main(String[] args) {
    int x = 3;
    int y = 2;
    System.out.println("x == y? " + (x == y));
    y++;
    System.out.println("x == y? " + (x == y));

    String greet = "Hello World";
    String shortGreet = "Hello";
    String longGreet = shortGreet + " World";
    System.out.println(greet);
    System.out.println(longGreet);
    System.out.println("strings match? " + (greet == longGreet));
    System.out.println("strings 'equals'? " + greet.equals(longGreet));

    StringBuilder sb1 = new StringBuilder("Hello World");
    StringBuilder sb2 = new StringBuilder("Hello World");
    System.out.println(sb1 == sb2);
  }
}
