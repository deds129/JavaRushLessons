package JavaRushLesson19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
3. Выводим только цифры

В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить только цифры
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

Пример вывода:
12345678
 */
public class OnlyDecimals {
    public static void printSomething() {
        System.out.println("Htei, Te");
        System.out.println("My123 name is t1235 kashi");
        System.out.println("Bye-2bye, te! 41 ");
        System.out.println("2+2=10");
    }


    public static void main(String[] args) {
        PrintStream consoleStream=System.out;  //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream=new PrintStream(outputStream); //создаем адаптер к классу PrintStream
        System.setOut(stream);//Устанавливаем его как текущий System.out
        printSomething();//Вызываем функцию, которая ничего не знает о наших манипуляциях
        String result=outputStream.toString();//Преобразовываем записанные в наш ByteArray данные в строку

        result=result.replaceAll("\\D+","");
        System.setOut(consoleStream); //Возвращаем все как было
        //выводим ее в консоль
        System.out.println(result);
    }
}
