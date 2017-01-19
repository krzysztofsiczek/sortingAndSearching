package sortingAndSearchingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> tablica = init();

		List<Sort> sortingAlgorithms = new ArrayList<>();
		sortingAlgorithms.add(new BubbleSort());
		sortingAlgorithms.add(new HeapSort());
		sortingAlgorithms.add(new InsertionSort());
		sortingAlgorithms.add(new MergeSort());
		sortingAlgorithms.add(new QuickSort());
		sortingAlgorithms.add(new QuickSortUsingNewlyCreatedTables());
		sortingAlgorithms.add(new SelectionSort());

		for (Sort item : sortingAlgorithms) {
			item.sort(tablica);
			print(tablica);
		}

		List<Search> searchAlgorithms = new ArrayList<>();
		searchAlgorithms.add(new BinarySearch());
		searchAlgorithms.add(new LinearSearch());
		boolean searchResult;
		for (Search item : searchAlgorithms) {
			int poszukiwany = 333;
			searchResult = item.search(tablica, poszukiwany);
			if (searchResult) {
				System.out.println("Znaleziono " + poszukiwany);
			} else {
				System.out.println("Nie znaleziono " + poszukiwany);
			}
		}
	}

	private static ArrayList<Integer> init() {
		ArrayList<Integer> tablica = new ArrayList<Integer>();
		tablica.add(10);
		tablica.add(33);
		tablica.add(32);
		tablica.add(333);
		tablica.add(83);
		tablica.add(11);
		return tablica;
	}

	private static <T> void print(ArrayList<T> dane) {
		for (T cyfra : dane) {
			System.out.println(cyfra.toString());
		}
		System.out.println();
	}
}
