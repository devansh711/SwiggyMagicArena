package com.example;


import com.example.entities.Player;
import com.example.helpers.BattleHelper;
public class MagicalArenaTest {

public static void main(String[] args) {
  testAddPlayer();
  testFight();
  testPlayerVictory();
  System.out.println("All tests passed.");
}

public static void testAddPlayer() {
  Player player = new Player("Hero", 100, 50, 20);
  assert player.getHealth() == 100 : "Health should be 100";
  assert player.getStrength() == 50 : "Strength should be 50";
  assert player.getAttack() == 20 : "Attack should be 20";
}

public static void testFight() {
  Player playerA = new Player("PlayerA", 50, 5, 10);
  Player playerB = new Player("Player B", 100, 10, 5);
  int initialHealth = playerB.getHealth();
  BattleHelper.fight(playerA, playerB);
  assert playerB.getHealth() < initialHealth : "Player B's health should be reduced after the fight";
}

public static void testPlayerVictory() {
  Player playerA = new Player("Player A", 50, 5, 10);
  Player playerB = new Player("Player B", 100, 10, 5);
  boolean playerAWins = false;
  boolean playerBWins = false;

  while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
      if (playerA.getHealth() < playerB.getHealth()) {
          BattleHelper.fight(playerA, playerB);
          if (playerB.getHealth() <= 0) {
              playerAWins = true;
              break;
          }
          BattleHelper.fight(playerB, playerA);
          if (playerA.getHealth() <= 0) {
              playerBWins = true;
              break;
          }
      } else {
          BattleHelper.fight(playerB, playerA);
          if (playerA.getHealth() <= 0) {
              playerBWins = true;
              break;
          }
          BattleHelper.fight(playerA, playerB);
          if (playerB.getHealth() <= 0) {
              playerAWins = true;
              break;
          }
      }
  }

  assert playerAWins || playerBWins : "One of the players should win";
  if (playerAWins) {
      System.out.println("Player A wins!");
  } else if (playerBWins) {
      System.out.println("Player B wins!");
  }
}
}