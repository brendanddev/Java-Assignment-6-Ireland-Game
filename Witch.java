package test;

/**
 * This class is a subclass of the inhabitant class (super class). It inherits from the inhabitant class, this is because
 * a witch is a type of inhabitant. It will inherit the methods from the inhabitant class, as the witch will not have
 * different attacks, or ways of defending itself. The witch class also has a relationship of association with the pack
 * class, this is because the witch can be apart of a pack. One thing with the witch, is that it cannot be created with
 * agility or health levels less than 5, and it has a special ability. A witch is able to strengthen a healer, which
 * means the witch is able to increase the healers magic rating by 1. But to do so, the witch must have 3 or more strength,
 * and for every strengthen the witch performs, they lose 3 strength.
 *
 * @author BRENDAN DILEO
 */
public class Witch extends Inhabitant {
    // Instance Variables:
    /**
     * 'witchPack' of type pack, represents the pack that the witch may or may not be a part of.
     */
    private Pack witchPack;

    /**
     * This is the first constructor that can be used to create an instance of the witch. This constructor allows for
     * all instance variables to be set upon creating an instance of the class. Inside this constructor, is a call to the
     * super classes (inhabitant class) all variable constructor, this is to initialize all the variables which are
     * inherited from the super class (inhabitant class). The witch constructor will take an additional two variables not
     * inherited from the super class, 'werewolfPack', and 'witchPack', which represent the pack the witch will be or will
     * not be apart of. The body of the constructor uses an if statement to ensure that upon creating an instance of the
     * class, if the agility is less than 5, it is set to 5, and same for the health. This is done by using the 'this'
     * keyword to refer to this instance of the witch, and also uses the setter methods inherited from the super class
     * passing 5 as an argument to set them as 5 if they are given a value less than 5. The variable 'witchPack' is
     * assigned to the variable passed to the constructor, which may also be null if the witch is not yet in a pack.
     *
     * @param name, name of the witch.
     * @param strength, the witches strength rating.
     * @param agility, the witches agility rating.
     * @param health, the witches health rating.
     * @param werewolfPack, the werewolf pack the witch may be a part of.
     * @param witchPack, the werewolf/witch pack the witch may be a part of.
     */
    public Witch(String name, int strength, int agility, int health, Pack werewolfPack, Pack witchPack) {
        super(name, strength, agility, health);
        // Ensures that a witch cannot be created with a value less than 5 for agility and health.
        if (agility < 5) {
            this.setAgility(5);
        }
        if (health < 5) {
            this.setHealth(5);
        }
        this.witchPack = witchPack;
    }

    /**
     * This is the second constructor that can be used to create an instance of the witch class. In this constructor,
     * only the witches name can be set when creating an instance of the witch. The constructor makes a call to the super
     * class (inhabitant class), which calls the super classes name only constructor. This will also result in the rest
     * of the variables being randomly generated, as this is what is done in the name only constructor in the super class.
     * The variables will be generated with a value from 0 - 10. However, the if statements inside the constructors body
     * ensure that if the randomly generated value is less than 5 for agility or health, then they are set to 5 by default
     * to adhere to the assignment requirements. This is done so by calling upon the setter methods from the super class
     * and passing arguments of 5 to the methods. The 'this' keyword represents that this is occurring to this instance
     * of the witch object/class. In this case, the witches pack is also defaulted to null to show that the witch does
     * not start in a pack, and must join a pack to be in one.
     *
     * @param name, the name of the witch.
     */
    public Witch(String name) {
        super(name);
        // Ensures that a witch cannot be created with a value less than 5 for agility and health.
        if (this.getAgility() < 5) {
            this.setAgility(5);
        }
        if (this.getHealth() < 5) {
            this.setHealth(5);
        }
        this.witchPack = null;
    }

    /**
     * This method is responsible for retrieving (getting) the pack the witch is a part of, if they are a part of one.
     *
     * @return witchPack, the pack the witch is apart of.
     */
    public Pack getWitchPack() {
        return witchPack;
    }

    /**
     * This method allows for the witches pack to be manipulated (set) directly.
     *
     * @param witchPack, the pack the witch is going to be set to.
     */
    public void setWitchPack(Pack witchPack) {
        this.witchPack = witchPack;
    }

    /**
     * The purpose of this method is to check whether or not a witch is a part of a pack (has plea allegiance). If the
     * witches pack is not null, the method will return true meaning the witch is a part of a pack, and will return false
     * if the witch is not a part of a pack.
     *
     * @return true, if the witch is a part of a pack. False, if the witch is not a part of a pack.
     */
    public boolean packAllegiance() {
        return this.witchPack != null;
    }

