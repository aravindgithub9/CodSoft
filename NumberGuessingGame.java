package com.aravind.www;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    String s = "y";
    int round = 1;
    
    while (s.equalsIgnoreCase("y")) {
      System.out.println("You are in round " + round);
      Random rand_num = new Random();
      int right_guess = rand_num.nextInt(100);
      int maxattempts = 4;
      int attempts = 1;
      int turns = 0;

      Scanner sc = new Scanner(System.in);

      System.out.println("Guess a number between 1 and 100. You have 5 turns.");
      System.out.println("Best of luck!");
      boolean win = false;
      
      while (!win) {
        int guess = sc.nextInt();
        turns++;

        if (guess == right_guess) {
          win = true;
        } else if (attempts > maxattempts) {
          System.out.println("You lose! The right answer was: " + right_guess);
          System.out.println("Enter play again y/n");
          s = sc.next();
          break;
        } else if (guess < right_guess) {
          attempts++;
          System.out.println("Your guess is lower than the right guess! Turns left: " + (5 - (attempts - 1)));
        } else if (guess > right_guess) {
          attempts++;
          System.out.println("Your guess is higher than the right guess! Turns left: " + (5 - (attempts - 1)));
        }
      }
      
      if (win) {
        System.out.println("You win!");
        System.out.println("The number was " + right_guess);
        System.out.println("You used " + turns + " turns to guess the right number");
        System.out.println("Your score is " + ((6 - turns) * 10) + " out of 50");
        System.out.println("Enter play again y/n");
        s = sc.next();
      }
      
      round++;
    }
    
    if (s.equalsIgnoreCase("n")) {
      System.out.println("GAME OVER! Thank you for Playing");
    }
  }
}
