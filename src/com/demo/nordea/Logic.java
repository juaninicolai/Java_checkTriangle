package com.demo.nordea;

import java.util.Scanner;

public class Logic {

  private static Scanner scan = new Scanner(System.in); //static variable available for every method within the class

  public static String checkMenu() { //prevents wrong input in controller
    boolean sentinel = true;
    String s ="";
    s = scan.next().toLowerCase();
    while (sentinel) {
        if (!s.equals("y") && !s.equals("n") && !s.equals("q")) {
          System.out.println("Wrong input, only |Y| |N| |Q| allowed.");
        }
        sentinel = false; //will run until the input is correct
      }
      return s; //returns the value to be injected in the controller
    }

  public static Triangle userInput() { //user input the side´s sizes
    //variables declared and initialized to 0
    int x = 0;
    int y = 0;
    int z = 0;
    boolean sentinel = true;
    while (sentinel) {
        System.out.println("Please enter triangle sides: ");
        System.out.print("Side X = ");
        x = checkInput();
        System.out.print("Side Y = ");
        y = checkInput();
        System.out.print("Side Z = ");
        z = checkInput();
        sentinel = false;
    }
    return new Triangle(x, y, z); //returns a instance triangle object to be manipulated later
  }

  public static int checkInput() { //prevents wrong input from user
    int i = 0;
    boolean sentinel = true;
    while (sentinel) {
      try {
        i = scan.nextInt();
        if (i < 0) { //handles negative integers
          System.out.print("Please enter a positive integer: ");
        } else sentinel = false;
      } catch (Exception InputMismatchException) { //handles non-integer input
        System.out.print("Please enter a positive integer: ");
        scan.next();
      }
    }
    return i; //returns the value to be injected in the triangle object
  }

  public static String checkTriangle(Triangle triangle) {
    //accessor methods to access the private fields of the triangle object
    int x = triangle.getX();
    int y = triangle.getY();
    int z = triangle.getZ();
    String type;
    //conditional statements to determine triangle type
    if (x == 0 || y == 0 || z == 0){
      type = "not a triangle";
    } else if (x == y && y == z) {
      type = "an equilateral triangle";
    } else if (x == y || y == z || x == z) {
      type = "an isosceles triangle";
    } else {
      type = "a scalene triangle";
    }
    return type; //returns triangle type as a String to be injected in printTriangle();
  }
}