    /**
     * The purpose of this method is to simulate the interaction of a witch joining a pack. The method takes one parameter
     * 'newPack' of type pack representing the pack the witch intends to join. The method first checks if the witch is
     * currently in a pack or not, if it is, then the system prints a line saying the witch needs to leave its pack before
     * joining another, and then the methods exits using the 'return' statement. The next if statement checks if the pack
     * the witch is trying to join already has a witch or not using the 'getWitch' method, as the pack can only have
     * one witch at a time. If the pack already has a witch, the system prints the corresponding line, and the method is
     * exited with the use of the return statement. If the witch is not in a pack, meaning its pack is null, and the pack
     * does not already have a witch, the if statements are skipped, and the pack the witch is joining calls the 'addWitch'
     * method from the pack class passing the 'this' keyword as an argument to refer to this instance of the witch. The
     * current witch instance accessed by the 'this' keyword followed by the witch's pack is assigned to the new pack
     * it is joining to further simulate the action of the witch joining a pack.
     *
     * @param newPack, the pack the witch is joining.
     */
    public void joinPack(Pack newPack) {
        // Checks if the current with has a pack, to ensure more than one witch is not in a pack.
        if (this.witchPack != null) {
            // If the condition is true, the system prints the corresponding line.
            System.out.println("Witch is already in a pack! It must leave before joining a new one!");
            // The method exits with the use of the return statement.
            return;
        }
        // Checks if the pack already has a witch in it.
        if (newPack.getWitch() != null) {
            // If the pack already has a witch, the system will print the corresponding line.
            System.out.println("Pack already has a witch! Cannot have more than one witch per pack!");
            // Exits the method using the return statement.
            return;
        }
        // If the witch does not already have a pack, the pack the witch is joining calls upon the 'addWitch' method to
        // add the witch into the pack, passing 'this' as an argument representing the current witch.
        newPack.addWitch(this);
        // The witches pack is assigned to the pack it has just joined.
        this.witchPack = newPack;
    }

    /**
     * This method is responsible for letting the witch leave a pack. Although a witch can join a pack and plead allegiance
     * to this pack, they can betray the pack and leave as mentioned in the assignment. This method will take no parameters
     * and check if the current instance of the witch's pack is not null using the 'this' keyword, meaning the witch is
     * currently in a pack. If the witch is in a pack, the current instance of the witch belonging to the pack is retrieved
     * and saved into a new 'witch' variable using the 'this' keyword to access the current instance, and the 'getWitch'
     * method to actually retrieve the witch. The current instance of the witch and its pack makes a call to the
     * 'removeWitch' method from the pack class using the 'this' keyword, which will remove the witch from the pack. The
     * current instance of the witch and its pack is now assigned to null, to simulate the fact the witch has left the pack.
     * The system then prints a line saying the witch has left its pack.
     */
    public void leavePack() {
        // Checks if the witch is currently in a pack.
        if (this.witchPack != null) {
            // If it is, the witch is retrieved and saved into the variable 'witch' using the 'getWitch' method.
            Witch witch = this.witchPack.getWitch();
            // The witch's pack is set to null to simulate the witch leaving the pack, this removes the witches current
            // pack from the witch object. This removes that association.
            witch.setPack(null);
            // The witch's old pack calls upon the 'removeWitch' method to actually remove the witch from the pack.
            this.witchPack.removeWitch();
            // The witches pack is re-assigned to null to further simulate the witch leaving/being removed from the pack.
            this.witchPack = null;
            // The system prints the corresponding line to the console about the witch leaving the pack.
            System.out.println("The witch has left the pack and betrayed the allegiance!");
        }
    }

