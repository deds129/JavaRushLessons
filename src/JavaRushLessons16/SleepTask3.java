package JavaRushLessons16;
/*
3. Big Ben clock

1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!


Метод printTime должен работать примерно секунду.
Метод printTime должен увеличивать (инкрементировать) количество секунд, хранимое в переменной seconds.
-Секунд, после икрементирования времени, не может быть больше 59. Должно увеличиться количество минут.
-инут, после икрементирования времени, не может быть больше 59. Должно увеличиться количество часов.
-Часов, после икрементирования времени, не может быть больше 23.

Да все ок с валидатором. А вот твои часы врут...
Даже на том примере, что в задании, неправильно показывают ;).

Между 23-59-59 и полночь не проходит секунды - сразу перескакивает :)
В итоге, за 4 секунды работы, по твоим часам проходит 5 :)

 */

public class SleepTask3 {
    public static volatile boolean isStopped = false;
    //--------------------------------------------------------------------------------
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }
    //---------------------------------------------------------------------------------
    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }
//------------------------------------------пишем код

        private void printTime() throws InterruptedException {
            //написать код тут

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));

            } else if (seconds == 0) {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }

            seconds++;
            Thread.sleep(1000);
            System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));


            if (seconds == 59){
                Thread.sleep(1000);
                seconds=0;
                minutes++;}
            if(minutes==60){
                minutes=0;
                hours++;
            }
            if(hours==24){
                hours=0;
            }



        }}}
