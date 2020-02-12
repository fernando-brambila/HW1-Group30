import java.util.Scanner;

public class Constants {

    // warrior, thief classes

    public static String WARRIOR_NAME = "Warrior";
    public static String THIEF_NAME = "Thief";

    public static int WARRIOR_HEALTH = 100;
    public static int WARRIOR_DAMAGE = 15;

    public static int THIEF_HEALTH = 70;
    public static int THIEF_DAMAGE = 10;

    public static double THIEF_GP_MODIFIER = 1.2;

    // monsters

    public static String GOBLIN_NAME = "Goblin";
    public static int GOBLIN_HEALTH = 6;
    public static int GOBLIN_DAMAGE = 10;

    public static String ZOMBIE_NAME = "Zombie";
    public static int ZOMBIE_HEALTH = 12;
    public static int ZOMBIE_DAMAGE = 15;

    public static String ORC_NAME = "Orc";
    public static int ORC_HEALTH = 18;
    public static int ORC_DAMAGE = 20;

    public static String DENEKE_NAME = "Deneke";
    public static int DENEKE_HEALTH = 55;
    public static int DENEKE_DAMAGE = 5;

    // encounter types

    public static String ENCOUNTER_NONE = "None";
    public static String ENCOUNTER_MONSTER = "Monster";
    public static String ENCOUNTER_LOOT = "Loot";
    public static String ENCOUNTER_HEAL = "Heal";

    // controls

    public static String MOVE_UP = "w";
    public static String MOVE_DOWN = "s";
    public static String MOVE_LEFT = "a";
    public static String MOVE_RIGHT = "d";

    // scanner

    public static Scanner scanner = new Scanner(System.in);

}
