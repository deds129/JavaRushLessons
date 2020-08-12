package JavaRushLessons14;
/*
3. Singleton.

Задача: Класс является синглтоном (реализует паттерн(шаблон) Singleton), если позволяет создать всего один объект своего типа.

Реализовать Singleton pattern:
1. Создай класс Singleton в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе Singleton приватными (private).
6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.

 Иногда необходимо написать класс, у которого можно будет создать только один объект. Например, класс, отвечающий за логирование или подключение к базе данных.

 */
public class Singleton {
      private static final Singleton INSTANCE = new Singleton();


    private Singleton(){

    }

        public static Singleton getInstance() {
            return INSTANCE;
        }
        

}
