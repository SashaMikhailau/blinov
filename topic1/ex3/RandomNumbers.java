package com.azya.blinov.topic1.ex3;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int nNumbers=0;
      try {
        while (true) {
          nNumbers = scanner.nextInt();
          break;
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      int[] arrayOfNumbers = getRandomNumbers(nNumbers);
      for (int arrayOfNumber : arrayOfNumbers) {
        System.out.print(arrayOfNumber+" ");
      }

    }
  }

  public static int[] getRandomNumbers(int count) {
    return new Random()
            .ints(-100, 100)
            .limit(count)
            .toArray();
  }
}
