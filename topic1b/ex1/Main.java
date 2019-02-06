package com.azya.blinov.topic1b.ex1;

import com.azya.blinov.utils.PrintUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    int[] numbers = PrintUtils.getInts();


    Map<Boolean, List<Integer>> map = IntStream.of(numbers).boxed().collect(Collectors.partitioningBy(i ->
            i % 2 == 0));
    String even = map.get(true).stream().map(String::valueOf).collect(Collectors.joining(" "));
    String odd = map.get(false).stream().map(String::valueOf).collect(Collectors.joining(" "));
    System.out.printf("Четные: %s%n",even);
    System.out.printf("Нечетные: %s%n",odd);



  }
}
