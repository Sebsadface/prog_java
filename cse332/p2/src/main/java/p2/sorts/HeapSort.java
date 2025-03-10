package p2.sorts;

import cse332.exceptions.NotYetImplementedException;
import datastructures.worklists.MinFourHeap;

import java.util.Comparator;

public class HeapSort {
    public static <E extends Comparable<E>> void sort(E[] array) {
        sort(array, Comparable::compareTo);
    }

    public static <E> void sort(E[] array, Comparator<E> comparator) {
        MinFourHeap<E> heap = new MinFourHeap<>(comparator);
        for (E item : array) {
            heap.add(item);
        }

        int i = 0;
        while(heap.hasWork()) {
            array[i] = heap.next();
            i++;
        }
    }
}
