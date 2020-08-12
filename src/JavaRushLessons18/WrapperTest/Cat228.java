package JavaRushLessons18.WrapperTest;



public class Cat228 {
    public static void main(String[] args) {
        Cat228 cat = new Cat228("Васька");
        Cat228 catWrap = new CatWrapper(cat);
        pName(catWrap);

    }
    public static void pName(Cat228 named){
        System.out.println(named.getName());
    }

    private String name;

    public Cat228() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Cat228(String name){
        this.name = name;
    }

}
