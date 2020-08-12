package JavaRushLessons13;

import java.util.ArrayList;
import java.util.List;

public class Repka {
    public static void main(String[] args) {
        List<Person1> plot = new ArrayList<Person1>();
        plot.add(new Person1("Репка", "Репку"));
        plot.add(new Person1("Дедка", "Дедку"));
        plot.add(new Person1("Бабка", "Бабку"));
        plot.add(new Person1("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
class RepkaStory {
    static void tell(List<Person1> items) {
        Person1 first;
        Person1 second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
        }
    }
}
 class Person1 implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person1(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person1 person) {
        System.out.println(this.name + " за " + person.namePadezh);

    }
}
 interface RepkaItem {
    public String getNamePadezh();
}


