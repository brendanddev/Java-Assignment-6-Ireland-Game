package test;

import java.util.Random;

/**
 * This class represents a subclass of the human class, which in the case of the inheritance hierarchy, is the immediate
 * super class as the healer class extends (inherits from) the human class. The class represents one of the types of humans
 * that can be found in the town of ballybeg. It inherits all methods from the human class, and since the human class
 * inherits from the inhabitant class, this class also inherits the inhabitants class methods. This class will offer an
 * additional instance variable 'magicRating', because a healer will have a magic rating. The healer will also have an
 * additional ability that only a healer can use which will be a method restricted to the healer. The class will consist
 * of methods for getting the healers magic rating, setting the magic rating, and also the method to actually use its
 * heal power. The heal method relies on the healer, and player being healed to be alive, and the healer must have enough
 * magic to perform a heal, as it will cost the healer 1 magic per heal.
 *
 * @author BRENDAN DILEO
 */

public class Healer extends Human {
    // Instance Variables:
    /**
     * 'magicRating' of type int, represents the magic rating a healer will have.
     */
    private int magicRating;

    /**
     * This is the first constructor of the healer class that can be used to create an instance of a healer. The purpose
     * of this constructor will be to allow all instance variables to be set upon creating an instance of a healer.
     * Inside the body of this constructor is a call to the immediate super class (human class) all variable constructor,
     * which in turn makes a call to the human class's super class (inhabitant class) in order to initialize all variables
     * which are inherited. Additionally, this constructor will take an additional parameter 'magicRating' representing
     * the instance variable that is only required for the healer. The magic rating will be set to the value that is
     * passed to the constructor with the use of the 'this' keyword.
     *
     * @param name, the name of the healer.
     * @param strength, the healers strength rating.
     * @param agility, the healers agility rating.
     * @param health, the healers health rating.
     * @param magicRating, the healers magic rating.
     */
    public Healer(String name, int strength, int agility, int health, int magicRating) {
        super(name, strength, agility, health);
        this.magicRating = magicRating;
    }

    /**
     * This is the second constructor of the healer class that can be used to create an instance of the healer. The purpose
     * of this constructor is so only the name is initialized upon creating an instance of the class, and the remaining
     * variables are all set to random values between 1 - 10. The constructor makes a call to the immediate super class
     * (human class) name only constructor, and through the inheritance hierarchy makes a call to the inhabitant class's
     * name only constructor. This is so everything other than name, is set to a random value. Additionally, the constructor
     * also creates an instance of the random class, so that the healers magic rating, which is not set in any of the super
     * class's is also set to a random integer between 1 - 10 with the use of the 'this' keyword.
     *
     * @param name, the name of the healer.
     */
    public Healer(String name) {
        super(name);
        // Instance of the random class.
        Random random = new Random();
        // Assigns the healers magic rating to a random value.
        this.magicRating = random.nextInt(11);
    }

    /**
     * This method is used to retrieve (get) the healers magic rating.
     *
     * @return magicRating, the healers magic rating.
     */
    public int getMagicRating() {
        return magicRating;
    }

    /**
     * This method is used to set (change) the healers magic rating.
     *
     * @param magicRating, the magic rating that the healer will now have.
     */
    public void setMagicRating(int magicRating) {
        this.magicRating = magicRating;
    }

    /**
     * The purpose of this method is to allow the healer to use its special power that is limited to only healers. The
     * method will take one parameter 'player' of type inhabitant representing the player being healed, as the healer
     * has the option to heal any of the inhabitants in the town of ballybeg as long as the healers magic rating is high
     * enough, and both the healer and the player needing to be healed are alive. The method starts by using an if statement
     * to ensure that the healer is alive, and the next if statement checks that the player being healed is still alive,
     * as the assignment mentions although a healer has the option to heal a player, they can not bring them back from
     * the dead. If these conditions evaluate to true, a variable 'healingScore' is declared representing the amount of
     * healing that the healer will give to a player. The inner if statement checks if the healers magic rating is equal
     * to, or greater than 1, using the 'getMagicRating' method, as the healer will require at least 1 magic rating or
     * more, to perform a heal. The if statement nested into the magic rating if statement is checking if the players
     * health is already at 10, as the healer will not heal a player with full health. If this condition is true, meaning
     * the players health is already at 10, the system will print the corresponding line, and exit the method with the
     * use of the return statement. If this condition evaluates to false, the variable 'healingScore' is then assigned to
     * the result of dividing the healers magic rating by 2.5, as the score in which the healer can heal by is equal to
     * their magic rating divided by 2.5. The healers magic rating is then decremented by 1 with the use of the
     * 'setMagicRating' method, because each heal the healer performs, they will lose 1 magic rating. The variable
     * 'healingApplied' represents the value casted to an integer to avoid decimals, and 'maxHealth' is assigned to the
     * players current health using the 'getHealth' method from the inhabitant class, added to the healing the user is
     * getting. The 'maxHealth' variable is then checked if it exceeds 1- using an if statement, as before implementing
     * this sometimes a player would have a health greater than 10 after they were healed. The if statement ensures that
     * if the players health exceeds 10, it is just set to 10. The players health is then set to the healing they have
     * received using the 'setHealth' method. The else statements are used to check the initial if statements, printing
     * to the system if the healers magic is too low, or if either of the healer or player is dead meaning the heal can
     * not take place.
     *
     * @param player, the inhabitant being healed.
     */
    public void heal(Inhabitant player) {
        // Checks if the healer is alive.
        if (isAlive()) {
            // Checks if the player being healed is alive.
            if (player.isAlive()) {
                double healingScore;
                // Checks if the healers magic rating is equal to, or greater than 1.
                if (getMagicRating() >= 1) {
                    // Checks if players health is already at 10 as the health cannot surpass a value of 10.
                    if (player.getHealth() >= 10) {
                        System.out.println("The players health is already at 10!");
                        return;
                    }
                    // The amount of healing the healer will perform is equal to the magic rating divided by 2.5.
                    healingScore = getMagicRating() / 2.5;
                    // Casts the value to an integer. Needed to use 'Math.ceil' as I was having division by 0 errors.
                    int healingApplied = (int) Math.ceil(healingScore);
                    // Calculates the health the player will get.
                    int maxHealth = player.getHealth() + healingApplied;
                    // Ensures the health does not exceed 10.
                    if (maxHealth > 10) {
                        maxHealth = 10;
                    }
                    // Sets the players health to the new amount after being healed.
                    player.setHealth(maxHealth);
                    // Healer loses 1 magic rating per heal.
                    setMagicRating(getMagicRating() - 1);
                } else {
                    System.out.println("The healers magic is too low! They cannot heal the player!");
                }
            } else {
                System.out.println("The player is dead! They cannot be revived!");
            }
        } else {
            System.out.println("The healer is dead! They cannot heal from the dead!");
        }
    }

    /**
     * This method is used to provide a string representation of the healer. Inside the method, a call is made to the super
     * class using the 'super' keyword. In terms of inheritance, this is calling the human class 'toString' method, and
     * in turn calling the inhabitants class 'toString' method. However, the method will concatenate the super class
     * 'toString' method with the healers magic rating, because despite the healer being a human and inhabitant, it will
     * offer an additional variable 'magicRating' which is not part of the super classes 'toString' as this is strictly
     * apart of the healer class. The method will return a string, which includes the healers magic rating.
     *
     * @return a string, which is the string representation of the healer class.
     */
    @Override
    public String toString() {
        return super.toString() +
        "Magic Rating: " + getMagicRating();
    }
}
