
public class BaseRaclette implements Raclette{
    
    public int getCalories(){
        return 1000;
    }

    public String getIngredients(){
        return "Patate, fromage à raclette";
    }

    public String toString(){
        return String.format("%s pour %s calories", getIngredients(), getCalories());
    }


    public static void main(String[] args)  {
        Raclette r = new BaseRaclette();
        System.out.println(r);
        r = new WithPickles(r);
        System.out.println(r);
        r = new WithColdMeats(r);
        System.out.println(r);
    }
}
