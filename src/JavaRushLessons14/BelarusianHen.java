package JavaRushLessons14;

public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 420;
    }

    @Override
    String chikenCountry() {
        return henCountry.belarus;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна Беларусь. Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц";
    }}
