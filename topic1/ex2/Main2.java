package com.azya.blinov.topic1.ex2;

public class Main2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = args.length - 1; i >= 0; i--) {
      sb.append(args[i]).append(" ");
    }
    if (sb.length() > 0) {
      sb.deleteCharAt(sb.length() - 1);
    }
    System.out.println(sb.toString());
    System.out.println(sb.toString());


  }
}
