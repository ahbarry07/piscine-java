
public class Apartment implements Housing {
    
    private int size;
    private int price;
    private int rooms;
    private String name;

    public Apartment(){}

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public void setRooms(int rooms){
        this.rooms = rooms;
    }

    public String toString(){
        return String.format("Apartment{size=%d, price=%d, rooms=%d, name=%s}", this.size, this.price, this.rooms, this.name);
    }

    public static void main(String[] args) {
        Housing house = new HouseBuilder()
                .setName("Maison")
                .setRooms(4)
                .setSize(80)
                .setPrice(100000)
                .build();
        Housing apartment = new ApartmentBuilder()
                .setName("Appart")
                .setRooms(2)
                .setSize(30)
                .setPrice(25000)
                .build();

        System.out.println(house);
        System.out.println(apartment);
    }
}
