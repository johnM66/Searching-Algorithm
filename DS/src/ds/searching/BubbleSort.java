package ds.searching;

public class BubbleSort {

	static int bubbnleSort(int arr[], int n) {

		for (int j = 0; j < n-1; j++) {
			for (int i = 0; i < n- j-1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 201, 300, 4, 68, 40 };
		int n = arr.length;
		int v = 40;
		bubbnleSort(arr, n);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
