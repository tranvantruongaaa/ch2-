package JavaCore;
import java.util.*;
public class ch2_bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng : ");
		int n = sc.nextInt();
		System.out.println("Phần tử của mảng : ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

