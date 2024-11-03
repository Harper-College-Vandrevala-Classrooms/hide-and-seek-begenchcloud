package com.csc;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

  FuzzyFinder finder;
  FuzzyListGenerator generator;

  @BeforeEach
  void setUp() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
  }

  @Test
  
    void testLinearSearchWithSortedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
        int index = finder.linearSearch(fuzzies);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testBinarySearchWithSortedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
        int index = finder.binarySearch(fuzzies);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testLinearSearchWithRandomizedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.linearSearch(fuzzies);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    void testBinarySearchWithRandomizedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
        int index = finder.binarySearch(fuzzies);
        if (index != -1) {
            assertNotEquals("gold", fuzzies.get(index).color);
        }
    }

}
