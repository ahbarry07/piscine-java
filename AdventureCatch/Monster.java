
public class Monster extends Character{

    public Monster(String name, int maxHealth, Weapon weapon){
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString(){
        if (getCurrentHealth() > 0){
            return String.format("%s is a monster with %s HP. He has the weapon %s", getName(), getCurrentHealth(), this.getWeapon().toString());
        }
        return String.format("%s is a monster and is dead. He has the weapon %s", getName(), this.getWeapon().toString());
    }

    @Override
    public void attack(Character ennemy) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (this.getWeapon() == null){
            ennemy.takeDamage(7);
        }else{
            ennemy.takeDamage(this.getWeapon().getDamage());
        }
    }

    @Override
    public void takeDamage(int damage)throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int percent = (int) Math.floor(damage * 0.80);
        this.setCurrentHealth(getCurrentHealth() - percent);
        if (this.getCurrentHealth() < 0){
            this.setCurrentHealth(0);
        }
    }
}