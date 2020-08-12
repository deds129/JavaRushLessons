package JavaRushLessons13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//C:\Users\Chudinov Nikolay\IdeaProjects\JavaRushLessons\numlist.txt
public class DopInterfaces2_2 {
    public static void main(String[] args) throws IOException {
catcher(nameReader());
    }
    public static String nameReader() throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название(расположение) файла в  формате \"<name>.txt\"");
        String filename="";
        try {
           filename = nameReader.readLine();
        } catch (IOException e) {
            System.out.println("Файл с данным названием отсутсвует!");
        }
nameReader.close();
return filename;
    }

    public static  void catcher(String filename) throws IOException {
        FileInputStream inputStream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new FileReader( filename));
//int data = 0;
String text;
ArrayList<Integer> a =new ArrayList<Integer>();
        while ((text = br.readLine())!=null){
            if (Integer.parseInt(text)%2==0){
                a.add(Integer.parseInt(text));
            }
        }
        Collections.sort(a);
        for (Integer i: a){
            System.out.println(i);
        }
        br.close();
        inputStream.close();
    }

}
