

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int beg = 0;
		int end = arr.length - 1;
		int item = 10;
		boolean flag = false;
		
		while(beg <= end) {
			int mid = (beg + end) /2;
			if(item == arr[mid]) {
				System.out.println("Item found in the list");
				flag = true;
				break;
			}
			else if(item > arr[mid]) {
				beg = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		if(!flag) {
			System.out.println("Element is not present in the array");
		}
	}

}
