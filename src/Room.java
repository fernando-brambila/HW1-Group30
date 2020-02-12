import java.lang.Math;

public class Room {
    private boolean visited = false;
    private String encounterType;
    private int loot;
    private Monster monster;

    public Room(){
        int pick = (int)(Math.random() * 10);
        if (pick < 3){
            encounterType = Constants.ENCOUNTER_MONSTER;
            int monsterPick = (int)(Math.random() * 9);
            //TODO: set monster
            if (monsterPick > 5) {
                System.out.println("Spawned a " + Constants.GOBLIN_NAME);
            }else if (monsterPick > 3){
                System.out.println("Spawned a " + Constants.ZOMBIE_NAME);
            }else if (monsterPick > 1){
                System.out.println("Spawned a " + Constants.ORC_NAME);
            }else{
                System.out.println("Spawned a " + Constants.DENEKE_NAME);
            }
        }else{
            encounterType = Constants.ENCOUNTER_LOOT;
            loot = (int)(Math.random() * 6);
        }
    }

    public void enter(Player player) {
        visited = true;
        if (encounterType.equals(Constants.ENCOUNTER_LOOT)){
            player.onLoot(loot);
        }
        if (encounterType.equals(Constants.ENCOUNTER_MONSTER)){
            //TODO: proper monster encounter
            System.out.println("(Placeholder monster encounter)");
            player.onHit(8);
        }
    }

    public void exit() {
    }


    public boolean hasVisited() {
        return this.visited;
    }

    public String print(){
        // to do: replace with constants
        if (visited){
            return "*";
        }else
        {
            return " ";
        }
    }


}
