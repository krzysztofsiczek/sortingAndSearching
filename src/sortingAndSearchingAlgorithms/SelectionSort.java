package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class SelectionSort extends SwapTwoElementsInArray implements Sort {

	private int indexOfSmallestElement;
	private int length;

	public SelectionSort() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		selectionSort(dane);
	}

	private <T extends Comparable<? super T>> void selectionSort(ArrayList<T> dane) {
		length = getLength(dane);
		for (int i = 0; i < length; i++) {
			indexOfSmallestElement = getIndexOfSmallestElement(dane, i);
			swap(dane, i, indexOfSmallestElement);
		}
	}

	private <T extends Comparable<? super T>> int getLength(ArrayList<T> dane) {
		return length = dane.size();
	}

	private <T extends Comparable<? super T>> int getIndexOfSmallestElement(ArrayList<T> dane, int i) {
		indexOfSmallestElement = i;
		for (int j = i + 1; j < length; j++) {
			if (dane.get(indexOfSmallestElement).compareTo(dane.get(j)) > 0) {
				indexOfSmallestElement = j;
			}
		}
		return indexOfSmallestElement;
	}
}
