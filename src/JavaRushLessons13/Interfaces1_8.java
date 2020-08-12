package JavaRushLessons13;
/*
8. Жив или нет

1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presidentable.
5. Унаследуй интерфейс Presidentable от интерфейса Person.
 */
public class Interfaces1_8 {
}
interface Person{
    boolean isAlive();
}
class Presidentable implements Person{

    @Override
    public boolean isAlive() {
        return true;
    }
}
