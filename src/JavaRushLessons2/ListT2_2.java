package JavaRushLessons2;
/*
Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
 */

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListT2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<String>();

        System.out.println("Введите \"M\"");
        String m=reader.readLine();
        int M=Integer.parseInt(m);

        System.out.println("Введите \"N\"");
        String n=reader.readLine();
        int N=Integer.parseInt(n);
        if (M>N){
            System.out.println("Error M>N!!!!");

        }

        System.out.println("ВВедите строки массива");
        for (int i=0; i < N; i++) {
            String str=reader.readLine();
            list.add(str);
        }

        list = newArray(list,M);
        System.out.println("Новый массив:"+ list);
    }

    public static ArrayList<String> newArray(ArrayList<String> list,int M) {
        //ArrayList<String> list2=new ArrayList<String>();
        for (int i = 0; i<M;i++){
            list.add(list.get(0));
            list.remove(0);
        }
        //list.addAll(list2);


return list;
    }
}


