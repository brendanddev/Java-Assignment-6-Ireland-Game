package test;

/**
 * This class is a subclass of the inhabitant class (super class). It inherits from the inhabitant class, as a werewolf
 * is a type of inhabitant. It inherits all the methods from the inhabitant class, as the werewolf does not have any
 * different attacks, or ways of defending. The werewolf class also is related to the pack class through association.
 * One difference with the werewolf, is that it cannot be created with values less than 5 for its strength, agility, or
 * health. Additionally, since a werewolf can be a part of a pack, the class will also have methods allowing the werewolf
 * to join a pack, but once it is a part of a pack, it cannot leave.
 *
 * @author BRENDAN DILEO
 */
public class Werewolf extends Inhabitant {
    // Instance Variables:
    /**
     * 'packName' of type Pack, represents the name of the pack that the werewolf will be joining, or is apart of.
     */
    private Pack packName;

    /**
     * This is the first constructor, where all instance variables are set upon creating an instance with this constructor.
     * Inside the constructor, a call to the super class constructor is made, which will initialize all the variables
     * which are inherited from the inhabitant class (super class). Inside the body of the constructor, the if statements
     * check to see if the variables have been set to a value lower than 5, as this is not allowed which was mentioned in
     * the assignment, the values are set to 5 using the 'setter' methods from the inhabitant class, and the 'this'
     * keyword to specify it is referring to this instance of the werewolf class.
     *
     * @param name, the name of the werewolf.
     * @param strength, the strength of the werewolf.
     * @param agility, the werewolfs agility.
     * @param health, the werewolfs health.
     * @param packName, the name of the pack the werewolf is apart of.
     */
    public Werewolf(String name, int strength, int agility, int health, Pack packName) {
        super(name, strength, agility, health);
        // Ensures werewolf is not created with a value less than 5 for its attributes.
        if (strength < 5) {
            this.setStrength(5);
        }
        if (agility < 5) {
            this.setAgility(5);
        }
        if (health < 5) {
            this.setHealth(5);
        }
        this.packName = packName;
    }

    /**
     * This is the second constructor where only the name is set when creating an instance of the class with this
     * constructor. The constructor makes a call to the super class, which will call the name only constructor. The rest
     * of the variables will be randomly generated from 0 - 10 as this is what the name only constructor in the super
     * class (inhabitant class) does. Like the first constructor, inside the body of this constructor the if statements
     * ensure that the instance of the class cannot be created with values less than 5, and if they are, a call is made
     * to the setter methods passing 5 as an argument, and using the 'this' keyword to specify it is referring to this
     * instance of the werewolf class. The name of the pack is set to null, as this constructor werewolf will not yet
     * have a pack.
     *
     * @param name, the name of the werewolf.
     */
    public Werewolf(String name) {
        super(name);
        // Ensures werewolf is not created with a value less than 5 for its attributes.
        if (getStrength() < 5) {
            this.setStrength(5);
        }
        if (getAgility() < 5) {
            this.setAgility(5);
        }
        if (getHealth() < 5) {
            this.setHealth(5);
        }
        this.packName = null;
    }

    /**
     * This method is responsible for checking if a werewolf already has pled allegiance to a pack, meaning it already
     * has a pack, and cannot join another. It will return true if the werewolf already has a pack, and will return false
     * if the werewolf does not already have a pack, meaning it is able to join one.
     *
     * @return true, if the werewolf has pled allegiance to a pack. False, if they have not.
     */
    public boolean packAllegiance() {
        return this.packName != null;
    }

    /**
     * This method is responsible for simulating the action/interaction of a werewolf joining a pack. The method will take
     * one parameter 'newPack' of type pack representing the pack the werewolf is joining. Inside the body of the method,
     * the if statement checks if the current werewolf already has a pack using the 'this' keyword and checking if its
     * 'packName' is null. If it is true, meaning the werewolf is already in a pack, then the system will print out a
     * message saying the werewolf is already in a pack, and then will return so the method is exited. If the statement
     * evaluates to false, meaning the werewolf is not already in a pack, the current instance of the werewolfs pack
     * accessed using the 'this' keyword is then assigned to the 'newPack', which is the pack the werewolf has now joined.
     * The werewolf joining the pack is then finalized by calling the 'addWerewolf' method from the pack class, and passing
     * 'this' as argument, where the 'this' keyword represents the current werewolf, and the 'newPack' is the pack the
     * werewolf has now joined.
     *
     * @param newPack, the pack the werewolf is joining.
     */
    public void joinPack(Pack newPack) {
        // Checks if the name of the pack for the current werewolf is not empty, as this would mean the werewolf is
        // already in a pack.
        if (this.packName != null) {
            // If the condition is true, the system prints the corresponding line.
            System.out.println("The werewolf is already in a pack, it cannot join another! Why would you betray your allegiance?!");
            // Method exits using the return statement.
            return;
        }
        // If the pack for the current werewolf is empty, they are assigned to the new pack using the 'this' keyword and
        // setting the 'packName' attribute to the new pack.
        this.packName = newPack;
        // The 'newPack' which is the pack the werewolf is joining then calls the 'addWerewolf' method from the pack class
        // to actually add the werewolf to this pack.
        newPack.addWerewolf(this);
        // The system prints the corresponding line as the werewolf has successfully joined the pack.
        System.out.println("Werewolf has joined the pack!");
    }

