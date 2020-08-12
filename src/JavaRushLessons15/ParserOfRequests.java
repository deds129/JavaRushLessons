package JavaRushLessons15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.lang.String;
import java.util.ArrayList;

/*
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример ввода:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Пример вывода:
lvl view name

Еще пример ввода:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Пример вывода:
obj name
double 3.14
 */
public class ParserOfRequests {
    public static void main(String[] args) throws IOException {
reader();
    }
    public static ArrayList<String> reader() throws IOException {

        BufferedReader URLReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ссылку: ");
        String url = URLReader.readLine(); // считываем ссылку
        //блок инициализации
        String newStr = "";
        int begining =0;
        int ending = url.length();

        try {
            begining=url.indexOf('?');
            // System.out.println(begining); // получаем индексс символа '?'
            newStr=url.substring(begining + 1, ending);
           // System.out.println(newStr);
            String [] strings = newStr.split("&");

          for (String parametr: strings) {
              String num = "";
            if(parametr.contains("obj")){
                num=parametr.substring(4, parametr.length());
                try {
                    if(num.contains(".")){
                        alert(Double.valueOf(num));

                    }else{
                        alert(num);
                    }


                }catch (Exception e){
                    System.out.println(num);
                }
              }
//               System.out.print( parametr + " "); // выводим параметры + их значения
         }


            //теперь нужно вывести только параметры => обрабатываем каждый элемент массива отдельно
            ArrayList<String> parameters = new ArrayList<>();
          //  System.out.println("Параметры из URL ссылки: ");

            for ( String par: strings) {
                String parameter ="";
                int equal = 0;
                if (par.contains("=")) {
                    equal=par.indexOf('=');
                    parameter=par.substring(0, equal);
                }else{
                    parameter = par;
                }
parameters.add(parameter);
                System.out.print(parameter +" ");
            }

return parameters;

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
/*
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
 */
    public static void alert(double num){
      // String num=parametr.substring(4, parametr.length());
//
        System.out.println("double " + num);
    }
    public static void alert(String str){
        System.out.println("String "+ str);
    }

}
