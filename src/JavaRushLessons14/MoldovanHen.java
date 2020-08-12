package JavaRushLessons14;

public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 69;
    }

    @Override
    String chikenCountry() {
        return henCountry.moldova;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна Молдовия. Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц";
    }
}
