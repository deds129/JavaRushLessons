package JavaRushLessons13;

import java.io.*;

public class OutIn {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("2.txt");
        InputStream inSteram = new FileInputStream("1.txt");

        while (inSteram.available()>0){
            int data = inSteram.read();
            outputStream.write(data);
        }
        inSteram.close();
        outputStream.close();

        }
    }

