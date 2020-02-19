public class Player {
    private String playerClass;

    private int health;
    private int maxHealth;
    private int damage;
    private int gold;

    private double lootModifier;

    private DungeonMap currentMap;
    private int dungeonMapBoundsX;
    private int dungeonMapBoundsY;

    private int x;
    private int y;

    public Player(){

        while (true) {
            System.out.println("Select your class:\n[1] Warrior\n[2] Thief");
            String key = Character.toString(Constants.scanner.next().charAt(0));
            if (key.equals("1")) {
                playerClass = Constants.WARRIOR_NAME;
                health = Constants.WARRIOR_HEALTH;
                damage = Constants.WARRIOR_DAMAGE;
                lootModifier = 1;
                break;
            } else if (key.equals("2")) {
                playerClass = Constants.THIEF_NAME;
                health = Constants.THIEF_HEALTH;
                damage = Constants.THIEF_DAMAGE;
                lootModifier = Constants.THIEF_GP_MODIFIER;
                break;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }

        x = 1;
        y = 1;
        maxHealth = health;
    }

    public void setMap(DungeonMap newMap){
        currentMap = newMap;
        dungeonMapBoundsX = newMap.getWidth();
        dungeonMapBoundsY = newMap.getHeight();
    }

    public void attack(Monster target) {

    }

    public void onHit(int damage) {
        if (health - damage > 0){
            System.out.println("You took " + damage + " damage.");
            health -= damage;
        }else{
            health = 0;
        }
    }

    public void onHeal(int health) {
        System.out.println("You picked up a potion lying on the ground.");
        if ((this.health + health) > maxHealth){
            this.health = maxHealth;
            System.out.println("You have been fully healed!");
        }else{
            this.health += health;
            System.out.println("You have been healed by " + health);
        }
    }

    public void onLoot(int gold) {
        System.out.println("You picked up " + gold + " gold");
        this.gold += gold;
        //TODO: check win state
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

    public int getDamage(){
        return damage;
    }

    public int getHealth(){
        return health;
    }

    public int getGold(){
        return gold;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(String direction){
        if (direction.equals(Constants.MOVE_UP)){
            if (y - 1 <= 0){
                System.out.println("Invalid move");
            }else{
                y -= 1;
                currentMap.enterRoom(x, y);
            }
        }
        if (direction.equals(Constants.MOVE_DOWN)){
            if (y + 1 > currentMap.getHeight()){
                System.out.println("Invalid move");
            }else{
                y += 1;
                currentMap.enterRoom(x, y);
            }
        }
        if (direction.equals(Constants.MOVE_LEFT)) {
            if (x - 1 <= 0){
                System.out.println("Invalid move");
            }else{
                x -= 1;
                currentMap.enterRoom(x, y);
            }
        }
        if (direction.equals(Constants.MOVE_RIGHT)){
            if (x + 1 > currentMap.getWidth()){
                System.out.println("Invalid move");
            }else{
                x += 1;
                currentMap.enterRoom(x, y);
            }
        }
    }

    public void nextMove(){
        String key = Character.toString(Constants.scanner.next().charAt(0));
        move(key);
    }

    public Boolean isAlive(){
        if (health > 0){
            return true;
        }else{
            return false;
        }
    }
}
