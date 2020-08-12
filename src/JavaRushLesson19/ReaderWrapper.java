package JavaRushLesson19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
1. Ридер обертка

В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна преобразовывать весь текст в заглавные буквы
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.
 */
public class ReaderWrapper {
    public static void printSomething()
    {
        System.out.println("Hi");
        System.out.println("My name is Amigo");
        System.out.println("Bye-bye!");
    }



    public static void main(String[] args) {
        PrintStream consoleStream = System.out;  //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream  outputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(outputStream); //создаем адаптер к классу PrintStream
        System.setOut(stream);//Устанавливаем его как текущий System.out
        printSomething();//Вызываем функцию, которая ничего не знает о наших манипуляциях
        String result = outputStream.toString();//Преобразовываем записанные в наш ByteArray данные в строку
        result = result.toUpperCase();
        System.setOut(consoleStream); //Возвращаем все как было
        //выводим ее в консоль
        System.out.println(result);
    }
}
