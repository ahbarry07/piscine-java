import java.util.*;

public abstract class Character {
    
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;


    public Character(String name, int maxHealth, Weapon weapon){
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;
    }

    public String getName(){
        return this.name;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }
    protected void setCurrentHealth(int val){
        this.currentHealth = val;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }
    
    public Weapon getWeapon(){
        return this.weapon;
    }

    public String toString(){
        if (this.currentHealth == 0) return String.format("%s : KO", this.name);
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public abstract void takeDamage(int damage) throws DeadCharacterException;

    public abstract void attack(Character charac) throws DeadCharacterException;

    public static String printStatus(){
        if (allCharacters.isEmpty()) {
            return "------------------------------------------\n" + //
                "Nobody's fighting right now !\n" + //
                "------------------------------------------\n";
        }
                        
        StringBuilder status = new StringBuilder();
        status.append("------------------------------------------\n")
                .append("Characters currently fighting :\n");
    
        for (Character ch : allCharacters) {
            status.append(" - ").append(ch.toString()).append("\n");
        }
    
        status.append("------------------------------------------\n");
        return status.toString();
    }

    public static Character fight(Character ch1, Character ch2) {
        while (ch1.getCurrentHealth() > 0 && ch2.getCurrentHealth() > 0) {
            try {
                ch1.attack(ch2);
                if (ch2.getCurrentHealth() == 0) {
                    return ch1;
                }
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
                return ch1;
            }
    
            try {
                ch2.attack(ch1);
                if (ch1.getCurrentHealth() == 0) {
                    return ch2;
                }
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
                return ch2;
            }
        }
        return null;
    }

}
