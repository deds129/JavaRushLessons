package JavaRushLesson17.Tests;

public class VolatileWork {
    static volatile int i;

    public static void main(String[] args) {
        //THreads
        new MyThreadWrite().start();
        new MyThreadRead().start();

    }
    // поток работает всегда
    static class MyThreadWrite extends Thread{
        @Override
        public  void run() {
            while (i<5){

                System.out.println("increment i to "+ (++i));
               // yield();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // поток сюда не заходит
    // значение закешированно = 0 всегда

    static  class MyThreadRead extends Thread{
        public  void run(){
            int localVar = i;
            while(localVar<5){
                if(localVar !=i){
                    yield();
                    System.out.println("new value i is: "+i);
                    localVar = i;
                }
            }
        }
    }
}

