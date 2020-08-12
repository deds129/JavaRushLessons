package JavaRushLessons20;

import java.io.Serializable;

public class User implements Serializable {
    String userName;
    int userHp;
    static int staticParametr;
    //объектный тип
    Weapon weapon;
     transient ImmutableData data;

}
