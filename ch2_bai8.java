package JavaCore;

import java.util.*;

public class ch2_bai8 {

	public static void main(String[] args) {
		int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + avgNumber);
    }

}
