package JavaRushLessons9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;

/*
1. Исключения

Есть метод, который выбрасывает два исключения,
 унаследованные от Exception, и два унаследованных от RuntimeException: NullPointerException,
  ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException,
 но не перехватывать ArithmeticException и URISyntaxException. Как это сделать?
 */
public class Exception2 {
    public static void main(String[] args) throws Exception {
        try {
            method7();
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(e);
        }

    }

    private static void method7() throws NullPointerException,
            FileNotFoundException, ArithmeticException,
            URISyntaxException{
        int i=(int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}