import java.util.Random;
public class Monster {

    private int health;
    private int damage;
    private String monsterType;
    private Player player;


    Monster(String monsterName){
        monsterType = monsterName;
        if (monsterName == Constants.GOBLIN_NAME){
            health = Constants.GOBLIN_HEALTH;
            damage = Constants.GOBLIN_DAMAGE;
        }
        if (monsterName == Constants.ORC_NAME){
            health = Constants.ORC_HEALTH;
            damage = Constants.ORC_DAMAGE;
        }
        if (monsterName == Constants.ZOMBIE_NAME){
            health = Constants.GOBLIN_HEALTH;
            damage = Constants.ZOMBIE_DAMAGE;
        }
        if (monsterName == Constants.DENEKE_NAME){
            health = Constants.DENEKE_HEALTH;
            damage = Constants.DENEKE_DAMAGE;
        }
    }

    public int getRandomDamage(){
        int random = (int)(Math.random() * damage);
        return random;
    }

    public Boolean isAlive(){
        if (health > 0) {
            return true;
        }else{
            return false;
        }
    }


    public void startEncounter(Player player) {
        System.out.println("A " + monsterType + " appears!");

        while (isAlive()){
            System.out.println("Select an action: [1] Attack, [2] Run :");
            int action = getNextAction();

            if (action == 1){
                int playerDamage = player.getDamage();
                int monsterDamage = getRandomDamage();
                System.out.println("You attack for " + playerDamage + ".");
                onHit(playerDamage);
                System.out.println("The monster attacks you for " + monsterDamage + ".");
                player.onHit(monsterDamage);

                printAllStats(player);
            }
            else if (action == 2){
                int monsterDamage = getRandomDamage();
                System.out.println("You try to run, and take " + monsterDamage + "damage in the process.");
                break;
            }
            else {
                System.out.println("Invalid input, please try again.");
            }
        }

    }

    public void printAllStats(Player player){
        System.out.println("Player Health: " + player.getHealth());
        System.out.println(monsterType + " Health: " + health);
    }

    public void onHit(int damage) {
        this.health -= damage;
    }

    private int getNextAction(){
        String key = Character.toString(Constants.scanner.next().charAt(0));
        if (key.equals("1")){
            return 1;
        }
        if (key.equals("2")){
            return 2;
        }
        return 0;
    }

}