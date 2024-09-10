import java.util.*;

public abstract class Character {
    
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();


    public Character(String name, int maxHealth){
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
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
    
    public String toString(){
        if (this.currentHealth == 0) return String.format("%s : KO", this.name);
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character charac);

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

    public static Character fight(Character ch1, Character ch2){
        while (ch1.getCurrentHealth() > 0 && ch2.getCurrentHealth() > 0) {
            //ch1 attack ch2
            ch1.attack(ch2);
            if (ch2.getCurrentHealth() == 0){
                return ch1;
            }
            //ch2 attack ch1
            ch2.attack(ch1);
            if (ch1.getCurrentHealth() == 0){
                return ch2;
            }
        }
        return null;
    }


}
