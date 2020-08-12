package JavaRushLessons15;
/*
2. Тренировка мозга

Найти логическую ошибку: метод doAction в реализации интерфейса Movable должен выдавать "moving".
Исправьте ошибку, при необходимости измените (отрефакторите) интерфейс Movable.
Результат вывода в консоль должен быть:
flying
moving

Требования:
Результат вывода на экран должен соответствовать условию.
В классе Duck должен быть реализован метод doAnotherAction.
Метод doAnotherAction() в классе Duck должен выводить на экран строку "Moving".
-----Метод move в классе Util должен вызывать метод doAnotherAction у переданного ему объекта.
Класс Duck должен реализовывать интерфейс CanMove.
Класс Duck должен реализовывать интерфейс CanFly.
 */
public class DopZadachi2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {
            System.out.println("Flying");
        }

        public void doAnotherAction(){
            System.out.println("Moving");
        }
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) {
            animal.doAnotherAction();
        }
    }

    public interface CanFly {
        void doAction();
    }

    public interface CanMove {
        void doAnotherAction();
    }
}
