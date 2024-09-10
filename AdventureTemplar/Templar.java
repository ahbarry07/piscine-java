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

    public static void main(String[] args) {
        Templar alistair = new Templar("Alistair", 20, 5, 4);
        Templar roderick = new Templar("Roderick", 10, 3, 2);

        Character.fight(alistair, roderick);

        alistair.heal(alistair);

        System.out.println(Character.printStatus());
    }
}