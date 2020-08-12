package JavaRushLessons14;
/*
2. Дегустация вин.

1. Создать абстрактный класс Drink с реализованным методом void taste(), который выводит в консоль "Вкусно".
2. Создать класс Wine, который наследуется от Drink, с реализованным методом String getHolidayName(), который возвращает строку "День рождения".
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом String getHolidayName(), который возвращает строку "Новый год".
4. Написать такую реализацию методов getDeliciousDrink, getWine, getBubblyWine, чтобы метод main отработал без ошибок.
5. Каждый класс и интерфейс должны быть в отдельных файлах.
6. Метод main менять нельзя!

Требования:
Абстрактный класс Drink должен быть создан в отдельном файле.
В классе Drink должен быть реализован метод public void taste(), который выводит на экран строку - "Вкусно".
Класс Wine должен быть создан в отдельном файле и быть потомком класса Drink.
В классе Wine должен быть реализован метод public String getHolidayName(), который возвращает строку - "День Рождения".
Класс BubblyWine должен быть создан в отдельном файле и быть потомком класса Wine.
В классе BubblyWine должен быть реализован метод public String getHolidayName(), который возвращает строку - "Новый Год".
В классе Solution должен быть реализован метод getDeliciousDrink(), который возвращает объект типа Wine.
В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
В классе Solution должен быть реализован метод getBubblyWine(), который возвращает объект типа BubblyWine.
 */
public class Dop_WineDegustation {
    public static void main(String[] args) {
      getDelicious().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }
    public static Wine getDelicious(){
        Wine wine = new Wine();
        return wine;
    }
    public static Wine getWine(){
        Wine wine = new Wine();
        return wine;
    }
    public static BubblyWine getBubblyWine(){
        BubblyWine bubblyWine = new BubblyWine();
        return  bubblyWine;
    }



}

