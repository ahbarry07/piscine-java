
public class WithPickles extends RacletteDecorator{

    public WithPickles(Raclette raclette){
        super(raclette);
    }
    @Override
    public int getCalories(){
        return this.getCalories() + 10;
    }

    @Override
    public String getIngredients(){
        return this.getIngredients() + ", cornichons";
    }
}
