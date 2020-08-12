package JavaRushLessons18.WrapperTest;

public class CatWrapper extends Cat228 {
    private Cat228 original;
    public CatWrapper (Cat228 cat){
        this.original=cat;
    }
    public String getName()
    {
        return "Кот по имени " + original.getName();
    }
    public void setName(String name){
        original.setName(name);
    }

}