    /**
     * This method is responsible for determining if a werewolf is the alpha of the pack. It takes a single parameter
     * 'pack' of type pack, and retrieves (gets) the array of werewolves using the 'getWerewolves' method from the pack
     * class, which  belong to the 'pack', and saves this into the 'werewolves' variable of type werewolf[]. The method
     * then enters a for loop to iterate through the size of this pack, by calling the 'getSizeOfPack' method from the
     * pack class, and for each iteration, the current index 'i' of the array is checked to see if the member at index 'i'
     * is the alpha using the 'getAlphaWolf' method from the pack class. If an alpha is found, the method will return
     * true, and if not, the method will return false. This method relies heavily on the association between the werewolf
     * class, and the pack class.
     *
     * @param pack, the pack of werewolfs.
     * @return true, if an alpha is found. False, if an alpha is not found.
     */
    public boolean isAlpha(Pack pack) {
        // Assigns the werewolves in the pack using the 'getWerewolves' method.
        Werewolf[] werewolves = pack.getWerewolves();
        // Iterates through the number of members in a pack.
        for (int i = 0; i < pack.getSizeOfPack(); i++) {
            // Checks if the werewolf at the current index 'i' position is the alpha using the 'getAlphaWolf' method.
            if (werewolves[i] == pack.getAlphaWolf()) {
                // If the wolf is the alpha, the method will return true.
                return true;
            }
        }
        // If there is no alpha, the method will return false.
        return false;
    }

    /**
     * This method is responsible for designating (setting) a certain member of a pack as alpha. It will take no parameters
     * and will check if the current werewolf is apart of a pack, and if the pack already has an alpha or not, as a pack
     * cannot have more than one alpha. If these statements evaluate to true, the current pack calls upon the 'setAlphaWolf'
     * method from the pack class, and passes 'this' as an argument, where 'this' refers to the werewolf attempting to
     * become the alpha. The system will then print a statement saying that an alpha has been assigned. If the initial
     * conditions evaluate to false, which means the werewolf is not in a pack, or the pack already has an alpha, the
     * system will print a statement saying an alpha is already designated in this pack, or the werewolf is not in a pack.
     */
    public void setAlpha() {
        // Checks if the werewolf is in a pack.
        if (packName != null) {
            // Checks if the pack already has an alpha.
            if (packName.getAlphaWolf() == null) {
                // If the conditions evaluate to true, meaning the werewolf is in a pack, and the pack does not have an
                // alpha yet, the current instance of the werewolf is assigned as the alpha wolf using the 'this' keyword
                // and calling the 'setAlphaWolf' method.
                packName.setAlphaWolf(this);
                // The system prints the corresponding line.
                System.out.println("A new alpha has been assigned!");
            // This else block is executed if the pack already has an alpha.
            } else {
                System.out.println("The pack already has an alpha assigned!");
            }
        // This else block is executed if the werewolf is not in a pack.
        } else {
            System.out.println("The werewolf is not in a pack! Must be in a pack to be alpha!");
        }
    }

    /**
     * This method is responsible for representing the werewolfs attributes in the form of a string. A variable 'packStr'
     * is declared but not yet initialized, with the purpose of concatenation. An if statement is used to check whether
     * or not the werewolf is apart of a pack. If it is, the 'packStr' is assigned to the name of the pack by calling
     * upon the 'getPackName' method from the pack class. If it isnt apart of a pack, the variable is assigned to a string
     * saying no pack. The method will then make a call to the super classes (inhabitant) 'toString' method so the
     * attributes and name of the werewolf is included in the string representation, but the super classes string is
     * concatenated with the 'packStr' variable so the string will also include the name of the werewolfs pack.
     *
     * @return a string, which calls the super classes 'toString' and adds on the pack name of the werewolf.
     */
    @Override
    public String toString() {
        String packStr;
        // Checks if the werewolf is in a pack and displays the name of the pack if so.
        if (packName != null) {
            packStr = packName.getPackName();
        // If werewolf is not in a pack, it will show no pack.
        } else {
            packStr = "No Pack";
        }
        return super.toString() +
                "Pack: "  + packStr;
    }
}
