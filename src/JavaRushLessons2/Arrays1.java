package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays1 {
    public static void main(String[] args) throws IOException {
    Arrays1 a = new Arrays1();
    a.initializeArray();
    }

    void initializeArray() throws IOException {
        int[] chisla=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < chisla.length; i++) {
            String s=reader.readLine();
            chisla[i]=Integer.parseInt(s);
        }
        int max = chisla[0];
         for (int i = 1; i< chisla.length;i++){
             if(chisla[i]> max){
                 max = chisla[i];
             }
         }
        System.out.println("Max is:"+ max);

    }
}

