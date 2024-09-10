
public class Monster extends Character{

    public Monster(String name, int maxHealth, Weapon weapon){
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString(){
        if (getCurrentHealth() > 0){
            return String.format("%s is a monster with %s HP", getName(), getCurrentHealth());
        }
        return String.format("%s is a monster and is dead", getName());
    }

    @Override
    public void attack(Character ch){
        ch.takeDamage(7);
    }

    @Override
    public void takeDamage(int damage){
        int percent = (int) Math.floor(damage * 0.80);
        this.setCurrentHealth(getCurrentHealth() - percent);
        if (this.getCurrentHealth() < 0){
            this.setCurrentHealth(0);
        }
    }
}