package sortingAndSearchingAlgorithms;

import java.util.ArrayList;;

public class LinearSearch implements Search {

	public LinearSearch() {
	}

	public <T extends Comparable<? super T>> boolean search(ArrayList<T> tablica, T toFound) {
		for (T item : tablica) {
			if (toFound.equals(item)) {
				return true;
			}
		}
		return false;
	}
}
