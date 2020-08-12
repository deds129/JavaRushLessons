package JavaRushLessons13;

import com.sun.java.accessibility.util.Translator;

/*
1. Переводчик с английского

1. Создать класс EnglishTranslator, который наследуется от Translator.
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Метод main менять нельзя.
 */
public class AbstractClasses_1 {
    public static void main(String[] args) {
EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());

    }
    public static abstract class Translator{
        public abstract String getLanguage();
        public String translate(){
            return "Я могу преводчик с " + getLanguage()+ " языка";
        }
}
static class EnglishTranslator extends Translator {


    @Override
    public String getLanguage() {
        return "Английского";
    }
}
}
