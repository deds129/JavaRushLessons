package JavaRushLessons15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
4. Закрепляем Singleton pattern

1. Найти в гугле пример для - Singleton pattern Lazy initialization.
2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки

Требования:
Класс Sun не должен позволять создавать объекты своего типа извне класса.
Класс Sun должен содержать приватное статическое поле instance типа Sun.
В классе Sun должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
Метод getInstance в классе Sun должен ВСЕГДА возвращать один и тот же объект.
Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
Класс Moon не должен позволять создавать объекты своего типа извне класса.
Класс Moon должен содержать приватное статическое поле instance типа Moon.
В классе Moon должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
Метод getInstance в классе Moon должен ВСЕГДА возвращать один и тот же объект.
Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
Класс Earth не должен позволять создавать объекты своего типа извне класса.
Класс Earth должен содержать приватное статическое поле instance типа Earth.
В классе Earth должен быть реализован публичный статический метод getInstance возвращающий значение поля instance.
Метод getInstance в классе Earth должен ВСЕГДА возвращать один и тот же объект.
Поле instance должно быть инициализировано после первого обращения к методу getInstance, но не раньше.
Метод readKeyFromConsoleAndInitPlanet должен быть вызван в статическом блоке класса Solution.
Метод readKeyFromConsoleAndInitPlanet должен считывать одну строку с клавиатуры.
Метод readKeyFromConsoleAndInitPlanet должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.
 */
public class Singletones {
    public static void main(String[] args) {

        readKeyFromConsoleAndInitPlanet();

    }
    public static Planet thePlanet;


/*
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки
 */
    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();
            if (key.equals(Planet.EARTH)){
                thePlanet = Earth.getInstance();
            }else if(key.equals(Planet.MOON)){
                thePlanet = Moon.getInstance();
            }else if(key.equals(Planet.SUN)){
                thePlanet = Sun.getInstance();
            }else{ thePlanet = null;
            }
        } catch (Exception e) {
        }
    }
}

