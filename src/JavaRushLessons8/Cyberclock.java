package JavaRushLessons8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cyberclock {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Привет! это часы)");
        System.out.println("нажмите любую клавишу чтобы остановить часы");


        String m="";
        while (true) {
            Date currentTime=new Date();
            String kek=String.format("Текущее время: %tT", currentTime);
            if (m.isEmpty()) {
                String str=String.format("Текущее время: %tT", currentTime);
                Thread.sleep(1000);
                System.out.println(str);

            } else {
                break;
            }


        }


    }
}
