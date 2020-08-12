package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInFile2 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
          //  throw new IllegalArgumentException();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader fileBufReader = new BufferedReader(fileReader);

        String res;

        while((res = fileBufReader.readLine()) != null){
            if(res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }

        reader.close();
        fileBufReader.close();
        fileBufReader.close();

    }
}
