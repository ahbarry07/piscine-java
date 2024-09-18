
public class WithColdMeats extends RacletteDecorator {
    
    public WithColdMeats(Raclette raclette){
        super(raclette);
    }

    @Override
    public int getCalories(){
        return this.getCalories() + 350;
    }

    @Override
    public String getIngredients(){
        return this.getIngredients() + ", charcuterie";
    }
}
