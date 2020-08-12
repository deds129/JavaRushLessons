package JavaRushLesson19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
4. Решаем пример

В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
 */
public class Virazhenia {
    public static void printSomething() {
        System.out.println("3 + 6 = ");
    }


    public static void main(String[] args) {
        PrintStream consoleStream=System.out;  //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream=new PrintStream(outputStream); //создаем адаптер к классу PrintStream
        System.setOut(stream);//Устанавливаем его как текущий System.out
        printSomething();//Вызываем функцию, которая ничего не знает о наших манипуляциях
        String result=outputStream.toString();//Преобразовываем записанные в наш ByteArray данные в строку

        String vir[] = result.split(" "); //3+2=5
        int res =0;

             int a = Integer.parseInt(vir[0]);
             int b = Integer.parseInt(vir[2]);



            if(vir[1].equals("*")){
                res = a * b;
            }else if (vir[1].equals("+")){
                res = a + b;
            }else if (vir[1].equals("-")){
                 res = a - b;}

        System.setOut(consoleStream); //Возвращаем все как было
        //выводим ее в консоль

        System.out.println(a + " "+ vir[1]+" "+b+" = "+res);

    }
}
