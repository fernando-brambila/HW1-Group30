
public class Player {
    private String playerClass;

    private int health;
    private int damage;
    private int gold;

    private double lootModifier;

    public Player(String playerClass){
        if (playerClass.equals("Warrior")){
            health = Constants.WARRIOR_HEALTH;
            damage = Constants.WARRIOR_DAMAGE;
            lootModifier = 1;
        }
        if (playerClass.equals("Thief")){
            health = Constants.THIEF_HEALTH;
            damage = Constants.THIEF_DAMAGE;
            lootModifier = Constants.THIEF_GP_MODIFIER;
        }
    }

    public void attack(Monster target) {

    }

    public void onHit(int damage) {

    }

    public void onHeal(int health) {

    }

    public void onLoot(int gold) {

    }

    public void printStats(){
        System.out.println("Current Health: " + health);
        System.out.println("Current gold: " + gold);
    }
}
