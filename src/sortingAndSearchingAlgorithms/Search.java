package sortingAndSearchingAlgorithms;

import java.util.ArrayList;

public interface Search {

	public <T extends Comparable<? super T>> boolean search (ArrayList<T> arrayList, T toBeFound);
}
