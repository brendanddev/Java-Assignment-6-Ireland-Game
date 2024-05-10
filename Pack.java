package test;


import java.util.Random;

/**
 * The purpose of this class (The 'Pack' class) is to encapsulate the logic and functionality behind the packs in which
 * the werewolf's and witches will plead allegiance to. This class will not inherit, or be inherited from, but instead will
 * be related to the inhabitant class, werewolf class and witch class through association. The main purpose of implementing
 * this class is to encapsulate the logic of initializing and creating the class, so not all of this code is directly
 * accessed in either the werewolf class or the witch class. The class will have its own instance variables for the name
 * of the pack, an array of werewolves which will represent the pack, an alpha wolf, a witch, and the max size, and size
 * of pack. The methods the class will have are responsible for adding or removing a werewolf or witch from a pack, setting
 * the alpha of the pack, and representing the pack with a string.
 *
 */

public class Pack {
    // Instance Variables:
    /**
     * 'packName' of type String, represents the name of the pack that the werewolfs or witch has pled allegiance to.
     */
    private String packName;
    /**
     * 'werewolves' of type Werewolf[], represents an array which is the pack of werewolfs.
     */
    private Werewolf[] werewolves;
    /**
     * 'alphaWolf' of type Werewolf, represents the alpha werewolf of a pack.
     */
    private Werewolf alphaWolf;
    /**
     * 'witch' of type Witch, represents a instance of the witch class in the case a witch is a part of a pack.
     */
    private Witch witch;
    /**
     * 'maxSizeOfPack' of type int, represents the maximum number of pack members a pack can have.
     */
    private int maxSizeOfPack;
    /**
     * 'sizeOfPack' of type int, represents the number of pack members a pack has.
     */
    private int sizeOfPack;

    /**
     * The first constructor allows the parameters to be set upon initialization of the instance of the pack class. When
     * the instance is created, the pack name, array of werewolves, if a witch is in the pack, and the max size of the
     * pack is set in the instance. The for loop inside the constructor is responsible for counting the number of
     * members in the pack, a variable 'packMembers' is initialized to 0 to begin with, and the for loop it iterates
     * through 0 to the length of the werewolves array, and for every index that isnt null, it counts this as a pack
     * member as if the index is not null, this means there is a member there.
     *
     * @param packName, the name of the pack.
     * @param werewolves, the array of werewolfs.
     * @param witch, the witch that may or may not be in the pack.
     * @param maxSizeOfPack, the maximum number of members that can be in the pack.
     */
    public Pack(String packName, Werewolf[] werewolves, Witch witch, int maxSizeOfPack) {
        this.packName = packName;
        this.witch = null;
        // Variable 'packMembers' is responsible for counting the number of members in a pack. Initially set to 0.
        int packMembers = 0;
        // Iterates through the werewolves array, and checks for every position that is not null.
        for (int i = 0; i < werewolves.length; i++) {
            // If the index 'i' in the werewolves array is not null, this means there is a pack member present.
            if (werewolves[i] != null) {
                // The number of pack members is incremented by 1 for every pack member in the array.
                packMembers++;
            }
        }
        this.sizeOfPack = packMembers;
        this.maxSizeOfPack = maxSizeOfPack;
        this.werewolves = werewolves;
    }

    /**
     * The second constructor is responsible for generating all random values upon the initialization of the instance of
     * the pack class, besides the name. The only parameter the constructor will take is the name of the pack, and the
     * rest of the variables will be randomly set. An instance of the random class is used to generate a random size for
     * the pack between 1- 10, and the number of werewolves in this pack will be initially set to 0.
     *
     * @param packName, the name of the pack.
     */
    public Pack(String packName) {
        this.packName = packName;
        // Instance of the random class.
        Random random = new Random();
        // Generates a random integer between 1 - 10.
        this.maxSizeOfPack = random.nextInt(10) + 1;
        this.witch = null;
        // Werewolves array is created with a size of the max size of the pack, with currently no werewolves or witches
        // inside the pack.
        this.werewolves = new Werewolf[maxSizeOfPack];
        this.sizeOfPack = 0;
    }

    /**
     * This method retrieves (gets) the name of the pack.
     *
     * @return packName, the name of the pack.
     */
    public String getPackName() {
        return packName;
    }

