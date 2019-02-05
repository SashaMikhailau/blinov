package com.azya.blinov.topic1.ex5;

public class Main {
  public static void main(String[] args) {
    int sum = 0;
    for (String arg : args) {
      sum += Integer.parseInt(arg);
    }
    System.out.printf("Sum of numbers %d",sum);
  }
}
