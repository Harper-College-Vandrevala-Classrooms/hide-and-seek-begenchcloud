package com.csc;
import java.util.ArrayList;
import java.util.List;

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

     public int findColdPricklyIndex(List<Feeling> feelings) {
        for (int i = 0; i < feelings.size(); i++) {
            if (feelings.get(i).description().equals("Pokey!")) {
                return i;
            }
        }
        return -1;
    }

  public static void main(String args[]) {
    System.out.println("In addition to your search functions, you can write a main function if you wish!");



    /*Linear Search worst-case scenario analysis 
     * 
     * In the worst-case scenario, the target element is either:
     * Not present in the list, or
     * Present at the last position in the list.
     * Both cases require traversing the entire list.
     * Assume:
     * n = number of elements in the list.
     * The linear search has a time complexity given by the following expression:
     * T(n) = c1 * 1 + c2 * 2 + c3 * 3 + ... + cn * n,
     * where c represents the time taken for a comparison and iteration step.
     * In the worst case, the algorithm makes n comparisons, where n is the size of the list.
     * The time to check each element is assumed to be a constant operation O(1).
     * The total time for n such operations is given by: T(n) = 1 + 1 + 1 + ... (n times) = n * O(1) = O(n)
     * So in the worst case scenario the fuzzy is either at the end or not in the list at all.
     */



     /*Binary Search worst-case scenario analysis 
      * 
      *The running time 
      *T(n) of binary search can be expressed in terms of the number of comparisons made during the search process. 
      *Each step reduces the problem size by half, which gives the recurrence relation:
      *T(n)=T(n/2)+O(1)
      *Solving this recurrence using the master theorem:
      *T(n)=O(logn)
      *
      *The algorithm starts with the entire list of size n. 
      *Each comparison eliminates half of the list, resulting in a logarithmic number of comparisons proportional to log 2(n).
      *The algorithm reaches the base case (single element) after log2 (n) steps. 
      *If the target element is not in the list, the algorithm performs O(logn) comparisons and returns a "not found" result.
      *
      *In the worst case, any comparable type will require O(logn) time to determine that an element is not present
      */
  }
}
