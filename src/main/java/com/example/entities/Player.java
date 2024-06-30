package com.example.entities;

public class Player {

  //Variables
  private String name;
  private int health;
  private int strength;
  private int attack;

  //Constructor to initialize the variables
  public Player(String name, int health, int strength, int attack) {  
      if(health <= 0 || strength <= 0 || attack <= 0) {
        throw new IllegalArgumentException("Health, Strength and Attack must be greater than 0");
      }
      this.name = name;
      this.health = health;
      this.strength = strength;
      this.attack = attack;
  }

  //Getters
  public int getHealth() { 
      return health;
  }

  public int getAttack() {
      return attack;
  }

  public int getStrength() {
      return strength;
  }

  public String getName() {
      return name;
  }

  //Methods
  public void takeDamage(int damage) {
      health -= damage;
      if (health < 0) {
          health = 0;
      }
  }

  public boolean isAlive() {
      return health > 0;
  }

  @Override
  public String toString() {
      return "Name: " + name + ", Health: " + health + ", Strength: " + strength + ", Attack: " + attack;
  }
}