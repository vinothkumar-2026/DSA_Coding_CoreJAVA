package Array;

import java.util.Scanner;

public class Coding1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
	
	 int target = sc.nextInt();

     for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
             if (a[i] + a[j] == target) {
                 System.out.println("[" + i + "," + j + "]");
                 sc.close();
                 return;
             }
         }
     }
     sc.close();
}
}
