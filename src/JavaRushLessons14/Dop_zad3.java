package JavaRushLessons14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3. User, Looser, Coder and Proger.

1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из вышеуказанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
 */
public class Dop_zad3 {
    public static void main(String[] args) throws IOException {
        doWork(creator());
    }
    public static Person creator() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Person person=null;
        String name="";
        while (true) {
            person=null;
            name=reader.readLine();
            if (name.equals("user")) {
                person=new User();
            } else if (name.equals("looser")) {
                person=new Looser();
            } else if (name.equals("coder")) {
                person=new Coder();
            } else if (name.equals("proger")) {
                person=new Proger();

            } else
                break;

//            switch (name){
//               case "user": person = new User();
//                case "looser": person = new Looser();
//                case "coder": person = new Coder();
//                case "proger": person = new Proger();
//                default: break;
//
//            }
            doWork(person);

        }
        return person;
    }




    public static void  doWork(Person person){
        if (person instanceof User ){
            ((User)person).live();
        }else if (person instanceof Looser ){
            ((Looser)person).doNothing();
        }else if (person instanceof Coder){
            ((Coder)person).coding();
        }else if (person instanceof  Proger){
            ((Proger)person).enjoy();
        }else{
            System.out.println("Упс! Ошибка!");
        }
    }
}
