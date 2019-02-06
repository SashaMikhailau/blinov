package com.azya.blinov.topic1b.ex7;

import com.azya.blinov.utils.PrintUtils;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    int[] ints = PrintUtils.getInts();
    for (int i = 0; i < ints.length; i++) {
      ints[i] = Math.abs(ints[i]);
    }
    Arrays.sort(ints);
    int nod = Math.abs(ints[0]);
    if (nod == 0) {
      System.out.println("Для нуля НОД и общее кратное не вычислимо");
      return;
    }
    int nok = Math.abs(ints[ints.length - 1]);

    for (int i = nod; i > 0; i--) {
      boolean broken = false;
      for (int anInt : ints) {
        if (anInt % i != 0) {
          broken = true;
          break;
        }
      }
      if (!broken) {
        nod = i;
        break;
      }
      }
    boolean foundedNok = false;
    for (int i = nok; i < Integer.MAX_VALUE; i++) {
      boolean broken = false;
      for (int anInt : ints) {
        if (i%anInt != 0) {
          broken = true;
          break;
        }
      }
      if (!broken) {
        nok = i;
        foundedNok = true;
        break;
      }
    }
    System.out.printf("Наибольший общий делитель - %d%n наименьшее общее кратное -%s",nod,
            foundedNok?String.valueOf(nok):"НЕ НАЙДЕНО В ПРЕДЕЛАХ INT");
    }
  }

