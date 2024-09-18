import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver{
    private List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state){
        String str = Integer.toHexString(state);
        this.events.add(str);
    }

    @Override
    public List<String> getEvents(){
        return this.events;
    }
}
