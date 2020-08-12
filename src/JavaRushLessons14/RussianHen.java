package JavaRushLessons14;

public class RussianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 228;
    }

    @Override
    String chikenCountry() {
        return  henCountry.russia;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна Россия. Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц";
    }
}