    /**
     * This method is responsible for retrieving (getting) the werewolves that belong to the pack.
     *
     * @return werewolves, the array of werewolves in a pack.
     */
    public Werewolf[] getWerewolves() {
        return werewolves;
    }

    /**
     * This method is used to retrieve (get) the alpha wolf of the pack.
     *
     * @return alphaWolf, the alpha werewolf in the pack.
     */
    public Werewolf getAlphaWolf() {
        return alphaWolf;
    }

    /**
     * This method is used to make (set) a werewolf of a pack as the pack alpha.
     *
     * @param alphaWerewolf, a werewolf that will be designated the pack alpha.
     */
    public void setAlphaWolf(Werewolf alphaWerewolf) {
        this.alphaWolf = alphaWerewolf;
    }

    /**
     * THis method is used to retrieve (get) the witch that will be part of/associated with a pack.
     *
     * @return witch, the witch that is a part of a pack.
     */
    public Witch getWitch() {
        return witch;
    }

    /**
     * This method retrieves (gets) the maximum size of members that can be in a pack in the form of a integer value.
     *
     * @return sizeOfPack, an integer value representing the maximum number of members a pack can have.
     */
    public int getSizeOfPack() {
        return sizeOfPack;
    }

    /**
     * This method is responsible for adding a werewolf to a pack. It will take a parameter 'werewolf' of type werewolf
     * as this will be the werewolf that will be joining (added to) the pack. The method uses a for loop to iterate through
     * the length of the werewolves array, which contains werewolfs objects representing the werewolfs in the pack already.
     * Inside the loop, the if statement checks if the current index 'i' of the werewolves array is null, meaning that
     * there is no werewolf at this index. If this is the case, the werewolf attempting to join the pack is assigned to
     * the index 'i' of the werewolves array simulating the fact the werewolf has now joined. The 'setPack' method of the
     * inhabitant class is then called upon to set the werewolfs new pack using the 'this' keyword, where the 'this'
     * keyword refers to the current pack 'setPack' is referring to. The size of the pack is then increment by 1, to
     * further demonstrate the simulation of the wolf joining its new pack. The return keyword is used to exit the method
     * after the werewolf has been assigned its new pack, so that the method does not continuously re-assign the werewolf
     * in every index that is not null. The bottom else statement is executed if and only if there are no available spots
     * in the pack, and in that case a line is printed to the console saying so.
     *
     * @param werewolf, the werewolf being added to a pack.
     */
    public void addWerewolf(Werewolf werewolf) {
        // Iterates through the werewolves array.
        for (int i = 0; i < werewolves.length; i++) {
            // Checks if the current position / index 'i' is null (empty).
            if (werewolves[i] == null) {
                // If it is, the position / index 'i' is assigned to the werewolf being added to the pack.
                werewolves[i] = werewolf;
                // The werewolfs pack is set to the current pack they are joining using the 'setPack' method and the
                // 'this' keyword.
                werewolf.setPack(this);
                // A werewolf has joined the pack, so the size of the pack is incremented by 1.
                sizeOfPack++;
                // Uses the return statement to exit the loop and method to prevent the werewolf being continuously
                // added to every open spot in the pack/array.
                return;
            }
        // If no open spots are found, the system prints the line that the pack is full.
        }
        System.out.println("The pack is full! Find a new pack to join!");
    }

    // Initially this method was responsible for removing a werewolf from the pack, but after reviewing my code, and the
    // assignment instructions, I forgot it mentioned that once a werewolf has pled allegiance to a pack, it will not
    // leave. However, I left the commented code in just in case.
//    public void removeWerewolf(Werewolf werewolf) {
//        for (int i = 0; i < werewolves.length; i++) {
//            if (werewolves[i] == werewolf) {
//                werewolves[i] = null;
//                sizeOfPack--;
//                return;
//            }
//        }
//    }

