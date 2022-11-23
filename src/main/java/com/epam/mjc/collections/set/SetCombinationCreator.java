package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> stringSet = new HashSet<>();
        for (String str1 : firstSet) {
            for (String str2 : secondSet) {
                if (str1.equals(str2)) {
                    if (thirdSet.isEmpty()) {
                        stringSet.add(str1);
                    } else if(!thirdSet.contains(str1)) {
                        stringSet.add(str1);
                    }
                }
            }
        }
        for (String str3 : thirdSet) {
            if (!(firstSet.contains(str3) || secondSet.contains(str3))) {
                stringSet.add(str3);
            }
        }
        //firstSet.containsAll(secondSet);
        return stringSet;
    }
}
