
public class Player {
    private String playerClass;

    private int health;
    private int damage;
    private int gold;

    private double lootModifier;

    private DungeonMap currentMap;
    private int dungeonMapBoundsX;
    private int dungeonMapBoundsY;

    private int x;
    private int y;

    public Player(String playerClass){
        this.playerClass = playerClass;
        if (playerClass.equals(Constants.WARRIOR_NAME)){
            health = Constants.WARRIOR_HEALTH;
            damage = Constants.WARRIOR_DAMAGE;
            lootModifier = 1;
        }
        if (playerClass.equals(Constants.THIEF_NAME)){
            health = Constants.THIEF_HEALTH;
            damage = Constants.THIEF_DAMAGE;
            lootModifier = Constants.THIEF_GP_MODIFIER;
        }

        x = 1;
        y = 1;
    }

    public void setMap(DungeonMap newMap){
        currentMap = newMap;
        dungeonMapBoundsX = newMap.getWidth();
        dungeonMapBoundsY = newMap.getHeight();
    }

    public void attack(Monster target) {

    }

    public void onHit(int damage) {

    }

    public void onHeal(int health) {

    }

    public void onLoot(int gold) {

    }

    public String print(){
        if (playerClass.equals(Constants.WARRIOR_NAME)){
            return "W";
        }
        if (playerClass.equals(Constants.THIEF_NAME)){
            return "T";
        }
        return "X";
    }

    public void printStats(){
        System.out.println("Current Health: " + health);
        System.out.println("Current Gold: " + gold);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(String direction){
        switch(direction){
            case "up":
                y += 1;
                break;
            case "down":
                y -= 1;
                break;
            case "left":
                x -= 1;
                break;
            case "right":
                x += 1;
                break;
            default:
                System.out.println("Player move: No move direction specified!");
        }
    }
}
