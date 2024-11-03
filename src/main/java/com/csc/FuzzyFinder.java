package com.csc;
import java.util.ArrayList;

public class FuzzyFinder {

  
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = fuzzies.get(mid).color.compareTo("gold");
            
            if (result < 0) {
                low = mid + 1;
            } else if (result > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

  public static void main(String args[]) {
    System.out.println("In addition to your search functions, you can write a main function if you wish!");
  }
}
