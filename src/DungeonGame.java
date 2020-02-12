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

            map.print();
            player.printStats();

            if (!player.isAlive()){
                System.out.println("You died!");
                System.out.println("Game over.");
                break;
            }
        }
    }

    public void end(){
        playing = false;
    }
}
