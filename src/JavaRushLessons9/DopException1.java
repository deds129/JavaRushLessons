package JavaRushLessons9;
/*
1. Деление на ноль

Создай метод public static void divisionByZero,
в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch.
 Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */
public class DopException1 {
    public static void main(String[] args) {
try{
    divisionBtZero();
}catch (Exception e){
e.printStackTrace();
}
    }




    public static void divisionBtZero(){
        int a = 2020;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }
}

