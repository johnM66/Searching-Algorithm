package ds.searching;

public class BinarySearch {
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = (l + r )/ 2;

			if (arr[mid] == x)
				return mid;

			else if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}
	
	
	int binarySearch2(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was 
        // not present
        return -1;
    }

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int v = 40;
		BinarySearch ob = new BinarySearch();
		//int result = ob.binarySearch2(arr,v);
		int result =binarySearch(arr,0,n-1,v);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
