
public class WithColdMeats extends RacletteDecorator {
    
    private Raclette decoratedRaclette;

    public WithColdMeats(Raclette raclette){
        super(raclette);
    }

    @Override
    public int getCalories(){
        return this.decoratedRaclette.getCalories() + 350;
    }

    @Override
    public String getIngredients(){
        return this.decoratedRaclette.getIngredients() + ", charcuterie";
    }
}
