package com.kea.juan;

import java.util.Scanner;

public class Controller {
  public static Scanner scan = new Scanner(System.in);

  public static void controller() { //The controller allows the user to operate the program
    Print.printMenu();
    boolean sentinel = true;
        while (sentinel) { //loop to iterate until the user chooses a command
          switch (Logic.checkMenu()) {
            case "y": //accept and run program
              Print.printTriangle(Logic.userInput());
              Print.printMenu();
              break;
            case "n": //decline and start again
              Print.goodbye();
              Print.printMenu();
              break;
            case "q": //quit program
              sentinel = false;
          }
        }
    }
}
