import java.util.ArrayList;
import java.util.List;

public class DecimalBaseObserver implements NumericBaseObserver{
    private List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state){
        String str = Integer.toString(state);
        this.events.add(str);
    }

    @Override
    public List<String> getEvents(){
        return this.events;
    }
}
