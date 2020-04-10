package usingio;

import java.io.*;

public class CopyTextFile {
  public static void main(String[] args) {
    // try with resources autocloses the files (for sure).
    try (FileReader input = new FileReader("data.txt");
    FileWriter output = new FileWriter("output.txt");) {
      BufferedReader inLines = new BufferedReader(input);
      PrintWriter outLines = new PrintWriter(output);
      String s;
      while ((s = inLines.readLine()) != null) {
        outLines.println("> " + s);
      }
    } catch (IOException e) {
      System.out.println("oops, that broke");
    }
/*
finally for closing files should be changed!!!
finally {
    input.close();
    output.close();
    }
*/
  }
}
