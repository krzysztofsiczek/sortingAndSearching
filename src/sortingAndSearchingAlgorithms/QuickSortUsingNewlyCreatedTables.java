/*
 * This implementation of QuickSort algorithm uses newly created tables 
 * "lessThanPivot" and "greaterThanPivot" as a result of specification 
 * of the exercise for which it has been created.
*/
package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class QuickSortUsingNewlyCreatedTables extends SwapTwoElementsInArray implements Sort {

	private int pivot;
	private int length;
	private int beginning;
	private int end;

	public QuickSortUsingNewlyCreatedTables() {
	}

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {

		length = getArrayLength(dane);
		beginning = 0;
		end = length - 1;

		ArrayList<T> sortedArray = quickSort(dane, beginning, end);
		for (int i = 0, end = dane.size(); i < end; i++) {
			dane.set(i, sortedArray.get(i));
		}
	}

	private <T extends Comparable<? super T>> ArrayList<T> quickSort(ArrayList<T> arrayList, int beginning, int end) {

		ArrayList<T> result = new ArrayList<T>();

		length = getArrayLength(arrayList);
		if (length <= 1) {
			return result;
		}

		pivot = partition(arrayList, beginning, end);
		T key = arrayList.get(pivot);

		ArrayList<T> lessThanPivot = new ArrayList<T>();

		for (int i = 0; i < pivot; i++) {
			addElementToArray(lessThanPivot, arrayList, i);
		}

		ArrayList<T> greaterThanPivot = new ArrayList<T>();

		for (int i = pivot + 1; i <= end; i++) {
			addElementToArray(greaterThanPivot, arrayList, i);
		}

		quickSort(lessThanPivot, beginning, ((end = getArrayLength(lessThanPivot)) - 1));
		quickSort(greaterThanPivot, beginning, ((end = getArrayLength(greaterThanPivot)) - 1));

		return result = join(result, lessThanPivot, key, greaterThanPivot);

	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> list) {
		int length = list.size();
		return length;
	}

	private <T extends Comparable<? super T>> int partition(ArrayList<T> arrayList, int beginning, int end) {

		int indexOfKey = (end - beginning) / 2;
		T key = arrayList.get(indexOfKey);
		swap(arrayList, indexOfKey, end);

		pivot = beginning - 1;

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

	private <T extends Comparable<? super T>> ArrayList<T> join(ArrayList<T> result, ArrayList<T> lessThanPivot, T key,
			ArrayList<T> greaterThanPivot) {
		for (int i = 0, j = getArrayLength(lessThanPivot); i < j; i++) {
			addElementToArray(result, lessThanPivot, i);
		}
		result.add(key);
		for (int i = 0, j = getArrayLength(greaterThanPivot); i < j; i++) {
			addElementToArray(result, greaterThanPivot, i);
		}
		return result;
	}

	private <T extends Comparable<? super T>> void addElementToArray(ArrayList<T> arrayToBeAddedTo,
			ArrayList<T> arrayFromWhichElementIsAdded, int indexOfElement) {
		arrayToBeAddedTo.add(arrayFromWhichElementIsAdded.get(indexOfElement));
	}
}