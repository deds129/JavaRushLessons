package JavaRushLessons8;

import java.util.HashSet;
import java.util.Set;

/*
2. Множество всех животных

1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats,
 который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs,
 который должен возвращать множество с 3 собаками.
4. Реализовать метод join,
 который должен возвращать объединенное множество всех животных
  - всех котов и собак.
5. Реализовать метод removeCats,
 который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets,
 который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
 */
public class SetNMap_2 {
    public static void main(String[] args) {

      Set<Cat> cats = createCats();
      Set<Dog> dogs = createDogs();
      Set<Object> pets = Join(dogs,cats);
//removeCats(pets,cats);
printPets(pets);


        }
       // public static class Pets{}
    public static class Cat{}
    public static class Dog{}

public static HashSet<Cat> createCats(){
    HashSet<Cat> cats=new HashSet<>();
    for (int i = 0; i<4;i++){
        cats.add(new Cat());
    }
    return cats;
}
public static HashSet<Dog> createDogs(){
    HashSet<Dog> dogs=new HashSet<>();
    for (int i=0;i<3;i++){
        Dog dog1=new Dog();
        dogs.add(dog1);
    }
    return dogs;
}

public static Set<Object> Join(Set<Dog> dogs, Set<Cat> cats){
      Set<Object> pets = new HashSet<>();
      pets.addAll(dogs);
      pets.addAll(cats);
return pets;
}

public static void removeCats(Set<Object> pets,Set<Cat> cats){
        pets.removeAll(cats);
}public static  void printPets(Set<Object> pets){
for(Object text : pets){
    System.out.println(text);
}
    }

    }



