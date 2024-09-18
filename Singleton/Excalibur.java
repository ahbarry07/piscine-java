
public class Excalibur{
    
    private String name;
    private static Excalibur insExcalibur;

    private Excalibur(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static Excalibur getInstance(){
        if (insExcalibur == null){
            return new Excalibur("Sword");
        }
        return insExcalibur;
    }

    public static void main(String[] args)  {
        System.out.println(Excalibur.getInstance().getName());
    }
}