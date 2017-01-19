package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public interface Sort {

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane);
	
}
