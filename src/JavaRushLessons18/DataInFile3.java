package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DataInFile3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader idReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = idReader.readLine()) != null) {
            list.add(line);
        }
        for (String s : list) {
            ArrayList<String> goodArray = new ArrayList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
            while(stringTokenizer.hasMoreTokens()) {
                goodArray.add(stringTokenizer.nextToken());
            }
            if (args[0].equals(goodArray.get(0))) {
                printGood(goodArray);
                break;
            }
        }
        reader.close();
        idReader.close();
    }
    private static void printGood(ArrayList<String> goodArray) {
        for (int i = 0; i < goodArray.size() - 1; i++) {
            System.out.print(goodArray.get(i) + " ");
        }
        System.out.println(goodArray.get(goodArray.size() - 1));
    }
}
