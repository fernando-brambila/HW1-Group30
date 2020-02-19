public class DungeonGame {
    private DungeonMap map;
    private Player player;
    private Boolean playing;

    public DungeonGame(){
        setup();
    }

    public void setup(){
        map = new DungeonMap(10, 10);
        player = new Player();
        map.setPlayer(player);
        player.setMap(map);
    }

    public void play() {
        playing = true;
        map.enterRoom(1, 1);
        map.print();
        while (playing){
            player.nextMove();

            printHorizontalLine();
            map.print();
            player.printStats();

            if (!player.isAlive()){
                System.out.println("You died!");
                System.out.println("Game over.");
                break;
            }

            if (player.getGold() >= 100){
                System.out.println("You have found over 100 gold!");
                System.out.println("You can now escape the dungeon!");
                System.out.println("Victory!");
                break;
            }
        }
    }

    public void end(){
        playing = false;
    }

    public void printHorizontalLine(){
        System.out.println("==========================");
    }
}
