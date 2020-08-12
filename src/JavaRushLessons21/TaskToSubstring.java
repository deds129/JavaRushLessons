package JavaRushLessons21;
/*
1. Найти подстроку

Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример: "JavaRush - лучший сервис обучения Java."

Результат: "- лучший сервис обучения"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
 */
public class TaskToSubstring {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String str){
        int[] space = new int[str.length()];
        char[] temp = str.toCharArray();
        int j=0;
        for(int i=0;i<temp.length;i++){
            if (temp[i]==' '){
                space[j]=i; // находим положение пробелов
                j++;
            }
        }
        str=str.substring(space[0],space[4]);

        return str;
    }
}
