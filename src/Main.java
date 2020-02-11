public class Main {
    public static void main(String[] args) {
        System.out.println("Testing dungeonmap printing:");

        //test
        DungeonMap testMap = new DungeonMap(10, 10);
        Player testPlayer = new Player("Warrior");

        testMap.setPlayer(testPlayer);
        testPlayer.setMap(testMap);

        testPlayer.setX(5);
        testPlayer.setY(3);

        testMap.print();
    }
}