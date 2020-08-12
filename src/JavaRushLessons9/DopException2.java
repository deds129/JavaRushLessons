package JavaRushLessons9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
3. Метод в try..catch

Вводить с клавиатуры числа.
Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData,
 кроме объявления списка, где будут храниться числа и BufferedReader
 - а) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
 */
public class DopException2 {
    public static void main(String[] args) throws IOException {
readData();
    }


    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        try{
            while (true){
            String sNum = reader.readLine();
            int num = Integer.parseInt(sNum);
            nums.add(num);}

    }catch (Exception e){
            for(Integer a:nums){
            System.out.println(a);
            }
        }
    }

}

