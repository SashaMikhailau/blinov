package com.azya.blinov.topic1b.ex4;

import com.azya.blinov.utils.PrintUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    int[] numbers = PrintUtils.getInts();
    String result = Arrays.stream(numbers)
            .filter(i -> i % 5 == 0 && i % 7 == 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.printf("Делятся на 5 и на 7 числа: %s",result);
  }
}
