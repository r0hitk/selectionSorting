package selectionSorting;

class SelectionSort {

	public static void sort(int[] array) {

		int smallestIndex;

		for (int j = 0; j < array.length - 1; j++) {

			smallestIndex = j;

			for (int k = j + 1; k < array.length; k++) {

				if (array[k] < array[smallestIndex]) {
					smallestIndex = k;
				}
			}

			swap(array, j, smallestIndex);

		}

	}

	private static void swap(int[] a, int j, int smallestIndex) {

		int temp;
		
		temp = a[j];
		a[j] = a[smallestIndex];
		a[smallestIndex] = temp;
	}
}
