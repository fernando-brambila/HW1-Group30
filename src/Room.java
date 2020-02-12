
public class Room {
    private boolean visited = false;
    private boolean playerStanding = false;

    public void enter(Player player) {
        visited = true;
        playerStanding = true;
    }

    public void exit() {
        playerStanding = false;
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
