public class Templar extends Character implements Healer, Tank{

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon){
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        ch.setCurrentHealth(ch.getCurrentHealth() + getHealCapacity());
        if (ch.getCurrentHealth() > ch.getMaxHealth()){
            ch.setCurrentHealth(ch.getMaxHealth());
        }
    }

    @Override
    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return String.format("%s has been beaten, even with its %s shield. So bad, it could heal %s HP. He has the weapon %s", getName(), getShield(), getHealCapacity(), this.getWeapon().toString());
        }

        return String.format("%s is a strong Templar with %s HP. It can heal %s HP and has a shield of %s. He has the weapon %s", getName(), getCurrentHealth(), getHealCapacity(), getShield(), this.getWeapon().toString());
    }

    @Override
    public void attack(Character ennemy) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        if (this.getWeapon() == null){
            ennemy.takeDamage(6);
        }else{
            ennemy.takeDamage(this.getWeapon().getDamage());
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.setCurrentHealth(this.getCurrentHealth() - (damage - getShield()));
        if (this.getCurrentHealth() < 0) this.setCurrentHealth(0); 
        
    }
}