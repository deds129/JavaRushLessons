package JavaRushLessons21.RegExp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {
    public static void main(String[] args) {

        //"||b[A-Za-z0-9._%+-]@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4||b"  - регулярное выражение проверки  mail'а
      //  System.out.println("myEmail@mail.ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b")); //проверка корректности с помощью рег выражения

        Pattern p=Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"); //шаблон поиска
        Matcher m=p.matcher("Jack's mail is myEmail@mail.ru"); // строка в которой мы ищем совпадения
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " "); // можем указать начало(start) вхождения и само вхождение(group)
        }
        System.out.println("");
    }
}
