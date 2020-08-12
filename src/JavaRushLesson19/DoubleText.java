package JavaRushLesson19;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class DoubleText {
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

        try(FileWriter writer = new FileWriter("3.txt", false))
        {
            writer.write(result);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.setOut(consoleStream); //Возвращаем все как было
        //выводим ее в консоль
        System.out.println(result);
    }
}
