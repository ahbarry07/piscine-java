
public class Context {
    
    private OperationStrategy operationStrategy = new AddStrategy();

    public Context(){}

    public void changeStrategy(OperationStrategy operationStrategy){
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b){
        return this.operationStrategy.execute(a, b);
    }


    public static void main(String[] args)  {
        Context context = new Context();
        System.out.println(context.execute(23, 43));
    
        context.changeStrategy(new MaxStrategy());
        System.out.println(context.execute(23, 43));
    
        context.changeStrategy(new ConcatStrategy());
        System.out.println(context.execute(23, 43));
      }
}
