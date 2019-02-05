package com.azya.blinov.topic1.ex6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDateTime start = LocalDateTime.now();
    LocalDateTime end = LocalDateTime.now();
    String name = "Mihailov";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'at' hh:mm");
    System.out.printf("Task made by %s- task started:%s, ended:%s",name,formatter.format(start),formatter.format(end));
  }
}
