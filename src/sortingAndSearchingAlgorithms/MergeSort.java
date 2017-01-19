package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class MergeSort implements Sort {

	public MergeSort() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		int end = getArrayLength(dane) - 1;
		int beginning = 0;
		mergeSort(dane, beginning, end);
	}

	private <T extends Comparable<? super T>> void mergeSort(ArrayList<T> dane, int beginningIndex, int endIndex) {
		if (beginningIndex < endIndex) {
			int middle = (endIndex - beginningIndex) / 2 + beginningIndex;
			mergeSort(dane, 0, middle);
			mergeSort(dane, (middle + 1), (endIndex));
			merge(dane, 0, middle, (middle + 1), (endIndex));
		}
	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> list) {
		return list.size();
	}

	private <T extends Comparable<? super T>> void merge(ArrayList<T> dane, int beginningOfLeft, int endOfLeft,
			int beginningOfRight, int endOfRight) {

		ArrayList<T> notSorted = new ArrayList<T>();
		for (int i = beginningOfLeft, j = endOfRight; i <= j; i++) {
			notSorted.add(dane.get(i));
		}

		int indexOfSortedArray = beginningOfLeft;

		while (beginningOfLeft <= endOfLeft && beginningOfRight <= endOfRight) {
			if (notSorted.get(beginningOfLeft).compareTo(notSorted.get(beginningOfRight)) <= 0) {
				dane.set(indexOfSortedArray, notSorted.get(beginningOfLeft));
				beginningOfLeft++;
			} else {
				dane.set(indexOfSortedArray, notSorted.get(beginningOfRight));
				beginningOfRight++;
			}
			indexOfSortedArray++;
		}

		while (beginningOfLeft <= endOfLeft) {
			dane.set(indexOfSortedArray, notSorted.get(beginningOfLeft));
			beginningOfLeft++;
			indexOfSortedArray++;
		}
	}
}
