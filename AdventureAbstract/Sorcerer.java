
public class Sorcerer extends Character implements Healer{

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }
    
    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch){
        ch.setCurrentHealth(healCapacity);
    }

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return String.format("%s is a dead sorcerer. So bad, it could heal %s HP.", getName(), getHealCapacity());
        }

        return String.format("%s is a sorcerer with %s HP. It can heal %s HP.", getName(), getCurrentHealth(), getHealCapacity());
    }

    @Override
    public void attack(Character ennemy){
        this.heal(this);
        ennemy.takeDamage(10);
    }

    @Override
    public void takeDamage(int damage){
        this.setCurrentHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() < 0) this.setCurrentHealth(0); 
        

    }
}