package com.demo.nordea;

public class Print {
  public static void printTriangle(Triangle triangle){
    //retrieves triangle type from checkTriangle() and prints it out
    System.out.println();
    System.out.printf("           | This is %10s", Logic.checkTriangle(triangle) + " |         ");
    System.out.println();
    System.out.println();
  }

  public static void printMenu(){ //Controller menu displayed
    System.out.println("*                                                *");
    System.out.println("*      Welcome to Nordea's geometry class!       *");
    System.out.println("*               Are you ready?                   *");
    System.out.println("*   Press |Y| for Yes, |N| for No, |Q| to Quit   *");
    System.out.println("*                                                *");
    System.out.println();
  }

  public static void goodbye(){ //farewell message for user
    System.out.println("          -------------------------------         ");
    System.out.println("          |                             |         ");
    System.out.println("          |    See you next lecture!    |         ");
    System.out.println("          |                             |         ");
    System.out.println("          -------------------------------         ");
    System.out.println();
  }
}
