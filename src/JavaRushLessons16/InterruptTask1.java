package JavaRushLessons16;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.

Требования:
Метод run класса Stopwatch (секундомер) должен содержать цикл.
Метод run должен вызывать Thread.sleep(1000).
Метод run должен увеличивать значение поля seconds на 1 каждую секунду.
После прерывания работы нити Stopwatch (вызова метода interrupt), метод run должен вывести количество секунд (seconds) в консоль.
В классе Stopwatch должен быть только один метод run.
 */
public class InterruptTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stopwatch stopwatch = new Stopwatch();
stopwatch.start();


            reader.readLine();
            stopwatch.interrupt();
            reader.close();

    }
}
class Stopwatch extends Thread{
    public static int seconds;

    public  void run(){
        Thread current = Thread.currentThread();
        while(!current.isInterrupted()){
            try {
                Thread.sleep(1000);
               // System.out.println(seconds);
                seconds++;
            }catch (InterruptedException e){
                System.out.println( seconds+" seconds have been passed");
                System.out.println("Stopwatch was stoped");
                break;
            }
        }
    }
}

