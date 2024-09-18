
public class ConcatStrategy extends OperationStrategy{
    
    @Override
    public int execute(int a, int b){
        String str = Integer.toString(a) + Integer.toString(b);
        return Integer.parseInt(str);
    }
}
