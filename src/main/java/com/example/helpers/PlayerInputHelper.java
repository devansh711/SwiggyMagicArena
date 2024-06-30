package com.example.helpers;

import java.util.Scanner;

import com.example.entities.Player;

public class PlayerInputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static Player createPlayerFromUserInput(String playerName) {
        System.out.println("Enter details for " + playerName + ":");
        System.out.print("Enter health: ");
        int health = getUserInput();
        System.out.print("Enter strength: ");
        int strength = getUserInput();
        System.out.print("Enter attack: ");
        int attack = getUserInput();

        return new Player(playerName, health, strength, attack);
    }

    private static int getUserInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input <= 0) {
                    System.out.println("Value must be greater than 0. Please try again.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return input;
    }
}
