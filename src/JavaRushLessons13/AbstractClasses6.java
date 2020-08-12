package JavaRushLessons13;
/*
Dog, Cat и Mouse

1. Создать классы Dog, Cat и Mouse.
2. Реализовать интерфейсы в добавленных классах, учитывая что:
    - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
    - Мышь(Mouse) может передвигаться и может быть съедена.
    - Собака(Dog) может передвигаться и съесть кого-то.
 */
public class AbstractClasses6 {
    public static void main(String[] args) {
Dog dog = new Dog(" Пес ");
Cat cat = new Cat(" Кот ");
Mouse mouse = new Mouse(" Мышь ");

        System.out.println("Я " + dog.getName()+" "+dog.iCan()+dog.eat()+cat.getName()+" , "+ mouse.getName() + "и " +dog.move() );
    }
}
abstract class Animal{
  private String name;
  public String getName(){
      return name;}
      public Animal(String name){
          this.name = name;
      }

    public String iCan(){
        return " и Я могу ";
    }
}




class Dog extends Animal implements IMove,IEat {
    public Dog(String name) {
        super(name);
    }




    @Override
    public String eat() {
        return "есть";
    }

    @Override
    public String move() {
        return "двигаться";
    }
}

class Cat extends Animal implements IMove,IEat,IEatable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "есть";
    }

    @Override
    public String eatable() {
        return "быть съеденым";
    }

    @Override
    public String move() {
        return "двигаться";
    }
}

class Mouse extends Animal implements IMove,IEatable{

    public Mouse(String name) {
        super(name);
    }

    @Override
    public String eatable() {
        return "Быть съеденным";
    }

    @Override
    public String move() {
        return "двигаться";
    }
}
interface IEat{
    String eat();
}
interface  IEatable{
    String eatable();
}
interface  IMove{
    String move();
}
