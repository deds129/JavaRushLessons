package JavaRushLessons11.JavaRushLessons11;

import com.sun.xml.internal.ws.api.FeatureConstructor;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
3. Fly, Move, Eat для классов Dog, Car, Duck, Airplane

Есть public интерфейсы Fly(летать),
 Move(передвигаться), Eat(есть).
  Добавь эти интерфейсы классам Dog(собака),
  Car(автомобиль), Duck(утка), Airplane(самолет).
 */
public class OopIntetfaces {
    public static void main(String[] args) {
Dog1 dog1 = new Dog1();
Car car = new Car();
Duck duck = new Duck();
Airplane airplane = new Airplane();

car.move();
dog1.eat();
duck.eat();
duck.fly();
duck.move();
airplane.fly();

    }

}

 class Car implements IMove {


     public void move() {
         System.out.println("i can move");
     }
 }
 class Duck implements IMove, IFly, IEat{
     public void move() {
         System.out.println("i can move");
     }
     public void eat() {
         System.out.println("i can  eat ");
     }
     public void fly() {
         System.out.println("i can fly");
     }
 }
 class Airplane implements  IFly{


     @Override
     public void fly() {
         System.out.println("i can fly");
     }
 }
 class Dog1 implements IEat,IMove {


     @Override
     public void move() {
         System.out.println(" i can move");
     }

     @Override
     public void eat() {
         System.out.println("i can eat");

     }
 }






interface  IFly{
    void fly();
}
interface IMove{
    void move();
}
interface IEat{
    void eat();

}
