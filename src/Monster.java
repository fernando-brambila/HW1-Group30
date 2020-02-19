import java.util.Random;
public class Monster {

    private int health;
    private int damage;
    private String monsterType;
    Random myrand = new Random();

    Monster(int h, int d, String type){
        this.health = h;
        this.damage = d;
        this.monsterType = type;
    }





    public void attack(Player target) {
        target.onHit(myrand.nextInt(damage));
    }



    public void onHit(int damage) {



    }

}
