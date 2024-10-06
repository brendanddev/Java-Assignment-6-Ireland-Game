package test;

import java.util.Random;

/**
 * This class represents the super class in the hierarchy of inheritance. It represents the instance variables and methods
 * that all inhabitants in the world of ballybeg will share. It initializes the name, strength, agility, health, and in
 * some cases the pack each inhabitant will have. This class serves as the starter model, where other class will inherit
 * from as all types of inhabitants will share similar qualities. (Will have the 'is a' relationship).
 *
 * @author BRENDAN DILEO
 */
public class Inhabitant {
    // Instance Variables:
    /**
     * 'name', of type String, represents the name of each Inhabitant.
     */
    private String name;
    /**
     * 'strength' of type int, will represent the strength rating of each inhabitant from 0 - 10.
     */
    private int strength;
    /**
     * 'agility' of type int, will represent the agility rating of each inhabitant from 0 - 10.
     */
    private int agility;
    /**
     * 'health' of type int, will represent the health rating of each inhabitant from 0 - 10.
     */
    private int health;
    /**
     * 'pack' of type Pack, will represent the pack the inhabitant had plead allegiance to, this will be used for
     * werewolf's or witches. Only werewolf's or witches will have the option to be in a pack.
     */
    private Pack pack;

    /**
     * This is the first constructor that sets the instance variables upon initialization. It will take all four variables
     * as parameters, and when an instance of the class is created using this constructor, all the variables are set in
     * the initialization of the instance.
     *
     * @param name, the name of the inhabitant.
     * @param strength, the inhabitant strength rating.
     * @param agility, the inhabitant agility rating.
     * @param health, the inhabitant health rating/health points.
     */
    public Inhabitant(String name, int strength, int agility, int health) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
    }

    /**
     * This is the second constructor where only the name is set, and the rest of the variables will be randomly set upon
     * the initialization of the instance. An instance of the random class is used, to generate a random integer from 0
     * to 10 for the strength, agility, and health rating. The bound is 11 as the bound will be exclusive therefore it
     * generates a value from 0 - 10.
     *
     * @param name, the name of the inhabitant.
     */
    public Inhabitant(String name) {
        this.name = name;
        // Instance of the random class to generate the number between 1 - 10, where the bound is 11.
        Random random = new Random();
        this.strength = random.nextInt(11);
        this.agility = random.nextInt(11);
        this.health = random.nextInt(11);
    }

    /**
     * This method is used to retrieve (get) the name of the inhabitant.
     *
     * @return name, the name of the inhabitant.
     */
    public String getName() {
        return name;
    }

    /**
     * This method will be used to retrieve (get) the strength rating of an inhabitant.
     *
     * @return strength, the strength rating of an inhabitant.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * This method is used to set the strength rating of an inhabitant. This will be used as some inhabitants will not
     * be able to have a strength rating of less than 5.
     *
     * @param strength, the strength rating of the inhabitant.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * This method retrieves (gets) the agility rating of an inhabitant.
     *
     * @return agility, the agility rating of an inhabitant.
     */
    public int getAgility() {
        return agility;
    }

    /**
     * This method will be used to set the agility rating of an inhabitant. Similarly to the set strength method, it is
     * used to ensure that some inhabitants cannot have a agility rating of less than 5.
     *
     * @param agility, the agility rating of the inhabitant.
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * This method will be used to retrieve (get) the health rating of an inhabitant.
     *
     * @return health, the inhabitants health rating.
     */
    public int getHealth() {
        return health;
    }

    /**
     * This method is used to set the inhabitants health rating. It is going to be useful to ensure that some inhabitants
     * are not created with a health rating of less than 5.
     *
     * @param health, the inhabitants health rating.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This method allows to increase an inhabitants strength by 1 when called upon, as the assignment mentions that the
     * attributes can be raised by 1 point at a time. The if statement ensures that the strength does not exceed 10.
     */
    public void strengthIncrease() {
        if (this.strength < 10) {
            this.strength++;
        }
    }

    /**
     * This method allows to decrease an inhabitants strength by 1 when called upon, as the assignment mentions that the
     * attributes can be lowered by 1 point at a time. The if statement ensures that the strength does not drop below 1.
     */
    public void strengthDecrease() {
        if (this.strength > 1) {
            this.strength--;
        }
    }

    /**
     * This method allows to increase an inhabitants agility by 1 when called upon, as the assignment mentions that the
     * attributes can be raised by 1 point at a time. The if statement ensures that the agility does not exceed 10.
     */
    public void agilityIncrease() {
        if (this.agility < 10) {
            this.agility++;
        }
    }

    /**
     * This method allows to decrease an inhabitants agility by 1 when called upon, as the assignment mentions that the
     * attributes can be lowered by 1 point at a time. The if statement ensures that the agility does not drop below 1.
     */
    public void agilityDecrease() {
        if (this.agility > 1) {
            this.agility--;
        }
    }

    /**
     * This method allows to increase an inhabitants health by 1 when called upon, as the assignment mentions that the
     * attributes can be raised by 1 point at a time. The if statement ensures that the health does not exceed 10.
     */
    public void healthIncrease() {
        if (this.health < 10) {
            this.health++;
        }
    }

    /**
     * This method allows to decrease an inhabitants health by 1 when called upon, as the assignment mentions that the
     * attributes can be lowered by 1 point at a time. The if statement ensures that the health does not drop below 1.
     */
    public void healthDecrease() {
        if (this.health > 1) {
            this.health--;
        }
    }

    /**
     * This method which returns a boolean value is useful for determining if the inhabitant is alive, or if the inhabitant
     * is dead. It will check if the inhabitants health is greater than 0, which means they are alive. If this is not true,
     * this means the inhabitant is dead.
     *
     * @return true, if health is greater than 0. False, if the inhabitants health is 0, or less.
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * This method is used to set the pack of the inhabitant. This will be used to help add an inhabitant to a pack.
     *
     * @param pack, the pack of the inhabitant.
     */
    public void setPack(Pack pack) {
        this.pack = pack;
    }

    /**
     * The 'attack' method will serve as the default attack method that all inhabitants will share. Most of the subclasses
     * will just inherit this class, but some may override it. Its purpose is to simulate the attack between the attacker
     * (the one performing the attack), and the player (one taking/defending the attack). The method takes an inhabitant
     * as a parameter, and first uses an if statement to check if the attacker and the player (inhabitant) are in the
     * same pack by checking if the attackers pack is not null, and the attackers pack is the same as the players
     * (one being attacked) pack. If this evaluates to true, meaning they are in the same pack, the attack method cannot
     * be used as the assignment states that inhabitants of the same pack cannot attack each-other, which is why the
     * friendly fire line is then printed to the console. If the attacker, and the player are not in the same pack, the
     * body of the else statement is executed, and a variable 'damageScore' is initialized to the average of the strength,
     * agility, and health of the attacker. The inner if statement checks if the attacker is alive by calling the 'isAlive'
     * method, and then does the same for the player. If both are still alive, the attack proceeds and calls upon the
     * 'defend' method passing the 'damageScore' as an argument which actually deals the damage. If either the attacker
     * or the player (defender) are not alive, a string is printed to the console saying that one of the two are not alive
     * and the attack cannot be done.
     *
     * @param player, the one inhabitant who will be the one being attacked.
     */
    public void attack(Inhabitant player) {
        // Checks if the attacker is in a pack, and if the player being attacked are in the same pack.
        if (pack != null && pack == player.pack) {
            // If they are, the method cannot go on as the assignment clearly states members of the same pack cannot
            // attack each other, the system prints the corresponding line.
            System.out.println("Friendly fire! Cannot attack other Pack members!");
        // If the attacker and player being attacked are not in the same pack, the else block is executed.
        } else {
            // The damage score 'damageScore' is assigned to the average of the inhabitants attributes.
            int damageScore = (getStrength() + getAgility() + getHealth()) / 3;
            // Checks if the attacker is alive.
            if (isAlive()) {
                // Checks if the player being attacked is alive.
                if (player.isAlive()) {
                    // System prints the damage the attacker will be dealing.
                    System.out.println("Damage Dealt: " + damageScore);
                    // The player being attacked calls upon the defend method to defend against the attack.
                    player.defend(damageScore);
                // Inner else block will be executed if the player is dead.
                } else {
                    System.out.println("You cannot attack this player! They are not alive!");
                }
            // Outer else block will be executed if the attacker is dead.
            } else {
                System.out.println("Cannot attack this player! You are dead!");
            }
        }
    }

    /**
     * This method is responsible for serving as the default 'defend' method which all inhabitants will inherit/share.
     * The purpose of this method will be to simulate the defense an inhabitant will have to take the attack coming from
     * the 'attack' method. It will take a single parameter 'damage' of type int, representing the damage rating the
     * attacker will be attacking with. First the method checks if the inhabitant attempting to defend from the attack
     * is still alive, if they are, a new variable 'defenseScore' representing the defense value of the inhabitant is
     * initialized to a random value between 1 - 10 using the 'Math.random' method, and then casted to an int. A new
     * variable 'damageDealt' is then initialized to the result of dividing the damage the attacker will be attacking with
     * by the randomly generated defense value which represents the amount of damage that the defender will actually
     * take. The assignment mentions that if the damage the defender takes is less than 1, than they will be only taking
     * 1 damage, which is why the if statement checks if the damage the defender is taking is less than 1, and if it is
     * assigns the damage to 1. A variable 'health' is initialized to the value of the defenders current health
     * subtracted by the damage the defender is taking. To avoid negative values, the if statement also checks if the
     * health is less than 0, and if it is, the health is juts assigned to 0. The defenders health is then re-assigned
     * to the health they will have after the attack using the 'setHealth' method. The else statement ensures that if
     * thew defender already has a health of 0, then a line is printed to the console saying that they cannot defend.
     *
     * @param damage, the amount of damage that the defender will be defending against.
     */
    public void defend(int damage) {
        // Checks if the defender is alive.
        if (isAlive()) {
            // Uses the 'Math.random' method to generate a random value between 1 - 10 as the defense score, this value
            // is casted to an integer to prevent decimals, and saved into the 'defenseScore' variable.
            int defenseScore = (int) (Math.random() * 10) + 1;
            // The system prints the randomly generated value for the defense score the defender will have.
            System.out.println("Defense Value: " + defenseScore);

            // The damage that will be dealt is equal to the damage being done by the attacker, divided by the randomly
            // generated defense score.
            int damageDealt = damage / defenseScore;
            // Checks if the damage that will be done is less than 1.
            if (damageDealt < 1) {
                // If it is, the damage dealt is just assigned to 1 to prevent no damage or decimals.
                damageDealt = 1;
            }
            // System prints out the actual amount of damage the defender will be taking.
            System.out.println("Damage Taken: " + damageDealt);
            // The defenders health will be the defenders current health, subtracted by the damage they will be taking
            // using the 'getHealth' method.
            int health = getHealth() - damageDealt;
            // Checks if the health the defender has is less than 0.
            if (health < 0) {
                // If it is, their health will jst be set to 0 to avoid negative numbers.
                health = 0;
            }
            // Calls upon the 'setHealth' method passing 'health' as a parameter to set the defenders new health after
            // being attacked. This further simulates the action of the defender being attacked.
            setHealth(health);
            // Else block will be executed if the defender is already dead.
            } else {
                System.out.println("Cannot defend! Player is already dead!");
            }
        }

    /**
     * The 'toString' method is used to provide a string representation of the inhabitants overall status. This string
     * will include the class name, the given name, strength rating, agility rating, health rating, and alive status of
     * the inhabitant. It uses line breaks for clarity and readability purposes. As the assignment asks, the toString
     * includes the name of the class, their alive status, and each rating. Initially I was only using the '.getClass'
     * method which was always giving me the package name and then the class, so I added the 'getSimpleName' method
     * following the 'getClass' method so that only the actual class name is shown and not the package. The 'getSimpleName'
     * method is inheriting from the 'class' java class which I found on the java API.
     *
     * @return String, a string representation of the inhabitant's status.
     */
    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "\n" +
                "Name/Type: " + name  + "\n" +
                "Strength: " + strength + "\n" +
                "Agility: " + agility + "\n" +
                "Health: " + health + "\n" +
                "Alive: " + isAlive() + "\n";
    }
}
