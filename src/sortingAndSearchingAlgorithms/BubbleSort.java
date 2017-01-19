package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class BubbleSort extends SwapTwoElementsInArray implements Sort{

	private int lengthOfUnsortedPartOfArray;

	public BubbleSort() {
	}
	
	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		bubbleSort(dane);
	}
	
	private <T extends Comparable<? super T>> void bubbleSort(ArrayList<T> dane) {
		for (lengthOfUnsortedPartOfArray = getArrayLength(dane); lengthOfUnsortedPartOfArray > 0; lengthOfUnsortedPartOfArray--) {
			for (int i = 0; i < lengthOfUnsortedPartOfArray - 1; i++) {
				if ((dane.get(i).compareTo(dane.get(i + 1))) > 0) {
					swap(dane, i);
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
