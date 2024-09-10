public class DeadCharacterException extends Exception{

    private Character character;

    public DeadCharacterException(Character chr){
        this.character = chr;
    }

    public String getMessage(){
        String nature = this.character instanceof Sorcerer ? "sorcerer" : this.character instanceof Monster ? "monster" : "templar";
        return String.format("The %s %s is dead.", nature, this.character.getName());
    }

    public static void main(String[] args) {
        Weapon feu = new Weapon("Boule de feu", 7);
        Sorcerer triss = new Sorcerer("Triss Merigold", 30, 5, feu); 
        Templar geralt = new Templar("Geralt de Riv", 28, 2, 5, feu); 
        DeadCharacterException exceptionTriss = new DeadCharacterException(triss);
        DeadCharacterException exceptionGeralt = new DeadCharacterException(geralt);
        
        System.out.println(exceptionTriss.getMessage());
        System.out.println(exceptionGeralt.getMessage());
    }
}