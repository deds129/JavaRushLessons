package JavaRushLessons9;
public class Exception3 {
    public static void main(String[] args) {
        try {
            System.out.println("Method starts");
            method1();
        }catch (Exception e){
            System.out.println("Global catch");
        }
    }



    public static void method1() throws Exception_1, Exception_2, Exception_3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception_1();
        if (i == 1)
            throw new Exception_2();
        if (i == 2)
            throw new Exception_3();
    }
}
class Exception_1 extends Exception{

}
class Exception_2 extends  Exception_1{

}
class Exception_3 extends Exception_2{

}

