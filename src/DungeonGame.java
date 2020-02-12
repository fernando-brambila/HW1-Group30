public class DungeonGame {
    private DungeonMap map;
    private Player player;

    public DungeonGame(){
        setup();
    }

    public void setup(){
        map = new DungeonMap(10, 10);
        player = new Player("Warrior");
        map.setPlayer(player);
        player.setMap(map);
    }

    public void play() {
        map.enterRoom(1, 1);
        map.print();
        while (true){
            player.nextMove();

            map.print();
            player.printStats();
        }
    }
}
