package com.azya.blinov.topic1b.ex2;

import com.azya.blinov.utils.PrintUtils;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    int[] numbers = PrintUtils.getNumbers();
    IntSummaryStatistics intSummaryStatistics = IntStream.of(numbers).summaryStatistics();
    System.out.printf("Минимальное из введенных чисел:%d%n",intSummaryStatistics.getMin());
    System.out.printf("Максимальное из введенных чисел:%d",intSummaryStatistics.getMax());
  }
}
