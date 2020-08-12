package JavaRushLessons;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Barsic";
        cat1.weigth = 8;
        cat1.age = 1;
        cat1.stange = 50;


        Cat cat2 = new Cat();
        cat2.name = "Murich";
        cat2.weigth = 10;
        cat2.age = 2;
        cat2.stange = 100;
          System.out.println(cat2.fight(cat1));



    }
     static class Cat {
         String name;
         int age;
         int weigth;
         int stange;







         boolean fight(Cat anotherCat) {

             int power1 = this.age + this.stange + this.weigth;
             int power2 = anotherCat.age + anotherCat.stange + anotherCat.weigth;
             if (power1 > power2){
                 System.out.println("Ваш кот победил");
             return  true;
             }else {
                 System.out.println("Ваш кот проиграл");
                 return false;
             }


         }


     }}