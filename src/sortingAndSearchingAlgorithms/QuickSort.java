package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class QuickSort extends SwapTwoElementsInArray implements Sort {

	private int beginning;
	private int end;

	public QuickSort() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		beginning = 0;
		end = getArrayLength(dane) - 1;
		quickSort(dane, beginning, end);
	}

	private <T extends Comparable<? super T>> void quickSort(ArrayList<T> arrayList, int beginning, int end) {

		if (beginning >= end) {
			return;
		}

		int pivot = partition(arrayList, beginning, end);

		quickSort(arrayList, beginning, pivot - 1);
		quickSort(arrayList, pivot + 1, end);

	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> list) {
		return list.size();
	}

	private <T extends Comparable<? super T>> int partition(ArrayList<T> arrayList, int beginning, int end) {

		T key = arrayList.get(end);

		int pivot = beginning - 1;

		for (int i = beginning; i < end; i++) {
			if (arrayList.get(i).compareTo(key) <= 0) {
				pivot++;
				swap(arrayList, pivot, i);
			}
		}
		pivot++;
		swap(arrayList, end, pivot);
		return pivot;
	}
}
