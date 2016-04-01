
/**
 * Created by Gavin on 3/31/16.
 *
 * Not stable
 * O(1) extra space
 * Theta(n^2) comparisons
 * Theta(n) swaps
 * Not adaptive
 *
 */

public class SelectionSort<T> implements SortingAlgorithm {

    SelectionSort() {

    }

    public Comparable[] sort(Comparable[] elements) {
        int len = elements.length;

        for(int i = 0; i < len; i++) {
            //min occupies O(1) space
            Comparable min = elements[i];
            int index = i;
            for(int j = i; j < len; j++) {
                //comparison always occurs in inner loop. Theta(n^2) comparisons.
                if(elements[j].compareTo(min) < 0){
                    min = elements[j];
                    index = j;
                }
            }

            //swap only occurs in outer loop. Theta(n) swaps.
            Comparable tmp = elements[i];
            elements[i] = min;
            elements[index] = tmp;
        }
        return elements;
    }
}
