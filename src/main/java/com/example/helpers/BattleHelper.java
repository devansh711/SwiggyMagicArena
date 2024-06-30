package com.example.helpers;

import com.example.entities.Die;
import com.example.entities.Player;

public class BattleHelper {
  public static void fight(Player attacker, Player defender) {
      final int attackRoll = Die.roll();
      final int defenseRoll = Die.roll();

      final int attackDamage = attacker.getAttack() * attackRoll;
      final int defenseStrength = defender.getStrength() * defenseRoll;

      final int damageTaken = Math.max(0, attackDamage - defenseStrength);
      defender.takeDamage(damageTaken);

      System.out.println(attacker.getName() + " attacks " + defender.getName());
      System.out.println(attacker.getName() + " rolls " + attackRoll + ", " + defender.getName() + " rolls " + defenseRoll);
      System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
      System.out.println(defender.getName() + "'s health reduced by " + damageTaken + " to " + defender.getHealth() + "\n");
  }
}