/**
 * Created by Gavin on 3/31/16.
 *
 * Algorithm: Insertion Sort
 *
 * Stable
 * O(1) extra space
 * O(n^2) comparisons and swaps
 * Adaptive: O(n) when nearly sorted
 *
 */


public class InsertionSort<T> implements SortingAlgorithm{

    InsertionSort() {

    }

    @Override
    public Comparable[] sort(Comparable[] elements) {
        int len = elements.length;

        //O(n^2) comparisons and swaps in the worst case
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                if(elements[i].compareTo(elements[j]) > 0){
                    //tmp is the O(1) extra space required
                    Comparable tmp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = tmp;
                }

            }
        }
        return elements;
    }
}
