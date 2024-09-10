
public class Monster extends Character{

    public Monster(String name, int maxHealth, Weapon weapon){
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString(){
        if (getCurrentHealth() > 0){
            return String.format("%s is a monster with %s HP. He has the weapon %s", getName(), getCurrentHealth(), this.weapon.toString());
        }
        return String.format("%s is a monster and is dead. He has the weapon %s", getName(), this.weapon.toString());
    }

    @Override
    public void attack(Character ennemy){
        if (ennemy.weapon == null){
            ennemy.takeDamage(7);
        }else{
            ennemy.takeDamage(ennemy.weapon.getDamage());
        }
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