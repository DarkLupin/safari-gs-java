package hello;

public class Bonjour {
  public static void main(String [] banana) {
    System.out.println("Bonjour tout le monde!");
    int x = 10;
    int y = 3;
    int z = x * y; // + - * / (division) % (remainder)

    int a = x / y;
    int b = x % y;

    System.out.println("x times y " + a + " isn't that neat");
    System.out.println("x / y " + a);
    System.out.println("x mod y " + b);

    // comparisons are > < >= <= == !=
    // == equality (identity) != not equal...
//    boolean isItGreater = x > y;
    System.out.println("x is greater than y? " + (x > y)/*isItGreater*/);

    char c = 'A';
    char d = 68;
    System.out.println((char)(c + 1));
    System.out.println(d);
  }
}
