package JavaRushLessons14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
5. Player and Dancer

1. Подумать, что делает программа.
2. Изменить метод haveRest так, чтобы он вызывал метод
    - play, если person имеет тип Player
    - dance, если person имеет тип Dancer


    Требования:
Класс Player должен реализовывать интерфейс Person.
Класс Dancer должен реализовывать интерфейс Person.
-Метод haveFun должен вызывать метод play, если переданный ему объект является игроком(Player).
-Метод haveFun должен вызывать метод dance, если переданный ему объект является танцором(Dancer).
Метод main должен считывать данные с клавиатуры.
Метод main должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".
 */
public class PlayerNDancer {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) { // пока введенная строка не "exit"
            if ("player".equals(key)) { // если ввели "player"
                person = new Player(); // то Player
                haveFun(person);
            } else if ("dancer".equals(key)) { // если ввели "dancer"
                person = new Dancer(); // то Dancer
                haveFun(person);
            } else {
                System.out.println("Wrong name, please choose dancer/player");
            }
           // haveFun(person); // вызываем метод haveFun и передаем в него параметр - объект person (Player() или Dancer())
        } reader.close();
    }

    public static void haveFun(Person person) {

        if(person instanceof Player) {
            ((Player) person).play();
        } else if (person instanceof Dancer) {
            ((Dancer)person).dance();
        }

    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
