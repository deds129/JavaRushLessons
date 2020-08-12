package JavaRushLEssons10;

import javafx.concurrent.Task;

//1 Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
//2Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765

public class Types {
    public static void main(String[] args) {
Task1();
Task2();
Task3();
Task5();
    }
    //5. Задача №5 на преобразование целых типов
    //Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256

    public static void Task5(){
        int a = (byte)44;
        int b = (int) 300;
        short c =(short) (b - a);
        System.out.println(c);
    }
    public static void Task1(){
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a*b);
        double f = (char) 1234.15;
        long d = (char) (a + f / c + b);
        System.out.println(d);
    }
    public static void Task2(){
        int a = 15;
        int b = 4;
        float c =(float) a / b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
    //3 Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
    public static void Task3(){
        float f = (float)128.50;
        int i = (int)f;//128
        int b = (int) (i + f);//256
        System.out.println((byte)b);
    }

}
