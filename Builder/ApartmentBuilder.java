
public class ApartmentBuilder implements HousingBuilder {
    
    private Apartment apartment;
    public ApartmentBuilder(){
        this.apartment = new Apartment();
    }

    public ApartmentBuilder setSize(int size){
        this.apartment.setSize(size);
        return this;
    }
    public ApartmentBuilder setPrice(int price){
        this.apartment.setPrice(price);
        return this;
    } 
    public ApartmentBuilder setRooms(int rooms){
        this.apartment.setRooms(rooms);
        return this;
    }
    public ApartmentBuilder setName(String name){
        this.apartment.setName(name);
        return this;
    }

    public Housing build(){
        return this.apartment;
    }
}
