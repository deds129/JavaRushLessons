package JavaRushLessons21;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
Сравниваем модификаторы
Реализовать логику метода isAllModifiersContainSpecificModifier, который проверяет, содержит ли переданный параметр allModifiers значение конкретного модификатора specificModifier.
P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.
Требования:
1. Метод isAllModifiersContainSpecificModifier должен быть статическим.
2. Метод isAllModifiersContainSpecificModifier должен возвращать значение типа boolean.
3. Метод isAllModifiersContainSpecificModifier должен принимать два параметра типа int.
4. Метод isAllModifiersContainSpecificModifier должен возвращать корректное значение в соответствии с условием задачи(true, если заданный модификатор присутствует в allModifiers, иначе false).
*/
public class Modifi {

    public static void main(String[] args) {
        //модификаторы класса
        int modifiersOfThisClass = Modifi.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();  //модификаторы метода
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
    }

    /**
     *
     * @param allModifiers - все модификаторы класса/метода
     * @param specificModifier - заданый модификатор класса/метода
     * @return есть ли данный модификатор в списке всех модификаторов класс
     */
    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
        int mod = allModifiers & specificModifier;
        return mod == specificModifier ? true : false;

    }

    /**
     * @author deds
     * @return method main method
     */
    private static Method getMainMethod() {
        Method[] methods = Modifi.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
