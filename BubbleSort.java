/**
 * Created by Gavin on 3/31/16.
 *
 * Stable
 * O(1) extra space
 * O(n^2) comparisons and swaps
 * Adaptive: O(n) when nearly sorted
 *
 */
public class BubbleSort<T> implements SortingAlgorithm {

    BubbleSort() {

    }

    public Comparable[] sort(Comparable[] elements) {
        int len = elements.length;

        //scan array a minimum of one time
        for(int i = 0; i < len; i++) {

            //compare adjacent elements. Swap if left is bigger than right
            //scan entire array every time until sorted
            for(int j = 1; j < len-i; j++) {
                if(elements[j-1].compareTo(elements[j]) > 0) {
                    Comparable tmp = elements[j-1];
                    elements[j-1] = elements[j];
                    elements[j] = tmp;
                }
            }
        }
        return elements;
    }
}
