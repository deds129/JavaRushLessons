package JavaRushLessons21;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class SecondTab {
    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("JavaRush -  лучший  сервис обучения  Java."));
    }
    public static String getPartOfString(String string) throws Exception {
        if (string == null)
            throw new TooShortStringException();
        if (string.equals(""))
            throw new TooShortStringException();
        int firstTabulation = string.indexOf("\t");
        if (firstTabulation == -1)
            throw new TooShortStringException();
        int secondTabulation = string.indexOf("\t", firstTabulation+1);
        if (secondTabulation == -1)
            throw new TooShortStringException();
        return string.substring(firstTabulation+1, secondTabulation);
    }

    public static class TooShortStringException extends Exception {

    }
}
