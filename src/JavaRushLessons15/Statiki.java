package JavaRushLessons15;




/*
3. Статики 3

1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
- intVar с типом int
- doubleVar с типом double
- DoubleVar с типом Double
- booleanVar с типом boolean
- ObjectVar с типом Object
- ExceptionVar с типом Exception
- StringVar с типом String

2. В методе main вывести их значения в заданном порядке.
 */
public class Statiki {
    public static void main(String[] args) {
Test test = new Test();
test.print1();
    }
}



 class  Test{
public int intVar;
public double doubleVar;
public Double DoubleVar;
public boolean booleanVar;
public Object ObjectVar;
public Exception ExceptionVar;
public String StringVar;

public  void print1(){
        System.out.println(intVar);
        System.out.println(doubleVar);
        System.out.println(DoubleVar);
        System.out.println(booleanVar);
        System.out.println(ObjectVar);
        System.out.println(ExceptionVar);
        System.out.println(StringVar);

        }
        }
