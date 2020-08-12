package JavaRushLesson17;
// тестовый метод
public class Worker{

    private static int num;

    public static void main(String[] args) {
         Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
         t1.start();
        try {
            t1.join(); //чтобы поток успел выполнить цикл
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num);
    }
    public static synchronized void increaceNum(){ //потоки не мешают друг другу
        num++;
    }
}
class Counter implements  Runnable {


    @Override
    public void run() {
       for(int i = 0; i<2000;i++){
           Worker.increaceNum();
       }
    }
}
