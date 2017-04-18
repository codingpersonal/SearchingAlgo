
public class BinarySearch_Modified {

	public static void main(String[] args) {
		int arr[] = {3};
		int beg = 0;
		int end = arr.length - 1;
		int elem = 3;
		int pos = -1;
		
		while(beg <= end) {
			int mid = (beg + end) / 2;
			if(elem == arr[mid]) {
				if((beg < end) && (arr[mid + 1] == elem)) {
					beg = mid + 1;
				} else {
					pos = mid;
					break;
				}
			} else {
				if(arr[mid] > elem)
					end = mid - 1;
				else
					beg = mid + 1;
			}
		}
		
		System.out.println(pos);
		
		
		
	}

}