    /**
     * The purpose of the 'strengthen' method is to allow the witch to use its special power restricted to only witches.
     * The method will take a single parameter 'healer' of type healer, which will be the healer that the witch is going
     * to strengthen. The method starts by checking if the healer is still alive calling upon the inherited method from
     * the inhabitant class. If the healer is still alive, a variable 'witchStrength' is initialized to the result of
     * calling upon the 'getStrength' inherited method from the inhabitant class. The inner if statement then checks if
     * the witch is still alive by recalling the 'isAlive' method, and if the witch's strength is equal to 3, or more as
     * the witch requires 3 strength per strengthen. The nested if statement ensures that the magic the healer will be
     * receiving does not exceed a value of 10, as the assignment mentions the healer can have a magic rating of 1 - 10.
     * If the healers magic exceeds 10 before strengthening, the method will exit and print a line saying that the healer
     * already has 10 magic. If the healer does not already y have 10 magic, the variable 'maxMagic' is assigned to the
     * result of subtracting the maximum magic a healer can have (10), by the healers current magic rating using the
     * 'getMagicRating' method to determine how much magic it can receive without exceeding 10. Then a variable
     * 'healerMagic' representing the increase in the healers magic rating is assigned to the result of dividing the
     * witch's strength by 3. An if statement is then used to ensure that the healers magic rating does not go over the
     * maximum amount of magic they can get, and if it does, the amount of magic the healer will be getting is assigned
     * to the maximum amount they can receive 'maxMagic'. If the magic does not exceed 10, the healers magic is set to
     * the value of the healers current magic rating using the 'getMagicRating' method which is added with the amount of
     * magic itll be getting and set using the 'setMagicRating' method. The witches strength is then reassigned to the
     * result of subtracting the witches current strength, by the magic the healer has received multiplied by 3. This is
     * to simulate the loss of strength the witch will face when strengthening the healer. The system then prints a line
     * that the healers magic was increased, but the witch lost strength. Additionally, if the witch did not have enough
     * strength, or either of the healer or witch were dead, the else blocks will execute and print the corresponding line.
     *
     * @param healer, the healer the witch will strengthen.
     */
    public void strengthen(Healer healer) {
        // Checks if the healer is alive.
        if (healer.isAlive()) {
            // If they are, the witches strength is saved into 'witchStrength' using the 'getStrength' method.
            int witchStrength = getStrength();
            // Checks if the witch is still alive, and if its strength value is 3, or higher.
            if (isAlive() && witchStrength >= 3) {
                // If it is, this if statement checks if the healers magic is already at 10 to eliminate strengthening if
                // they already have a magic value of 10.
                if (healer.getMagicRating() >= 10) {
                    // If the healers magic is already at 10, the system prints the corresponding line.
                    System.out.println("The healers magic is already at 10!");
                    // The method then exits using the return statement.
                    return;
                }
                // If the healers magic is not yet at 10, the method continues, and the variable 'maxMagic' represents
                // the amount of magic the healer can be given without having more than 10 magic.
                int maxMagic = 10 - healer.getMagicRating();
                // The amount of magic the healer will get is determined by the witches strength divided by 3.
                int healerMagic = witchStrength / 3;
                // Checks if the magic the healer will get is greater than the maximum amount of magic they can receive.
                if (healerMagic > maxMagic) {
                    // If it exceeds, the magic the healer will get is assigned to the max they can get.
                    healerMagic = maxMagic;
                }
                // The healers magic is now set to the current magic the healer has added to the magic they are getting
                // from the witch using the 'set/getMagicRating' methods.
                healer.setMagicRating(healer.getMagicRating() + healerMagic);
                // The witch's strength is subtracted by the initial strength the witch had, by the amount of magic the
                // healer receives from the strengthen.
                setStrength(witchStrength - (healerMagic * 3));
                // The system prints the corresponding line if the magic was increased.
                System.out.println("The healers magic was increased, but the witch has lost 3 strength for every strengthen!");
            // Inner else if block will be executed if the witch is not alive.
            } else if (!isAlive()) {
                System.out.println("This witch is not alive!");
            // Inner else block will be executed if the witch does not have enough strength.
            } else {
                System.out.println("The witch does not have enough strength");
            }
        // Outer else block will be executed if the healer is not alive.
        } else {
            System.out.println("Cannot strengthen the healer! They are not alive!");
        }
    }

    /**
     * This method is used to represent a witch with a string representation. A variable 'packStr' is declared, and then
     * an if statement is used to check if the witch is in a pack, if the witch in the witch pack is the current instance
     * of the witch using the 'getWitch' method and the 'this' keyword. If this evaluates to true, the name of the witch's
     * pack is assigned to the 'packStr' variable, and if the condition was evaluated to false, the 'packStr' variable is
     * assigned to no pack meaning the witch is not in a pack. The variable is then concatenated with a call to the super
     * classes 'toString' method with the use of the 'super' keyword, as the current classes method adds to the super class
     * to show the name of the pack and the rest of the string from the super 'toString' method.
     *
     * @return a string, representing a string representation of the witch class.
     */
    @Override
    public String toString() {
        String packStr;
        // Checks if the witch is in a pack, and if current witch is the witch that is going to be called in the 'toString'.
        if (witchPack != null && witchPack.getWitch() == this) {
            // Concatenates the witch's pack to the string using the 'getPackName' method.
            packStr = witchPack.getPackName() + "\n";
        // If the witch is not in a pack, the string is concatenated with the no pack string.
        } else {
            packStr = "No Pack";
        }
        // Concatenates the pack to the super string.
        return super.toString() + "Pack: "  + packStr;
    }
}
