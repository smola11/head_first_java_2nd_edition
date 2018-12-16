package dataStructures_collections_generics.hashMap_6;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {
        // HashMap can't have multiple same keys but can have multiple same values
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
