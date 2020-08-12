package JavaRushLessons15;

public class Earth implements Planet{
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Earth();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
