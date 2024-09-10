
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

    public static void main(String[] args) {
        Sorcerer gandalf = new Sorcerer("Gandalf", 20, 5);
        Character frodon = new Character("Frodon", 20);
        Sorcerer saroumane = new Sorcerer("saroumane", 10, 3);

        Character.fight(frodon, saroumane);
        
        gandalf.heal(frodon);

        System.out.println(Character.printStatus());
    }
}