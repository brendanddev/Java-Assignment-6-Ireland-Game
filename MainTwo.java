package test;

public class MainTwo {

    /**
     * Main method to run the program. This is where all the classes will be put to the test to see if they work, and
     * if they are functioning as expected.
     *
     * @param args, unused.
     *
     * @author BRENDAN DILEO
     */

    public static void main(String[] args) {

        // Creating instances of the players:

        // Creates instance of the Pack Class, using all argument/parameter constructor.
        // No witch is assigned to this pack.
        Pack wolfPackRed = new Pack("Wolf-Pack Red", new Werewolf[5], null, 7);

        // Creates instance of the Pack Class, using only the name argument/parameter constructor.
        Pack wolfPackBlue = new Pack("Wolf-Pack Blue");

        // Creates instances of the werewolf class using name only argument/parameter constructor.
        Werewolf werewolf = new Werewolf("Werewolf 1");
        Werewolf werewolfTwo = new Werewolf("Werewolf 2");
        Werewolf werewolfThree = new Werewolf("Werewolf 3");
        // Creates instance of the werewolf class using the all argument/parameter constructor.
        Werewolf werewolfFour = new Werewolf("Werewolf 4", 6, 7, 8, null);

        // Creates instances of the witch class using all argument/parameter constructor.
        Witch witch = new Witch("Witch Dorothy", 8, 8, 8, null, null);

        // Creates instances of the witch class using only the name argument/parameter constructor.
        Witch witchTwo = new Witch("Witch Kamal");

        // Creates instances of the healer class using the all argument/parameter constructor.
        Healer healer = new Healer("Healer Brendan", 9, 9, 9, 9);

        // Creates instances of the healer class using the name only argument/parameter constructor.
        Healer healerTwo = new Healer("Healer John");

        // Creates instance of the hunter class using the all arguments/parameters constructor.
        Hunter hunter = new Hunter("Hunter Camacho", 9, 9, 8);

        // Creates instance of the hunter class using the name only constructor.
        Hunter hunterTwo = new Hunter("Hunter Dylan");

        // Print the players and attributes:
        System.out.println("The players: ");

        System.out.println(werewolf);
        System.out.println(werewolfTwo);
        System.out.println(werewolfThree);
        System.out.println(werewolfFour);
        System.out.println(witch);
        System.out.println(witchTwo);
        System.out.println(healer);
        System.out.println(healerTwo);
        System.out.println(hunter);
        System.out.println(hunterTwo);

        // Clarity line for output.
        System.out.println();

        // Simulate the increase and decrease in attributes by 1 using the increase and decrease methods.
        System.out.println("Werewolf 4 health before increase: " + werewolfFour.getHealth());
        werewolfFour.healthIncrease();
        System.out.println("Werewolf 4 health after increase: " + werewolfFour.getHealth());

        // Clarity line for output.
        System.out.println();

        // Simulate the increase and decrease in attributes by 1 using the increase and decrease methods.
        System.out.println("Witch Kamal's agility before increase: " + witchTwo.getAgility());
        witchTwo.agilityIncrease();
        witchTwo.agilityIncrease();
        witchTwo.agilityIncrease();
        System.out.println("Witch Kamal's agility after increase: " + witchTwo.getAgility());

        // Clarity line for output.
        System.out.println();

        // Simulate the werewolves joining a pack.
        // First two werewolves join the red pack.
        System.out.println("Werewolfs 1 & 2 joining red pack: ");
        werewolf.joinPack(wolfPackRed);
        werewolfTwo.joinPack(wolfPackRed);

        // Clarity Line
        System.out.println();

        // Last two werewolves join the blue pack.
        System.out.println("Werewolfs 3 & 4 joining blue pack: ");
        werewolfThree.joinPack(wolfPackBlue);
        werewolfFour.joinPack(wolfPackBlue);

        // Clarity line for output
        System.out.println();

        // Simulate witch joining pack.
        System.out.println("Witch Dorothy joining the red pack: ");
        witch.joinPack(wolfPackRed);

        // Line for clarity
        System.out.println();

        // Test to see if the pack allows another witch to join.
        System.out.println("Witch Kamal attempts to join the red pack: ");
        witchTwo.joinPack(wolfPackRed);

        // Clarity line
        System.out.println();

        // Witch Kamal joins the blue pack instead.
        System.out.println("Witch Kamal joins the blue pack: ");
        witchTwo.joinPack(wolfPackBlue);

        // Clarity line
        System.out.println();

        // The first werewolf is set as the alpha in the red pack
        System.out.println("Werewolf 1 is assigned as the alpha of the pack: ");
        werewolf.setAlpha();

        // Line for clarity
        System.out.println();

        // Attempts to set the second werewolf as the alpha in the red pack
        System.out.println("Werewolf 2 attempts to become the alpha of the pack: ");
        werewolfTwo.setAlpha();

        // Line for clarity
        System.out.println();

        // The third werewolf is set as the alpha in the blue pack
        System.out.println("Werewolf 3 is assigned as the alpha of the blue pack: ");
        werewolfThree.setAlpha();

        // Line for clarity
        System.out.println();

        // Attempts to set the fourth werewolf as the alpha in the blue pack
        System.out.println("Werewolf 4 attempts to become the alpha of the blue pack: ");
        werewolfFour.setAlpha();

        // Line for clarity
        System.out.println();

        // Werewolf Four tries to join the red pack, and betray its current pack.
        System.out.println("Werewolf 4 tries to betray its pack by joining another: ");
        werewolfFour.joinPack(wolfPackRed);

        // Line for clarity
        System.out.println();

        // Current State of the packs.
        System.out.println("The state of the red pack before battle: ");
        System.out.println(wolfPackRed);

        // Line for clarity
        System.out.println();

        System.out.println("The state of the blue pack before battle: ");
        System.out.println(wolfPackBlue);

        // Line for clarity
        System.out.println();

        // Line for clarity
        System.out.println();

        // State of the healers before battle.
        System.out.println("The healers before battle: ");
        System.out.println(healer);
        System.out.println(healerTwo);

        // Line for clarity
        System.out.println();

        // State of the hunters before battle.
        System.out.println("The hunters before battle: ");
        System.out.println(hunter);
        System.out.println(hunterTwo);

        // Witch leaves pack before battle.
        System.out.println("Right before the battles begin, Witch Kamal leaves his pack!");
        witchTwo.leavePack();

        // Line for clarity
        System.out.println();

        // Simulate the battles/attacks
        System.out.println("Attacks begin: ");

        // Line for clarity
        System.out.println();

        System.out.println("Werewolf 1's health before attack: " + werewolf.getHealth());
        System.out.println("Hunter Camacho attacks Werewolf 1!");
        hunter.attack(werewolf);
        System.out.println("Werewolf 1's health after attack: " + werewolf.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Werewolf 2's health before attack: " + werewolfTwo.getHealth());
        System.out.println("Healer John attacks Werewolf 2!");
        healerTwo.attack(werewolfTwo);
        System.out.println("Werewolf 2's health after attack: " + werewolfTwo.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Werewolf 4's health before attack: " + werewolfFour.getHealth());
        System.out.println("Werewolf 1 attacks Werewolf 4!");
        werewolf.attack(werewolfFour);
        System.out.println("Werewolf 4's health after attack: " + werewolfFour.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Hunter Camacho's health before attack: " + hunter.getHealth());
        System.out.println("Hunter Dylan attacks Hunter Camacho! Hunter on Hunter action!");
        hunterTwo.attack(hunter);
        System.out.println("Hunter Camacho's health after attack: " + hunter.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Healer Brendan's health before attack: " + healer.getHealth());
        System.out.println("Werewolf 3 attacks Healer Brendan!");
        werewolfThree.attack(healer);
        System.out.println("Healer Brendan's health after attack: " + healer.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Witch Dorothy's health before attack: " + witch.getHealth());
        System.out.println("Witch Kamal attacks Witch Dorothy! Witch on witch action!");
        witchTwo.attack(witch);
        System.out.println("Witch Dorothy's health after attack: " + witch.getHealth());

        // Line for clarity
        System.out.println();

        System.out.println("Witch Kamal's health before attack: " + witchTwo.getHealth());
        System.out.println("Hunter Dylan attacks Witch Kamal!");
        hunterTwo.attack(witchTwo);
        System.out.println("Witch Kamal's health after attack: " + witchTwo.getHealth());

        // Clarity line
        System.out.println();

        // Simulate the attempt to battle within packs, testing for friendly fire.
        System.out.println("Can the pack members battle their own pack: ");

        // Line for clarity
        System.out.println();

        System.out.println("Werewolf 1 got mad at Werewolf 2, they are trying to battle: ");
        werewolf.attack(werewolfTwo);

        // Line for clarity
        System.out.println();

        System.out.println("Witch Dorothy got mad at Werewolf 2, they are trying to battle: ");
        witch.attack(werewolfTwo);

        // Line for clarity
        System.out.println();

        System.out.println("Werewolf 3 got mad at Werewolf 4, they are trying to battle: ");
        werewolfThree.attack(werewolfFour);

        // Line for clarity
        System.out.println();

        // Simulate witch leaving the pack
        System.out.println("Witch Dorothy is fed up, they are leaving the pack!");
        witch.leavePack();
        System.out.println(witch);

        // Line for clarity
        System.out.println();

        // Check for allegiance after leaving.
        System.out.println("Does Witch Dorothy still have allegiance to a pack? " + witch.packAllegiance());

        // Line for clarity
        System.out.println();

        // Simulate the witch now attacking its past pack member
        System.out.println("Witch Dorothy would like to attack a member of the pack it betrayed!");
        System.out.println("Werewolf 1's health before attack: " + werewolf.getHealth());
        System.out.println("Witch Dorothy attacks Werewolf 1! This is textbook betrayal!");
        witch.attack(werewolf);
        System.out.println("Werewolf 1's health after attack: " + werewolf.getHealth());

        // Clarity line
        System.out.println();

        // Simulate the strengthening from the witch
        System.out.println("The witch begins strengthening: ");

        // Line for clarity
        System.out.println();

        System.out.println("Witch Kamal strengthens Healer John: ");
        System.out.println("Witch Kamal's strength before strengthening: " + witchTwo.getStrength());
        System.out.println("Healer John's Magic before being strengthened: " + healerTwo.getMagicRating());
        witchTwo.strengthen(healerTwo);
        System.out.println("Healer John's Magic after being strengthened: " + healerTwo.getMagicRating());
        System.out.println("Witch Kamal's strength after strengthening: " + witchTwo.getStrength());

        // Line for clarity
        System.out.println();

        System.out.println("Witch Dorothy strengthens Healer Brendan: ");
        System.out.println("Witch Dorothy's strength before strengthening: " + witch.getStrength());
        System.out.println("Healer Brendan's Magic before being strengthened: " + healer.getMagicRating());
        witch.strengthen(healer);
        System.out.println("Healer Brendan's Magic after being strengthened: " + healer.getMagicRating());
        System.out.println("Witch Dorothy's strength after strengthening: " + witch.getStrength());

        // Line for clarity
        System.out.println();

        // Simulate the healing from the healer
        System.out.println("The healer begins healing: ");

        // Line for clarity
        System.out.println();

        System.out.println("Healer Brendan heals Werewolf 1");
        System.out.println("Werewolf 1 health before healing: " + werewolf.getHealth());
        System.out.println("Healer Brendan's Magic rating before performing the heal: " + healer.getMagicRating());
        healer.heal(werewolf);
        System.out.println("Werewolf 1 health after healing: " + werewolf.getHealth());
        System.out.println("Healer Brendan's Magic rating after performing the heal: " + healer.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer Brendan heals Werewolf 2");
        System.out.println("Werewolf 1 health before healing: " + werewolfTwo.getHealth());
        System.out.println("Healer Brendan's Magic rating before performing the heal: " + healer.getMagicRating());
        healer.heal(werewolfTwo);
        System.out.println("Werewolf 2 health after healing: " + werewolfTwo.getHealth());
        System.out.println("Healer Brendan's Magic rating after performing the heal: " + healer.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer Brendan heals Werewolf 3");
        System.out.println("Werewolf 3 health before healing: " + werewolfThree.getHealth());
        System.out.println("Healer Brendan's Magic rating before performing the heal: " + healer.getMagicRating());
        healer.heal(werewolfThree);
        System.out.println("Werewolf 3 health after healing: " + werewolfThree.getHealth());
        System.out.println("Healer Brendan's Magic rating after performing the heal: " + healer.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer Brendan heals Hunter Camacho");
        System.out.println("Hunter Camacho's health before healing: " + hunter.getHealth());
        System.out.println("Healer Brendan's Magic rating before performing the heal: " + healer.getMagicRating());
        healer.heal(hunter);
        System.out.println("Hunter Camacho's health after healing: " + hunter.getHealth());
        System.out.println("Healer Brendan's Magic rating after performing the heal: " + healer.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer John heals Hunter Dylan");
        System.out.println("Hunter Dylan's health before healing: " + hunterTwo.getHealth());
        System.out.println("Healer John's Magic rating before performing the heal: " + healerTwo.getMagicRating());
        healerTwo.heal(hunterTwo);
        System.out.println("Hunter Dylan's health after healing: " + hunterTwo.getHealth());
        System.out.println("Healer John's Magic rating after performing the heal: " + healerTwo.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer John heals Witch Kamal");
        System.out.println("Witch Kamal's health before healing: " + witchTwo.getHealth());
        System.out.println("Healer John's Magic rating before performing the heal: " + healerTwo.getMagicRating());
        healerTwo.heal(witchTwo);
        System.out.println("Witch Kamal's health after healing: " + witchTwo.getHealth());
        System.out.println("Healer John's Magic rating after performing the heal: " + healerTwo.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer John heals Witch Dorothy");
        System.out.println("Witch Dorothy's health before healing: " + witch.getHealth());
        System.out.println("Healer John's Magic rating before performing the heal: " + healerTwo.getMagicRating());
        healerTwo.heal(witch);
        System.out.println("Witch Dorothy's health after healing: " + witch.getHealth());
        System.out.println("Healer John's Magic rating after performing the heal: " + healerTwo.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer John heals Healer Brendan");
        System.out.println("Healer Brendan's health before healing: " + healer.getHealth());
        System.out.println("Healer John's Magic rating before performing the heal: " + healerTwo.getMagicRating());
        healerTwo.heal(healer);
        System.out.println("Healer Brendan's health after healing: " + healer.getHealth());
        System.out.println("Healer John's Magic rating after performing the heal: " + healerTwo.getMagicRating());

        // Line for clarity
        System.out.println();

        System.out.println("Healer John heals Werewolf 4");
        System.out.println("Werewolf 4's health before healing: " + werewolfFour.getHealth());
        System.out.println("Healer John's Magic rating before performing the heal: " + healerTwo.getMagicRating());
        healerTwo.heal(werewolfFour);
        System.out.println("Werewolf 4's health after healing: " + werewolfFour.getHealth());
        System.out.println("Healer John's Magic rating after performing the heal: " + healerTwo.getMagicRating());

        // Line for clarity
        System.out.println();

        // Player and Pack statuses after the attacks, strengthening, and healing.
        System.out.println("Post attack, strengthening, and healing player states: ");

        // Line for clarity
        System.out.println();

        System.out.println("The pack's states: ");

        // Line for clarity
        System.out.println();

        System.out.println(wolfPackRed);

        // Line for clarity
        System.out.println();

        System.out.println(wolfPackBlue);

        // Line for clarity
        System.out.println();

        System.out.println("The witch's states: ");

        System.out.println(witch);

        System.out.println(witchTwo);

        // Line for clarity
        System.out.println();

        System.out.println("The hunter's states: ");

        System.out.println(hunter);

        System.out.println(hunterTwo);

        // Line for clarity
        System.out.println();

        System.out.println("The healer's states: ");

        // Line for clarity
        System.out.println();

        System.out.println(healer);

        System.out.println(healerTwo);

        // Line for clarity
        System.out.println();

        System.out.println("THE END!");

    }
}
