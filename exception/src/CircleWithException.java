public class CircleWithException {
 public static void main(String []args)
 {
     try
     {
         method1();

     }
     catch(Exception ex)
     {
         ex.printStackTrace();
         //System.out.println("异常流");
     }

 }
    public static void method1()throws Exception{
     try{
         method2();
     }
     catch(Exception ex){
         throw new Exception("new info from method1",ex);
     }

    }
    public static void method2()throws Exception{
        try{
            method3();
        }
        catch(Exception ex){
            throw new Exception("new info from method2",ex);
        }

    }
    public static void method3()throws Exception{
     throw new Exception("a exception from method3");
    }


}
