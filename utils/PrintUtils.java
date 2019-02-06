package com.azya.blinov.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PrintUtils {

  public static int[] getInts() {

    try (Scanner scanner = new Scanner(System.in)) {
      int[] numbers;
      System.out.println("Введите целые числа через пробел");
      while (true) {
        try {
          String line = scanner.nextLine();
          if (line.isEmpty()) {
            throw new RuntimeException("Empty Line");
          }
          numbers = Pattern
                  .compile("\\s+")
                  .splitAsStream(line)
                  .filter(s -> !s.isEmpty())
                  .mapToInt(Integer::valueOf)
                  .toArray();
          if (numbers.length == 0) {
            throw new RuntimeException("Числа удовлетворяющие улосвию не введены");
          }
          break;

        } catch (Exception e) {
          System.out.printf("Ошибка: %s%n",e.getMessage());
          System.out.println("Введите целые числа еще раз:");
        }
      }
      return numbers;
    }
  }
  }

