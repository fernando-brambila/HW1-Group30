
public class DungeonMap {
    private Room[][] rooms;
    private Player player;

    public DungeonMap (int rows, int columns) {
        // make empty room array
        this.rooms = new Room[rows][columns];
        //fill in the rooms
        for (int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[0].length; j++){
                rooms[i][j] = new Room();
            }
        }
    }

    public void print() {
        printHorizontalBorder();
        for (int row = 0; row < rooms.length; row++) {
            System.out.print("|"); // left border
            for (int column = 0; column < rooms[0].length; column++) {
                System.out.print(rooms[row][column].print());
                System.out.print(" ");
            }
            System.out.print("|"); // right border
            System.out.println();
        }
        printHorizontalBorder();
    }

    private void printHorizontalBorder(){
        System.out.print("+"); // corner
        for (int i = 0; i < rooms[0].length * 2; i++){
            System.out.print("-");
        }
        System.out.print("+"); // corner
        System.out.println();
    }
}
