package JavaRushLessons8;

import java.util.HashMap;
import java.util.Map;

/*
3. Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.


Программа не должна считывать значения с клавиатуры.
В методе addCatsToMap() объяви переменную коллекции Map с типом элементов String,
 Cat и сразу проинициализируй ee.
Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats,
согласно условию.
Программа должна выводить содержимое коллекции на экран,
 каждую пару через дефис и с новой строки.
 */
public class Collections3 {
    public static void main(String[] args) {
        Map<String,Cat> catMap = new HashMap<String,Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        cat1.setName("мурка");
        cat2.setName("васька");
        cat3.setName("рыжик");
        cat4.setName("серый");
        cat5.setName("снежок");
        cat6.setName("босс");
        cat7.setName("дымка");
        cat8.setName("борис");
        cat9.setName("визя");
        cat10.setName("гарфи");



        catMap.put(cat1.getName(),cat1);
        catMap.put(cat2.getName(),cat2);
        catMap.put(cat3.getName(),cat3);
        catMap.put(cat4.getName(),cat4);
        catMap.put(cat5.getName(),cat5);
        catMap.put(cat6.getName(),cat6);
        catMap.put(cat7.getName(),cat7);
        catMap.put(cat8.getName(),cat8);
        catMap.put(cat9.getName(),cat9);
        catMap.put(cat10.getName(),cat10);










        for (Map.Entry<String,Cat> pair: catMap.entrySet()) {
           String key = pair.getKey();
           //String value = pair.();
            System.out.println(key);

        }
    }
}

 class  Cat{   //скорее всего нужно будет переписать
    String name;
    public  void setName(String name)
    {

        this.name = name;
    }
  public String getName(){
        return name;
  }


}

