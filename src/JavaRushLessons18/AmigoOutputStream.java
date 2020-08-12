package JavaRushLessons18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
3. AmigoOutputStream

1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
 */
public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "1.txt";
    private FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fOS) throws FileNotFoundException
    {
        super(fileName);
        this.fileOutputStream = fOS;
    }

    @Override
    public void close() throws IOException
    {
        fileOutputStream.flush();
        fileOutputStream.write(new String("JavaRush © 2012-2013 All rights reserved.").getBytes());
        fileOutputStream.close();
    }
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void write(int b) throws IOException{
        fileOutputStream.write(b);
    }


    public void write(byte[] b) throws IOException{
        fileOutputStream.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException{
        fileOutputStream.write(b,off,len);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
