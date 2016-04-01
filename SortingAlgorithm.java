/**
 * Created by Gavin on 3/31/16.
 */
interface SortingAlgorithm<T> {
    <E extends Comparable<E>> E[] sort(E[] elements);

}
