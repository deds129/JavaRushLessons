package JavaRushLessons9;
/*
3. Метод должен вернуть номер строки кода, из которого вызвали этот метод

Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
 Воспользуйся функцией: element.getLineNumber().

 В классе должно быть 5 методов (метод main не учитывать).
Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
 */
public class stackTrace3 {
    public static void main(String[] args) {
method1();
        System.out.println("Method was checked. Everything is clear.");
    }
    public static void method1(){
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement[1].getLineNumber();
        String name = stackTraceElement[1].getMethodName();
        System.out.println(" метод " + name + " вызван из строки№: " + a);
    }

    public static void method2(){
    method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement[1].getLineNumber();
        String name = stackTraceElement[1].getMethodName();
        System.out.println(" метод " + name + " вызван из строки№: " + a);
    }

    public static void method3(){

    method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement[1].getLineNumber();
        String name = stackTraceElement[1].getMethodName();
        System.out.println(" метод " + name + " вызван из строки№: " + a);
    }

    public static void method4(){
      method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement[1].getLineNumber();
        String name = stackTraceElement[1].getMethodName();
        System.out.println(" метод " + name + " вызван из строки№: " + a);
    }

    public static void method5(){
        int i =0 ;
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement[1].getLineNumber();
        String name = stackTraceElement[1].getMethodName();
        System.out.println("метод " + name + " вызван из строки№: " + a);

        }


    }

