package dataStructures_collections_generics.generics_7;

public class TestGenerics1 {

    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    private void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    // Method taking ARRAY of Animals can take array with any Animal subtype (POLYMORPHISM in action)
    // Array types are checked again at runtime vs collection type checks happen only when we compile (generics are compileTime concept)
    private void takeAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
