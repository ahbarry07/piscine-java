
public class Excalibur{
    
    private String name;
    private static Excalibur INSTANCE =  new Excalibur();

    private Excalibur(String name){
        this.name = name;
    }
    
    private Excalibur(){
        this.name = "Sword";
    }

    public String getName(){
        return this.name;
    }

    public static Excalibur getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args)  {
        System.out.println(Excalibur.getInstance().getName());
    }
}