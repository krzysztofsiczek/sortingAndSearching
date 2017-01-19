package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class InsertionSort extends SwapTwoElementsInArray implements Sort {

	public InsertionSort() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> data) {
		insertionSort(data);
	}

	private <T extends Comparable<? super T>> void insertionSort(ArrayList<T> data) {
		int length = data.size();
		for (int i = 1; i < length; i++) {
			T key = data.get(i);
			int j = i - 1;
			while (j >= 0) {
				if (key.compareTo(data.get(j)) < 0) {
					swap(data, i, j);
				}
				j--;
			}
		}
	}
}
