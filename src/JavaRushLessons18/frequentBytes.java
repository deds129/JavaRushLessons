package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class frequentBytes {
    public static void main(String[] args) throws IOException {
        List<Integer> byteList=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла");
        String fileName=reader.readLine();

        FileInputStream fileInputStream=new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            int data=fileInputStream.read();
            byteList.add(data);
        }
        // System.out.println(byteList);
        fileInputStream.close();

        System.out.println(Frequent(Catcher(byteList)));
        System.out.println(Rare(Catcher(byteList)));
        System.out.close();
        fileInputStream.close();
    }


    //первый способ
    static Map<Integer, Integer> Catcher(List<Integer> bytelist) {
        Collections.sort(bytelist);
        Map<Integer, Integer> nums=new HashMap<Integer, Integer>();//k,v
        //можно загнать под отдельный метод для следующей задачи
        for (Integer b : bytelist) {

            //добавляем ключ - число из листа,
            Integer byteFromList=nums.get(b); ////ПОчему так??
            nums.put(b, (byteFromList == null) ? 1 : byteFromList + 1);
        }
//        for (Map.Entry<Integer,Integer> pair : nums.entrySet()) {
//            Integer key = pair.getKey();
//            Integer value = pair.getValue();
//            System.out.println(key+ ":" + value);
//        }
        return nums;
    }



        static  String Frequent(Map<Integer,Integer> nums) {
            Integer indexOfmaxValue=null;
            Integer frequentValue = 1;

            for (Map.Entry<Integer,Integer> pair:nums.entrySet()) {

                Integer key = pair.getKey();
                Integer value = pair.getValue();

                if(pair.getValue()>= frequentValue){
                    indexOfmaxValue = pair.getKey();
                    frequentValue = pair.getValue();
                }
            }
            return "Most frequent Value= " + frequentValue.toString() +":"+
                    "index = "+ indexOfmaxValue.toString();
        }

    static  String Rare(Map<Integer,Integer> nums) {
        Integer indexOfrareValue=null;
        Integer rareValue = 2097152;

        for (Map.Entry<Integer,Integer> pair:nums.entrySet()) {

            Integer key = pair.getKey();
            Integer value = pair.getValue();

            if(pair.getValue()<= rareValue){
                indexOfrareValue = pair.getKey();
                rareValue = pair.getValue();
            }
        }
        return "Most rare Value= " + rareValue.toString() +":"+
                "index = "+ indexOfrareValue.toString();
    }
    }






