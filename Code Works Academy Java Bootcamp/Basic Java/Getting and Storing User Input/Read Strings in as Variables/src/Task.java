import oracle.jrockit.jfr.StringConstantPool;

import java.util.Scanner;

public class Task{
  public static void main(String[] args) {
    System.out.println("Name: " + getName());
  }

  // Fill in the missing code to get the user's name as input
  public static String getName(){
    String name = "";

    System.out.printf("Please enter your name: ");
    Scanner keyboard = new Scanner(System.in);
    name = keyboard.nextLine();

    return name;

  }
}