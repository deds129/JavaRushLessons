package JavaRushLessons15;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Разные методы для разных типов

1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.

можно переделать.
 */
public class DopZadachi1 {
    public static void main(String[] args) {

        printer(reader());
    }

    static ArrayList<String> reader() {
        BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        String input="";
        while (true) {
            try {
                input=bufferReader.readLine();
                if (input.equals("exit")) {
                    bufferReader.close();
                    break;
                }
                list.add(input);
            } catch (IOException e) {
                System.out.println("Ошибка ввода");
            }

        }
        return list;
    }

    static void printer(ArrayList<String> list) {
        /*
        2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
         */
        for (String word : list) {
            if (word.contains(".")) {
                print(Double.valueOf(word));


            }else{
                try {
                    Integer in = Integer.parseInt(word);
                    if ( in< 128 && in > 0) {
                        print(Short.valueOf(word));
                    } else if (Integer.parseInt(word) >= 128) {
                        print(Integer.valueOf(word));
                    } else {
                        String word1=new String(word);
                        print(word1);
                    }
                }catch (NumberFormatException e){
                    System.out.println(word);
                }
                }
            }
        }

   public  static void print(double a){
       System.out.println("Это число типа Double " + a);
   }
    public  static  void print (short a){
       System.out.println("Это число типа short " + a);
   }
    public  static void print (int a ){
       System.out.println("Это число типа int " + a);
   }
    public  static void print (String a){
       System.out.println("Это число типа String " + a);
   }
}



