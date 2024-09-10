public class Templar extends Character implements Healer, Tank{

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return String.format("%s has been beaten, even with its %s shield. So bad, it could heal %s HP.", getName(), getShield(), getHealCapacity());
        }

        return String.format("%s is a strong Templar with %s HP. It can heal %s HP and has a shield of %s.", getName(), getCurrentHealth(), getHealCapacity(), getShield());
    }

    @Override
    public void attack(Character ennemy){
        this.heal(this);
        ennemy.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage){
        this.setCurrentHealth(this.getCurrentHealth() - damage - getShield());
        if (this.getCurrentHealth() < 0) this.setCurrentHealth(0); 
        
    }
}