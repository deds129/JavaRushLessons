package JavaRushLessons14;

public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 1488;
    }

    @Override
    String chikenCountry() {
        return henCountry.ukrain;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна Украина. Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц";
    }
}


