import java.util.ArrayList;
import java.util.List;

public class BinaryBaseObserver implements NumericBaseObserver{
    
    private List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state){
        String str = Integer.toBinaryString(state);
        this.events.add(str);
    }

    @Override
    public List<String> getEvents(){
        return this.events;
    }
}
