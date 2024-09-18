
public class HouseBuilder implements HousingBuilder{
    
    private House house;
    public HouseBuilder(){
        this.house = new House();
    }

    public HouseBuilder setSize(int size){
        this.house.setSize(size);
        return this;
    }
    public HouseBuilder setPrice(int price){
        this.house.setPrice(price);
        return this;
    } 
    public HouseBuilder setRooms(int rooms){
        this.house.setRooms(rooms);
        return this;
    }
    public HouseBuilder setName(String name){
        this.house.setName(name);
        return this;
    }

    public Housing build(){
        return this.house;
    }
}
