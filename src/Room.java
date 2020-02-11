
public class Room {
    private boolean visited = false;

    public void enter(Player player) {
        visited = true;
    }

    public boolean hasVisited() {
        return this.visited;
    }

    public String print(){
        // to do: replace with constants
        if (visited){
            return "/";
        }else
        {
            return "*";
        }
    }
}
