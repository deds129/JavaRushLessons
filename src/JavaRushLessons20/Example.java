package JavaRushLessons20;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    User user = new User();
    //чтобы не было NPE
    Weapon weapon = new Weapon();
    weapon.attack =10;
    user.weapon = weapon;

    user.userName = "User1";
    user.userHp = 100;


    //код, который нельзя переписать, нет возможности сериализовать (transient)
        ImmutableData immutableData = new ImmutableData();
        immutableData.temp=10;
        user.data = immutableData;
        user.staticParametr = 0;

        
    //save to file
        FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        user.staticParametr = 1; //статические переменные не сериализуются

        //upload from file
        FileInputStream fileInputStream = new FileInputStream("temp.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user1 = (User) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(user1.userHp +"\n"
        +user1.userName +"\n"+
        user1.weapon.attack +"\n"+
                user1.data);






    }
}
