public class Character {
    
    public final int maxHealth;
    public int currentHealth;
    public final String name;

    public Character(String name, int maxHealth){
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
    }

    public String getName(){
        return this.name;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public String toString(){
        if (this.currentHealth == 0) return String.format("%s : KO", this.name);
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public void takeDamage(int damage){
        if (this.currentHealth > damage) this.currentHealth -= damage;
        else this.currentHealth = 0;
    }

    public void attack(Character charac){
        charac.takeDamage(9);
    }

    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Character uruk = new Character("Uruk", 5);
        
        System.out.println(aragorn.toString());
        System.out.println(uruk.toString());
        
        aragorn.attack(uruk);

        System.out.println(uruk.toString());
        
        aragorn.takeDamage(12);

        System.out.println(aragorn.toString());
    }
}
