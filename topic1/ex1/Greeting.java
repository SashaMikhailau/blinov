package com.azya.blinov.topic1.ex1;

import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
    String name = "default";
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        name = scanner.nextLine();
        if (!name.isEmpty()) {
          break;
        }
      }
      System.out.printf("Hello, %s%n",name);
      }
    }

  }