    /**
     * This method will have similar logic to the 'addWerewolf' method, as it will essentially do the same thing, but for
     * the witch. The method is responsible for simulating a witch joining a pack, and will take a single parameter 'witch'
     * of type witch. Inside the body of the method, the if statement checks if the witch of the current pack is null
     * using the 'this' keyword to refer to the current witch, where if the current packs witch is null, this means there
     * is no witch in the pack yet. If this is true, meaning there is no witch yet, the witch attempting to join the pack
     * is then assigned to the witch of the current pack using the 'this' keyword once again to refer to the current witch.
     * The witches new pack is then initialized to the pack its joining by calling upon the 'setPack' method and using
     * the 'this' keyword, where this time the 'this' keyword is referring to the current instance of the pack, and not
     * the witch attempting to join the pack. The size of the pack is then incremented by 1 to simulate the action of the
     * witch now joining the pack. The system will then print a line saying that the witch has now joined a pack, but if
     * the initial if statement is false meaning the pack already has a witch, then the system will print a line saying
     * that the pack already has one, as a pack cannot have more than 1 witch.
     *
     * @param witch, the witch attempting to join the pack.
     */
    public void addWitch(Witch witch) {
        // Checks if the witch of the current pack is null, meaning there is not currently a witch in the pack.
        if (this.witch == null) {
            // If there is no witch in the pack yet, the witch trying to join the pack is assigned to the witch of the
            // pack, this simulates the witch joining the pack.
            this.witch = witch;
            // The witch's pack that has newly joined the pack is set to the current pack (the pack its joined) using the
            // 'setPack' method.
            witch.setPack(this);
            // The size of the pack is then incremented by 1 to further simulate the action of the witch joining/being
            // added to the pack.
            sizeOfPack++;
            // System prints a line saying the witch has joined.
            System.out.println("Witch has joined the pack!");
        // If the pack already has a witch, the else block is executed and the system prints the corresponding line.
        } else {
            System.out.println("Pack already has a witch! Cannot have more than one witch per pack!");
        }
    }

    /**
     * This method is responsible for removing a witch from a pack, as the assignment mentions that the werewolfs are not
     * always loyal to the witches, and can switch which witch is in a pack. The method reassigns the witch of the current
     * pack to null using the 'this' keyword to access the current witch. This simulates the action of the removal of the
     * witch from the pack. The size of the pack is then decremented by 1, as the pack will now have 1 less member since
     * the witch has left/been removed.
     */
    public void removeWitch() {
        // Sets the current witch of the pack to false, to simulate the witch being removed from the pack.
        this.witch = null;
        // Decrements the size of the pack by 1 to further simulate the witch leaving/being removed from the pack.
        sizeOfPack--;
    }

    /**
     * This method is responsible for providing a string representation of the pack, and its members. Since the pack class
     * does not inherit the inhabitant class, but instead is associated with it, I have not called the super keyword,
     * because this will be its own string method. The method forms a string, but this string will be dependent on showing
     * the name of the pack, members of the pack, alpha of the pack, the witch of the pack, and the packs size, and
     * maximum size. It uses an if statement to initially check if the pack has any members, and if it does it will use
     * a for loop to iterate through the length of the array, to then print each member of the pack since the pack members
     * will not be null. Each member will be concatenated to the current string 'str'. If there are no members in the pack
     * the else statement will be executed and will say that the pack is empty. The additional if statements are used for
     * checking if the pack has an alpha, if the pack has a witch, and then the size and max size of the pack.
     *
     * @return str, a string representation of the pack.
     */
    @Override
    public String toString() {
        String str = "Pack: " + packName;
        // Checks if pack has more than one member.
        if (sizeOfPack > 0) {
            // Iterates through the array of werewolves which is the werewolves in the pack.
            for (int i = 0; i < werewolves.length; i++) {
                // If the current index 'i' is not null, meaning a member of the pack is present, they will be concatenated
                // to the string.
                if (werewolves[i] != null) {
                    str = str + werewolves[i] + "\n";
                }
            }
            // If the pack is empty, the system will print so.
        } else {
            str = str + "\nThe pack is empty!";
        }
        // Checks if the pack has a witch.
        if (witch != null) {
            str = str + "\nWitch: " + witch;
        }
        // Checks if the pack has an alpha.
        if (alphaWolf != null) {
            str = str + "\n" + "Alpha: " + alphaWolf + "\n";
        } else {
            str = str + "\nNo Alpha has been designated!";
        }
        // Prints size and max size of the pack.
        str = str + "\nSize of the pack: " + sizeOfPack + "\n" +
                "Max Size of pack: " + maxSizeOfPack;
        return str;
    }
}
