package JavaRushLessons9;


import java.util.ArrayList;
import java.util.HashMap;

public class Exceptions1 {
    public static void main(String[] args) {
        System.out.println("pr starts"+ '\n');
        try{
            System.out.println("method 1 starts");
           // method1();
           // method2();
            //method3();
          //  method4();
            method5();
        }catch (NullPointerException e)
        {

            System.out.println("Reference is null. Exception has been caught");
            String s = e.getMessage();
            System.out.println(s);

        }catch (ArithmeticException e){
            System.out.println("Division by zero. Exception has been caught");
            String s = e.getMessage();
            System.out.println(s);

        }catch (Exception e)
        {
            System.out.println("Other type of exception");
            String s = e.getMessage();
            System.out.println(e + s);

        }

    }
    public static  void method1(){
int a = 42;
int b = 0;
        System.out.println("Result: "  + a/b);
    }
    public static  void method2(){
        String s = null;
        String m = s.toLowerCase();
        System.out.println("Result: " + m);
    }
    public static void  method3(){
        int[] m = new int[2];
        m[8] = 5;
        System.out.println("Result is: " + m[8]);
    }
    public static void method4() {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
        System.out.println("Result is : " + s);
    }
    public static void method5(){
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);

    }


}
