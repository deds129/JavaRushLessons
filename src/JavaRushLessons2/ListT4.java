package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки.
 */
public class ListT4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<String>();

        System.out.println("ВВедите строки массива");

        while (true) {
            String str=reader.readLine();
            if (str.equals("end")) {
                System.out.println("Ввод строк окончен");
                break;
            } else {
                list.add(str);
            }
        }
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
