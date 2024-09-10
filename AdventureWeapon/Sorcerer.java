
public class Sorcerer extends Character implements Healer{

    private final int healCapacity;
    // private Weapon weapon;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon){
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }
    
    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch){
        ch.setCurrentHealth(ch.getCurrentHealth() + getHealCapacity());
        if (ch.getCurrentHealth() > ch.getMaxHealth()){
            ch.setCurrentHealth(ch.getMaxHealth());
        }
    }

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return String.format("%s is a dead sorcerer. So bad, it could heal %s HP. He has the weapon %s", getName(), getHealCapacity(), this.weapon.toString());
        }

        return String.format("%s is a sorcerer with %s HP. It can heal %s HP. He has the weapon %s", getName(), getCurrentHealth(), getHealCapacity(), this.weapon.toString());
    }

    @Override
    public void attack(Character ennemy){
        this.heal(this);
        if (ennemy.weapon == null){
            ennemy.takeDamage(10);
        }else{
            ennemy.takeDamage(ennemy.weapon.getDamage());
        }

    }

    @Override
    public void takeDamage(int damage){
        this.setCurrentHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() < 0) this.setCurrentHealth(0); 
        

    }
}