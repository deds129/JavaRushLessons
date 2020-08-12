package JavaRushLessons15;
/*
5. Статики 4

Внутри статического блока:
1. Создайте класс Cat
2. Внутри Cat создайте поле класса String name = "Пушок"
3. Создайте объект класса Cat - myCat
4. Присвойте статическому объекту Object cat объект, созданный в п.3
5. Выведите в консоль myCat.name
 */
public class Statici5_4 {
    public static void main(String[] args) {
Cat myCat = new Cat();
Object cat = myCat;
        System.out.println(myCat.name);
    }

}class Cat{
    String name = "Пушок";

}
