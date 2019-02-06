package com.azya.blinov.topic1b.ex3;



import com.azya.blinov.utils.PrintUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    int[] numbers = PrintUtils.getInts();
    String result = Arrays.stream(numbers)
            .filter(i -> i % 3 == 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.printf("Делятся на 3 и на 9 числа: %s",result);
  }
}
