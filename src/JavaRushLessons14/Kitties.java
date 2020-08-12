package JavaRushLessons14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
2. Коты

1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
 */
public class Kitties {
    public static void main(String[] args) throws IOException {
getCatByCat(new Cat());
    }

    public static ArrayList<String> getCatByCat(Cat cat) throws IOException {
        ArrayList<String> catNames=new ArrayList<String>();
        System.out.println("Вводите имена котов");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String catName;
        while (true) {
            cat = new Cat();
            catName=reader.readLine();
            catNames.add(catName);
            cat.setCatname(catName);
            System.out.println(getCatByCat(cat));
            if (catName.isEmpty()) {
                break;
            }
        }
        return catNames;
    }

    }
    class Cat{
    String catname;
        public void setCatname(String catname) {
            this.catname=catname;
        }

        public String getCatname() {
            return catname;

        }


    }




