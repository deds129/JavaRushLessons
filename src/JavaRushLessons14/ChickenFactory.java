package JavaRushLessons14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Куриная фабрика

Написать Фабрику(Factory) по производству кур(Hen)
1. Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainianHen, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">;
где Sssss - название страны
где N - количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур
9. Все созданные вами классы должны быть в отдельных файлах
 */
public class ChickenFactory {
    public static void main(String[] args) throws IOException {
      Hen hen = ChickenFactory.getHen(henCountry.belarus);
        System.out.println(hen.getDescription());




}
    public static Hen getHen(String henCountry) throws IOException {
        Hen hen=null;
        switch (henCountry){
            case "Россия":
                hen = new RussianHen();
                break;
            case "Украина":
             hen = new UkrainianHen();
                break;
            case "Беларусь":
                hen = new BelarusianHen();
                break;
            case  "Молдовия":
                    hen = new MoldovanHen();
                    break;
            default:
                System.out.println("Такой страны не найдено!");

        }
        return hen;
    }
    }
    interface henCountry{
    String russia = "Россия";
    String belarus = "Беларусь";
    String moldova = "Молдовия";
    String ukrain = "Украина";
    }


abstract class Hen implements henCountry{
    abstract int getCountOfEggsPerMonth();
    abstract String chikenCountry();
    String getDescription() {
        return "Я курица ";
    }
}

