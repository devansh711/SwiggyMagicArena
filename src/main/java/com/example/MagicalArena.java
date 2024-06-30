package com.example;

import com.example.entities.Player;
import com.example.helpers.BattleHelper;
import com.example.helpers.PlayerInputHelper;

class MagicalArena {
    public static void main(String[] args) {
        Player playerA = PlayerInputHelper.createPlayerFromUserInput("Player A");
        Player playerB = PlayerInputHelper.createPlayerFromUserInput("Player B");

        System.out.println("Initial States:");
        System.out.println(playerA);
        System.out.println(playerB);
        System.out.println();

        boolean playerATurn = playerA.getHealth() < playerB.getHealth();

        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerATurn) {
                BattleHelper.fight(playerA, playerB);
            } else {
                BattleHelper.fight(playerB, playerA);
            }
            playerATurn = !playerATurn; // Switch turns
        }

        if (!playerA.isAlive()) {
            System.out.println(playerB.getName() + " wins!");
        } else {
            System.out.println(playerA.getName() + " wins!");
        }

        System.out.println("Final States:");
        System.out.println(playerA);
        System.out.println(playerB);
    }
}
