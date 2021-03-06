package JavaRushLessons15;

import java.io.Serializable;
/*
1. Максимально простой код 1

Упрости код - убери все наследования классов, которые и так будут добавлены автоматически при компиляции

PS: Взаимосвязь между объектами me и zapp - Has-a (использует)
 */
public class Solution6_1 {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about level15.lesson06.task01?"));
        System.out.println(me.askZapp("When will be the next update?"));
    }
    public interface SpecificSerializable extends Serializable {
    }
    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }
    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();
        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }
        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}