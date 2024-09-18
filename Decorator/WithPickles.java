
public class WithPickles extends RacletteDecorator{
    
    private Raclette raclette;

    public WithPickles(Raclette raclette){
        super(raclette);
    }
    @Override
    public int getCalories(){
        return this.raclette.getCalories() + 10;
    }

    @Override
    public String getIngredients(){
        return this.raclette.getIngredients() + ", cornichons";
    }
}
