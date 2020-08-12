package JavaRushLessons11.JavaRushLessons11;

import com.sun.corba.se.spi.ior.ObjectKey;

/*
5. Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»

Написать метод, который определяет,
 объект какого класса ему передали,
  и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class OOP3 {
    public static void main(String[] args) {
Animal animal = new Animal();
Cow cow = new Cow();
Whale whale = new Whale();
Dog dog = new Dog();

checker(whale);
checker(cow);
checker(dog);
checker(animal);

    }
    public static void  checker(Object o){
        if (o instanceof Dog){
            System.out.println(((Dog) o).name);

        }else  if (o instanceof  Cow) {
            System.out.println(((Cow) o).name);

        }else if (o instanceof Whale){
            System.out.println(((Whale)o).name);
        }else
            System.out.println("Неизвестное животное");
    }
}





class Animal{
    String name = "Животное";
}
 class Cow extends  Animal{
   String name = "Коровка";
}
class Whale extends Animal{
    String name = "Кит";
}
class Dog{
    String name = "Пес";
}

