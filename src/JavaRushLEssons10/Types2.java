import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4. Большая зарплата

Вывести на экран надпись «Я не хочу изучать Java,
я хочу большую зарплату» 40 раз по образцу.

(не совсем)
 */
public class Types2 {
    public static void main(String[] args) throws IOException {
Subtract(Liner());
    }
    private static String Liner() throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        String line = bufferedReader.readLine();
        return line;

    }

    private static void  Subtract(String line){
        //int a = line.length();
        for(int i = 0;i<line.length();i++) {
            if (!line.isEmpty());
            line=line.substring(i);
            System.out.println(line);
        }
    }

}
