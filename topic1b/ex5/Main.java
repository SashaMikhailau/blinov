package com.azya.blinov.topic1b.ex5;

import com.azya.blinov.utils.PrintUtils;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] ints = PrintUtils.getInts();
    for (int i = ints.length-1; i >0; i--) {
      for (int j = 0; j < i; j++) {
        if (Math.abs(ints[j]) < Math.abs(ints[j + 1])) {
          int temp = ints[j];
          ints[j] = ints[j + 1];
          ints[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(ints));
  }
}
