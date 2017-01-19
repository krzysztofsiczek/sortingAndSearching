package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public abstract class SwapTwoElementsInArray implements SwapTwoElements{

	@Override
	public <T extends Comparable<? super T>> void swap(ArrayList<T> arrayList, int firstElementToSwap, int SecondElementToSwap) {
		T temporary = arrayList.get(firstElementToSwap);
		arrayList.set(firstElementToSwap, arrayList.get(SecondElementToSwap));
		arrayList.set(SecondElementToSwap, temporary);
	}
}
