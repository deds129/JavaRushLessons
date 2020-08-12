package JavaRushLessons9;

import java.io.IOException;
import java.rmi.RemoteException;

public class Exception5 {
    public static void main(String[] args) {

    }

    public static void processException(Exception5 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e) {
            System.out.println("RemoteException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


        public void method1() throws IOException {
            throw new IOException();
        }

        public void method2() throws NoSuchFieldException {
            throw new NoSuchFieldException();
        }

        public void method3() throws RemoteException {
            throw new RemoteException();
        }


}


