public class DoOp {
    public static String operate(String[] args) {
        if(args.length == 3){
            int val1 = Integer.parseInt(args[0]);
            int val2 = Integer.parseInt(args[2]);
            String operand = args[1];

            switch(operand){
                case "+":
                    int result1 = val1 + val2;
                    return String.valueOf(result1);
                case "-":
                    int result2 = val1 - val2;
                    return String.valueOf(result2);
                case "*":
                    int result3 = val1 * val2;
                    return String.valueOf(result3);
                case "/":
                    if(val2 == 0){
                        return "Error";
                    }
                    int result4 = val1 / val2;
                    return String.valueOf(result4);
                case "%":
                    if(val2 == 0){
                        return "Error";
                    }
                    int result5 = val1 / val2;
                    return String.valueOf(result5);
                default:
                    return "Error";
            }
        }
        return "it depend on the input.";
    }

    public static void main(String[] args) {
        System.out.println(operate(new String[]{"1","+","2"}));
        System.out.println(operate(new String[]{"1","-","1"}));
        System.out.println(operate(new String[]{"1","%","0"}));
        System.out.println(operate(args));
    }

}
