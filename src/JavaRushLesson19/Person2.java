package JavaRushLesson19;

import java.util.Date;

public class Person2 {
    private String name;
    private Date birthDate;

    public Person2(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}