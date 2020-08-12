package JavaRushLessons2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
5. Бум

Написать программу, которая ведёт обратный отсчёт с 30 до 0,
 и в конце выводит на экран текст «Бум!»
 . Программа должна уменьшать число 10 раз в секунду.
 Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100);
 */
public class Boom {
    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Установите время до взрыва");
        String str=reader.readLine();
        int i1 = Integer.parseInt(str);


        for(int i =i1;i>=0;i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Бум!");

    }


}
