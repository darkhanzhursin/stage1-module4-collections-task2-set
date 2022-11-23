package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    HashSet<Integer> hashSet = new HashSet<>();
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                hashSet.add(sourceList.get(i));
                divide(sourceList.get(i));
            } else {
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i)*2);
            }
        }
        return hashSet;
    }

    private void divide(int i) {
        while (i > 1) {
            int res = i/2;
            hashSet.add(res);
            i=i/2;
        }
        hashSet.add(1);
    }
}
