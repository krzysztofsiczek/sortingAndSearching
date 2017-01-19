package sortingAndSearchingAlgorithms;

import java.util.ArrayList;;

public class BinarySearch implements Search{

	public BinarySearch() {
	}

	public <T extends Comparable<? super T>> boolean search(ArrayList<T> tablica, T toFound) {
		int beginningOfArray = 0;
		int endOfArray = tablica.size() - 1;
		return binarySearch(tablica, beginningOfArray, endOfArray, toFound);
	}

	private <T extends Comparable<? super T>> boolean binarySearch(ArrayList<T> list, int beginningOfArray,
			int endOfArray, T toFound) {

		while (beginningOfArray <= endOfArray) {
			int middleofArray = beginningOfArray + ((endOfArray - beginningOfArray) / 2);
			switch (toFound.compareTo(list.get(middleofArray))) {
			case 0:
				return true;
			case -1:
				endOfArray = middleofArray - 1;
				binarySearch(list, beginningOfArray, endOfArray, toFound);
				break;
			case 1:
				beginningOfArray = middleofArray + 1;
				binarySearch(list, beginningOfArray, endOfArray, toFound);
				break;
			}
		}
		return false;
	}

}