package com.example.entities;
import java.util.Random;

public class Die {
  private static final Random random = new Random();

  public static int roll() {
      return random.nextInt(6) + 1; // 1 to 6 sided die
  }
}