package JavaRushLessons20;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //save + enycript
        FileOutputStream fileOutputStream = new FileOutputStream("temp2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov's passport data");
        objectOutputStream.writeObject(userInfo);
        objectOutputStream.close();

        //load + decript
        FileInputStream fileInputStream = new FileInputStream("temp2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserInfo userInfo1 = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);
        objectInputStream.close();
    }

}
