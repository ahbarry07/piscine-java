
public class MaxStrategy extends OperationStrategy{
    
    @Override
    public int execute(int a, int b){
        return a > b ? a : b;
    }
}
