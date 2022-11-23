package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            tree.add((int) Math.pow(sourceList.get(i), 2));
        }
        return tree.subSet(lowerBound, true, upperBound, true);
    }
}
