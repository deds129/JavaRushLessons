package JavaRushLessons21;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * реализания многопточной программы для вывода информации (симуляция)
 * оператор -> машина
 */
public class NotifyWaitUsage {

     static List<String> strings = Collections.synchronizedList(new ArrayList<>());


    public static void main(String[] args) {
       Operator operator = new Operator();
       Machine machine =  new Machine();
       operator.start();
       machine.start();
       if(machine.isInterrupted()){
           operator.interrupt();
       }

        strings.add("");
    }

    /**
     * оператор дает информацию на печать
     */
    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (!Machine.interrupted()){
                synchronized (strings){
                    //читаем строку
                    strings.add(scanner.nextLine());
                    if(Machine.interrupted()){
                        scanner.close(); // как
                        this.interrupt(); // блядь

                    }
                    strings.notify(); //даем понять что мы выполнили действие

                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    interrupt();// остановить
                    scanner.close();// поток??

                }
            }

        }
    }

    /**
     * машина печатает информацию, получ. от оператора
     *
     */
    static class Machine extends Thread{
        int i=0;
        @Override
        public void run() {

            while (!(strings.get(i)).equals("exit")){
                synchronized (strings){ //синхронизируем по общ объекту
                    try {
                        strings.wait(); //ждем когда будет инфа
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        this.interrupt();
                    }
                    System.out.println(strings.get(i));
                    i++;
                }
            }
            this.interrupt();

        }

    }

}


