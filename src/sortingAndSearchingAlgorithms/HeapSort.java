package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public class HeapSort extends SwapTwoElementsInArray implements Sort{

	private int lengthOfArray;
	private int lengthOfHeap;

	public <T extends Comparable<? super T>> void sort(ArrayList<T> dane) {
		heapSort(dane);
	}

	private <T extends Comparable<? super T>> void heapSort(ArrayList<T> dane) {

		lengthOfArray = getArrayLength(dane);
		buildHeap(dane);

		for (int i = lengthOfHeap; i > 0; i--) {
			swap(dane, 0, i);
			lengthOfHeap--;
			heapify(dane, 0);
		}
	}

	private <T extends Comparable<? super T>> int getArrayLength(ArrayList<T> list) {
		return list.size();
	}

	private <T extends Comparable<? super T>> void buildHeap(ArrayList<T> list) {
		lengthOfHeap = lengthOfArray-1;
		for (int i = lengthOfHeap / 2; i >= 0; i--) {
			heapify(list, i);
		}
	}

	private <T extends Comparable<? super T>> void heapify(ArrayList<T> list, int parent) {
		int leftChild = (parent * 2) + 1;
		int rightChild = (parent * 2) + 2;
		int biggestElementInHeap;
		
		if (leftChild <= lengthOfHeap && list.get(leftChild).compareTo(list.get(parent)) > 0) {
			biggestElementInHeap = leftChild;
		} else {
			biggestElementInHeap = parent;
		}

		if (rightChild <= lengthOfHeap && list.get(rightChild).compareTo(list.get(biggestElementInHeap)) > 0) {
			biggestElementInHeap = rightChild;
		}

		if (biggestElementInHeap != parent) {
			swap(list, biggestElementInHeap, parent);
			heapify(list, biggestElementInHeap);
		}
	}
}
