package test;

/**
 * This class represents a subclass of the human class, which in the case of inheritance hierarchy, is the immediate
 * super class as the hunter class extends (inherits from) the human class. This class represents one the other type of
 * human that can be found in the town of ballybeg. This class inherits all the methods from the human class, and because
 * the human class inherits from the inhabitant class, this class will also inherit the methods from the inhabitant class.
 * This class will offer no additional instance variables because the hunter will consist of the same attributes of the
 * inhabitant class, but the attack method will be overridden because when a hunter attacks, it will do twice the damage
 * the other inhabitants do.
 *
 * @author BRENDAN DILEO, 000879513
 */
public class Hunter extends Human {

    /**
     * This is the first constructor of the hunter class that can be used to create an instance of the hunter. The purpose
     * of this constructor will be to allow all instance variables to be set upon creating an instance of the hunter class.
     * In the body of this constructor, a call is made to the immediate super class (human class) all variable constructor,
     * which in turn will make a call to the human class's super class (inhabitant class) in order to initialize all the
     * variables inherited through the inheritance hierarchy.
     *
     * @param name, the name of the hunter.
     * @param strength, the hunters strength rating.
     * @param agility, the hunters agility rating.
     * @param health, the hunters health rating.
     */
    public Hunter(String name, int strength, int agility, int health) {
        super(name, strength, agility, health);
    }

    /**
     * This is the second constructor of the hunter class that can be used to create an instance of the hunter. The purpose
     * of this constructor is so only the name is initialized upon creating an instance of the hunter, and the remaining
     * variables are all set to random values between 1 - 10. Inside the body of the constructor a call is made to the
     * immediate super class's (human class) name only constructor, which in turn will make a call to the human class's
     * super class (inhabitant class) in order to generate random values for all the variables except the name through
     * the hierarchy of inheritance.
     *
     * @param name, the name of the hunter.
     */
    public Hunter(String name) {
        super(name);
    }

    /**
     * This 'attack' method overrides the default attack method from the inhabitant class, as the hunters attack with
     * slightly differ from the attack that all inhabitants will share. The hunters attack method will implement the same
     * logic for the most part, however the hunter will do twice the damage that any other inhabitant will do. Like the
     * regular attack method, this will be used to simulate the attack between the hunter (attacker), and the player
     * (the one defending the attack). The method will take a single parameter 'player' of type inhabitant, which will
     * represent the player being attacked. The variable 'damageScore' is assigned to the result of the average of the
     * hunters overall attributes, representing the amount of damage the hunter can do. The if statements then ensure that
     * both the hunter, and the player being attacked are alive, and if both conditions evaluate to true, a variable
     * 'damageDealt' is initialized to the value of the damage score multiplied by 2, to represent the damage that will
     * be dealt by the hunter as it will do twice the regular damage. The player then calls upon the defend method from
     * the inhabitant class to defend the attack, and the amount of damage dealt is passed to the method as an argument.
     * The else statements ensure that if either the hunter, or the defender are dead, that the attack does not go through,
     * and instead the system prints the corresponding line.
     *
     * @param player, the inhabitant being attacked.
     */
    @Override
    public void attack(Inhabitant player) {
        // Calculates average of the attackers attributes to determine damage.
        int damageScore = (getStrength() + getAgility() + getHealth()) / 3;
        // Checks to see if the attacker is alive before proceeding.
        if (isAlive()) {
            // Checks to see if the player being attacked is alive before proceeding.
            if (player.isAlive()) {
                // The damage the hunter deals is equal to the result of the initial damage multiplied by 2.
                int damageDealt = damageScore * 2;
                // System prints the damage the hunter will be dealing.
                System.out.println("Damage Dealt: " + damageDealt);
                // The player being attacked attempts to defend the attack by calling the 'defend' method.
                player.defend(damageDealt);
            // Executes if the player being attacked is dead.
            } else {
                System.out.println("Cannot attack this player! They are dead!");
            }
            // Executes if the hunter is dead.
        } else {
            System.out.println("Hunter cannot attack! They are dead!");
        }
    }

    /**
     * The purpose of this method is to provide a string representation of the hunter. The method makes a call to the
     * super class with use of the 'super' keyword. In terms of inheritance, this is calling the human class's 'toString'
     * method, and in turn calls the inhabitant class's 'toString' method too. Since the hunter class does not offer any
     * additional instance variables or attributes, all it needs to do is call the 'super' 'toString' method.
     *
     * @return a string, which is the string representation of the hunter class.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}