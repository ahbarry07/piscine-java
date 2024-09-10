public class Weapon {

    private String name;
    private int damage;

    public String getName(){
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString(){
        return String.format("%s deals %s damages", getName(), getDamage());
    }
}