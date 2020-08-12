package JavaRushLesson19;
/*2. Ридер обертка 2

В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна заменять все подстроки "te" на "??"
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReaderWrapper2 {
    public static void printSomething() {
        System.out.println("Htei, Te");
        System.out.println("My name is tekashi");
        System.out.println("Bye-bye, te!");
    }


    public static void main(String[] args) {
        PrintStream consoleStream=System.out;  //запоминаем настоящий PrintStream в специальную переменную
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream=new PrintStream(outputStream); //создаем адаптер к классу PrintStream
        System.setOut(stream);//Устанавливаем его как текущий System.out
        printSomething();//Вызываем функцию, которая ничего не знает о наших манипуляциях
        String result=outputStream.toString();//Преобразовываем записанные в наш ByteArray данные в строку
        result=result.replaceAll("te","??");
        System.setOut(consoleStream); //Возвращаем все как было
        //выводим ее в консоль
        System.out.println(result);
    }
}
