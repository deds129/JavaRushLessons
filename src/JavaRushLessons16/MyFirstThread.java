package JavaRushLessons16;

public class MyFirstThread {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread thread1 = new Thread(testThread);
        System.out.println("исполнения метода main");
        thread1.start();
        System.out.println("исполнения метода main");
    }
}
class TestThread implements Runnable{
    public void run() {
        System.out.println("My first thread / исполнение нити");
    }
}
