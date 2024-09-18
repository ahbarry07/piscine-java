
public class Excalibur{
    private String name;
    private Excalibur(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static Excalibur getInstance(){
        return new Excalibur("Sword");
    }

    public static void main(String[] args)  {
        System.out.println(Excalibur.getInstance().getName());
    }
}