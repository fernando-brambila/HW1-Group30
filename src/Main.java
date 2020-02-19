public class Main {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        try {
            rows = Integer.parseInt(args[0]);
            cols = Integer.parseInt(args[1]);
        }catch(Exception e){
            System.out.println("Invalid arugments passed, using default");
        }
        System.out.println("Running with dimensions: " + rows + ", " + cols);
        DungeonGame game = new DungeonGame(rows, cols);
        game.play();
    }
}