package com.azya.blinov.topic1.ex4;

import java.util.Scanner;

public class Main {
  private static final String PASSWORD = "reqwvasvas";

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter password:");
      while (scanner.hasNext()) {
        String line = scanner.next();
        if (PASSWORD.equals(line)) {
          System.out.println("Password is valid");

          break;
        }
        System.out.println("Enter password:");
      }
    }
  }
}
