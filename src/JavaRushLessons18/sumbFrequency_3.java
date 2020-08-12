package JavaRushLessons18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sumbFrequency_3 {
    public static void main(String[] args) throws IOException {

        if(args.length == 0){
            throw new IllegalArgumentException();
        }

        FileInputStream file;
        file=new FileInputStream(new File("1.txt"));
        HashMap<Character, Integer> map = new HashMap<>();

        while (file.available() > 0) {
            char ch = (char) file.read();
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }

        file.close();

        SortedMap<Character, Integer> sortedMap = new TreeMap<>(map);
        print(sortedMap);

        /* // This variant compiles at the javarush's server!!!

        FileInputStream in = new FileInputStream(args[0]);
        long[] ascii = new long[256];
        while (in.available()>0)
            ascii[in.read()]++;
        for (int i = 0; i < 256; i++)
        {
            if (ascii[i] != 0)
                System.out.println((char)i + " " + ascii[i]);
        }
        in.close();*/
    }

    public static void print(SortedMap<Character, Integer> map){

        for(Map.Entry<Character, Integer> pair : map.entrySet() )
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
