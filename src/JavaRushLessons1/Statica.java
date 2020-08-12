public class Statica {
    public static void main(String[] args) {
    Cat.setCatCount(5);
    Cat.getCatCount();
    Util.setDistance(6,2,2,1);

       // System.out.println("Num of cats: "+Cat.getCatCount());
    }
}
class Cat{
    static  int catCount;
    static int getCatCount(){
       return Cat.catCount;
    }
    static void setCatCount(int catCount){
        Cat.catCount =catCount;
    }
     public Cat(){
         catCount++;
    }
}
class Util{ // не сеттер просто метод и вообще здесь кривой код
    static int setDistance(int x1, int y1, int x2, int y2 ){
        double l = Math.sqrt(Math.pow(x2 -x1,2)+ Math.pow(y2 -y1,2) );
        int distance = (int) l; // int a = Math.round(l);
        System.out.println( distance);
                return distance;}
                }


