package com.azya.blinov.topic1b.ex6;

import com.azya.blinov.utils.PrintUtils;

public class Main {
  public static void main(String[] args) {
    int[] ints = PrintUtils.getInts();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < ints.length; i++) {
      int number = Math.abs(ints[i]);
      int firstNumber = number / 100;
      if (firstNumber > 9 || firstNumber == 0) {
        continue;
      }
      number %= 100;
      int secondNumber = number / 10;
      int thirdNumber = number % 10;
      if (firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber) {
        continue;
      }
      sb.append(ints[i]).append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.printf("Трехзначные числа с разными цифрами : %s", sb.toString());
  }
}
