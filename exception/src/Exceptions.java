import java.util.Scanner;

public class Exceptions extends Throwable {
    public static int test (int num1, int num2){
        if(num2==0)
            // java.lang.ArithmeticException是Java中的一个运行时异常类，它继承自java.lang.RuntimeException类。
            // 该异常表示在数学运算中发生了算术错误或不合法的操作。
            //异常的原因和场景
            //ArithmeticException异常通常在以下情况下发生：
            //除数为零：当我们尝试将一个数除以零时，会抛出ArithmeticException异常。例如，int result = 10 / 0;。
            //模数为零：当我们尝试对一个数取模时，如果模数为零，同样会抛出ArithmeticException异常。例如，int result = 10 % 0;。
            //需要注意的是，除数为零和模数为零都会导致数学运算的不合法性，因此Java会抛出ArithmeticException异常来表示这种错误情况
            throw new ArithmeticException("Divisor cannot be zero");

        return num1/num2;
    }
   /* public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int number1=input.nextInt();
        int number2=input.nextInt();
        try {
            int res=test(number1,number2);
            System.out.println("结果是:"+res);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("除数不能为0.");
        }

    }*/
    //从异常中获取异常信息
    public static void main(String[]args){
        try{
            System.out.println(sum(new int []{1,2,3,4,5}));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("\n"+ex.getMessage());
            System.out.println("\n"+ex.toString());
            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement [] traceElements=ex.getStackTrace();
            for(int i=0;i< traceElements.length;i++) {
                System.out.print("method"+traceElements[i].getMethodName());
                System.out.print("("+traceElements[i].getClassName()+":");
                System.out.println(traceElements[i].getLineNumber()+")");
            }
        }
    }
    private static int sum(int []array){
        int result=0;
        for(int i=0;i<=array.length;i++)
            result+=array[i];
        return result;
    }
}


