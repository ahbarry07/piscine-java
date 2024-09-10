public class DeadCharacterException extends Exception{

    private Character character;

    public DeadCharacterException(Character chr){
        this.character = chr;
    }

    public String getMessage(){
        String nature = this.character instanceof Sorcerer ? "sorcerer" : this.character instanceof Monster ? "monster" : "templar";
        return String.format("The %s %s is dead.", nature, this.character.getName());
    }

    
}