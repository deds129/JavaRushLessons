package JavaRushLessons16;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import com.sun.xml.internal.ws.wsdl.writer.document.Message;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/*
2. Клубок

Задача: 1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка: Нить 4 можно проверить методом isAlive()
 */
public class Klubok {
    public static List<Thread> list = new ArrayList<Thread>(4);
    static {

        list.add(new Thread1());
        list.add(new Thread2());
        list.add(new Thread3());
       // list.add(new Thread4());
        list.add( new Thread5());


    }

    public static void main(String[] args) {
        list.get(0).start();
        list.get(1).start();
        list.get(2).start();
        list.get(3).start();
        //list.get(4).start();

    }


}
class Thread1 extends Thread{
    @Override
    public void run() {
        while(true){

        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {

            }
            throw new InterruptedException();
        }catch (InterruptedException e) {
          //  e.printStackTrace();
            System.out.println("InterruptedException");
        }
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Ура!");
                sleep(5000);
            }
        } catch (InterruptedException e) {

        }
    }
}
//class Thread4 extends Thread implements Message {
//
//    public void showWarning() {
//
//        this.interrupt();
//        try {
//            this.join();
//        } catch (Exception e) {
//
//        }
//
//    }
//
//    @Override
//    public void run() {
//        Thread current=Thread.currentThread();
//        while (!current.interrupted()) {
//        }
//    }
//}



//1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
class Thread5  extends Thread {

    @Override
    public void run() {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        try {
            while (!isInterrupted()){
                String word = reader.readLine();
                if(word.equals("N")) this.interrupt();
                else {
                    int integer = Integer.parseInt(word);
                    sum += integer;
                }
            }
            try {
                throw new InterruptedException();

            } catch (InterruptedException e) {
                System.out.println(sum);
               // this.interrupt();

            }
        }catch (IOException e){
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }






}
