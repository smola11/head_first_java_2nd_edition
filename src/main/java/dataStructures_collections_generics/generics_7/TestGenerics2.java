package dataStructures_collections_generics.generics_7;

import java.util.ArrayList;

public class TestGenerics2 {

    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    private void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        takeAnimals(animals);

        // !!! It will not take ArrayList<Dog> !!!
        // Array types are checked again at runtime vs collection type checks happen only when we compile (generics are compileTime concept)
        ArrayList<Dog> dogs = new ArrayList<>();
        // takeAnimals(dogs);

    }

    // Method taking ArrayList of Animals
    private void takeAnimals(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    // That method can accept ArrayList having any Animal subtype
    // When we use ? the compile will not allow us to ADD anything to the list!!!
    // Another way to declare this method: public <T extends Animal> void takeThing(Arraylist<T> list)
    private void takeAnimalsWithWildcard(ArrayList<? extends Animal> animals) {
        // animals.add(new Dog());      - will not compile
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
