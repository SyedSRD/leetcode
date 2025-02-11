package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> set ;
    Random random ;
    public RandomizedSet() {
         set = new HashSet();
        random = new Random();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int rand = random.nextInt(set.size());
        int currentIndex = 0;
        int var = 0;

        for (Integer element :set.stream().toList()) {
            // Implementing for loop
            var = element;
            if (currentIndex == rand)
                break;
            currentIndex++;
        }
        return var;
    }
}
