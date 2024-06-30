# Magical Arena

Magical Arena is a simple turn-based battle simulation between two players. Each player has health, strength, and attack attributes, and they take turns attacking each other until one player's health reaches zero. The game decides the initial attacker based on the health of the players, with the player having lesser health attacking first.

## Classes and Methods

### Player Class

The `Player` class represents a player in the game.

#### Attributes
- `name`: The name of the player.
- `health`: The health points of the player.
- `strength`: The strength of the player, which is used in defense.
- `attack`: The attack power of the player.

#### Methods
- `Player(String name, int health, int strength, int attack)`: Constructor to initialize the player's attributes.
- `int getHealth()`: Returns the current health of the player.
- `void takeDamage(int damage)`: Reduces the player's health by the specified damage amount.
- `int getAttack()`: Returns the attack power of the player.
- `int getStrength()`: Returns the strength of the player.
- `boolean isAlive()`: Returns `true` if the player's health is greater than zero.
- `String getName()`: Returns the name of the player.
- `String toString()`: Returns a string representation of the player's attributes.

### Die Class

The `Die` class represents a six-sided die.

#### Methods
- `static int roll()`: Returns a random integer between 1 and 6.

### Battle Class

The `Battle` class handles the combat logic between two players.

#### Methods
- `static void fight(Player attacker, Player defender)`: Simulates a fight between the attacker and the defender. The attacker rolls a die to determine attack damage, and the defender rolls a die to determine defense strength. The defender takes damage based on the difference between the attack damage and the defense strength.

### MagicalArena Class

The `MagicalArena` class contains the main method to start the game.

#### Methods
- `public static void main(String[] args)`: The entry point of the program. It initializes two players and simulates the battle until one player wins. The game alternates attacks between players.

#### Instructions to run the code

### Run the Magical Arena simulation
Navigate to `MagicalArena.java` and right click to click on `Run Java`, then give inputs in console for plaayers and then battle will begin between players.

### Run unit test cases
Navigate to `PlayerTest.java` file and right click to click on `Run Tests in current file` and then test cases will execute.

