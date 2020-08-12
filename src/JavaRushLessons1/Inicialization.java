package JavaRushLessons;

public class Inicialization {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

           cat1.initialize("yarullina",3,"yellow");
        System.out.println(cat1.name+" "+cat1.color+" "+ cat1.weight+" "+cat1.age+" "+cat1.address);
    }
}
class Cat{
    String name = null;
    int age = 0;
    int weight = 0;
    String address = null;
    String color = "White";


    //- Имя
    //- Имя, возраст
    //- Имя, возраст, пол
    public void initialize(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    public void initialize(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    public void initialize(String name,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    public void initialize(String address,int weight,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
}