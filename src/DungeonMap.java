
public class DungeonMap {
    private Room[][] rooms;
    private Player player;

    public DungeonMap (int rows, int columns) {
        this.rooms = new Room[rows][columns];
    }

    public void print() {
        printHorizontalBorder();
        for (int row = 0; row < rooms.length; row++) {
            for (int column = 0; column < rooms[0].length; column++) {
                System.out.println(rooms[row][column]);
            }
        }
        System.out.print("|"); // left border

    }

    private void printHorizontalBorder(){
        for (int i = 0; i < rooms[0].length; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
