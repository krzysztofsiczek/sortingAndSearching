package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public interface Swap {

	<T extends Comparable<? super T>> void swap(ArrayList<T> arrayList, int firstElementToSwap, int SecondElementToSwap);

}
