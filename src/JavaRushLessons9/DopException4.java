package JavaRushLessons9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class DopException4 {
    public static void main(String[] args) throws IOException {
        System.out.println(readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/1.txt"));


        System.out.println(readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/2.txt"));

       appendUsingFileWriter("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/1.txt","C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/2.txt");

        //System.out.println(readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/1.txt"));


       // System.out.println(readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/2.txt"));
    }



    //чтение файла
    public static String fileReader() throws IOException {
        String filename = "C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/1.txt";
        String contents = readUsingScanner(filename);
        return contents;
    }

    private static String readUsingScanner(String filename) throws IOException {
        Scanner scanner = new Scanner(Paths.get(filename), StandardCharsets.UTF_8.name());
        //здесь мы можем использовать разделитель, например: "\\A", "\\Z" или "\\z"
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }

    private static void appendUsingFileWriter(String filePath, String filePath2) throws IOException {
        File file=new File(filePath);
        FileWriter fr=null;


        File file2=new File(filePath2);
        FileWriter fr2=null;

        String text1 = readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/1.txt");
        String text2 = readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/2.txt");;
        String text3 = readUsingScanner("C:/Users/Chudinov Nikolay/IdeaProjects/JavaRushLessons/src/JavaRushLessons9/2.txt");;

            try {
                //1 > 3
            fr=new FileWriter(file2, true);
            fr.write(text1);

            //2>1
            fr2= new FileWriter(file,true);
            fr2.write(text3);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fr2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }








}
