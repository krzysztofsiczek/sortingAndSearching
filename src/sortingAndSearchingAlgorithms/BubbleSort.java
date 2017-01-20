package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class BubbleSort extends SwapTwoElementsInArray implements Sort{

	public BubbleSort() {
	}
	
	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		bubbleSort(dane);
	}
	
	private <T extends Comparable<? super T>> void bubbleSort(ArrayList<T> dane) {
		for (int i = getArrayLength(dane); i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if ((dane.get(j).compareTo(dane.get(j + 1))) > 0) {
					swap(dane, j);
				}
			}
		}
	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> dane) {
		return dane.size();
	}

	private <T extends Comparable<? super T>> void swap(ArrayList<T> dane, int i) {
		T temporaryObjectHolder = dane.get(i + 1);
		dane.set(i + 1, dane.get(i));
		dane.set(i, temporaryObjectHolder);
	}
}
