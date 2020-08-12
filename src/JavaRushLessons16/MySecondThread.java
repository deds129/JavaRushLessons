package JavaRushLessons16;
/*
2. My second thread

1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
 */
public class MySecondThread {
    public static void main(String[] args) {
TestThread2 testThread2 = new TestThread2();
testThread2.run();
    }

    public static class TestThread2 extends Thread{
static {
    System.out.println("it's static block inside TestThread");
}

        @Override
        public void run() {
            System.out.println("it's run method");
        }
    }

}
