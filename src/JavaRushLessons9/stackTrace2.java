package JavaRushLessons9;

public class stackTrace2 {
    public static void main(String[] args) {
        method1();
    }
    public static String method1(){
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String name = stackTraceElement[2].getMethodName();
        System.out.println(name);
        return name;
    }
    public static String method2(){
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String name = stackTraceElement[2].getMethodName();
        System.out.println(name);
        return name;
    }
    public static String method3(){
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String name = stackTraceElement[2].getMethodName();
        System.out.println(name);
        return name;
    }
    public static String method4(){
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
       String name = stackTraceElement[2].getMethodName();
        System.out.println(name);
        return name;

        }
    }

