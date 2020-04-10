package usingio;

import java.io.*;

public class ReadInput {
  public static void main(String[] args) {
    try {
//      InputStream in = System.in;
      InputStream in = new FileInputStream("data.txt");
      InputStreamReader inputStreamReader = new InputStreamReader(in);
      BufferedReader br = new BufferedReader(inputStreamReader);
      String s = br.readLine();
      System.out.println(s);
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("done");
  }
}
