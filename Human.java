package test;

/**
 * This class is another subclass of the inhabitant class (super class) and represents a human in the town of ballybeg.
 * It inherits from the inhabitant class as a human will be a type of inhabitant. This class will serve as a foundation
 * for the different types of humans that can be created, but currently will feature no additional methods or variables.
 * The purpose of this class is so the type of human can be manipulated by inheriting from this class, while also inheriting
 * from the inhabitant class. This class will not have an association with the pack class, as humans do not have the
 * option to be in a pack.
 *
 * @author BRENDAN DILEO
 */

public class Human extends Inhabitant {

    /**
     * This is the first constructor of the human class that can be used to create an instance of a human. The purpose of
     * this constructor is to allow all instance variables to be set upon creating an instance of the human class. The
     * constructor makes a call to the super class (inhabitant class) all variable constructor to initialize all variables
     * inherited from the super class. This constructor will take no additional parameters other than the ones inherited
     * from the super class constructor, and will have no if statements as there are no restrictions on the ratings the
     * human can be created with.
     *
     * @param name, the name of the human.
     * @param strength, the humans strength rating.
     * @param agility, the humans agility rating.
     * @param health, the humans health rating.
     */
    public Human(String name, int strength, int agility, int health) {
        super(name, strength, agility, health);
    }

    /**
     * This is the second constructor of the human class that can be used to create an instance of the human. The purpose
     * of this constructor is so when an instance of the human is created, it can be created with only the name passed
     * as an argument, and the rest of the parameters will be randomly set by calling upon the super classes (inhabitant
     * class) name only constructor, which will set the rest of the variables to a random value between 1 - 10.
     *
     * @param name, the name of the human.
     */
    public Human(String name) {
        super(name);
    }

    /**
     * This method is used to represent a human through a string representation. No additional variables for the method
     * will be declared here, and instead will just make a call to the super class (inhabitant class) 'toString' method
     * using the 'super' keyword. This is done because there is no additional information to provide yet for the human,
     * besides the fact that it is a human.
     *
     * @return a string, which is a string representation of the human class.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
