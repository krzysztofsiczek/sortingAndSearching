package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class MergeSortInPlace extends SwapTwoElementsInArray implements Sort {

	public MergeSortInPlace() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		int end = getArrayLength(dane) - 1;
		int beginning = 0;
		mergeSort(dane, beginning, end);
	}

	private <T extends Comparable<? super T>> void mergeSort(ArrayList<T> dane, int beginningIndex, int endIndex) {
		if (beginningIndex < endIndex) {
			int middle = (endIndex - beginningIndex) / 2 + beginningIndex;
			mergeSort(dane, beginningIndex, middle);
			mergeSort(dane, (middle + 1), endIndex);
			merge(dane, beginningIndex, middle, endIndex);
		}
	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> list) {
		return list.size();
	}

	private <T extends Comparable<? super T>> void merge(ArrayList<T> dane, int beginningOfLeft, int endOfLeft, int endOfRight) {

		int i = beginningOfLeft;

		while (i <= endOfLeft) {
			if ((dane.get(i).compareTo(dane.get(endOfLeft + 1))) > 0) {
				swap(dane, i, (endOfLeft + 1));
				restoreOrder(dane, (endOfLeft + 1), endOfRight);
			}
			i++;
		}
	}
	

	private <T extends Comparable<? super T>> void restoreOrder(ArrayList<T> dane, int beginning,
			int end) {
		for (int i = beginning; i < end; i++) {
			if ((dane.get(i).compareTo(dane.get(i + 1))) > 0) {
				swap(dane, i, (i + 1));
			}
		}
	}
}
