package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadException {
    public static void main(String[] args) throws  IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            FileInputStream file=new FileInputStream(reader.readLine());

            if (file.available() < 1000) {
                file.close();
                reader.close();
               // throw new DownloadException();
            }
        }
    }
    //public static class DownloadException extends Exception{

    }
//}

