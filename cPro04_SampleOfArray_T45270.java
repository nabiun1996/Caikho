/**
 * 
 */
package pWE10_ControlAndFlow_T145270;

import java.util.Scanner;

/**
 * @author Tuan Pham(T45270)
 *
 */
public class cPro04_SampleOfArray_T45270 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n;
		// tao bien luu
		Scanner tuan = new Scanner(System.in);
		// input
		System.out.println("Nhap n (voi n<100):");
		n = tuan.nextInt();
		int[] a = new int[n];
		// calculate
		for (i = 0; i < n; i++) {
			System.out.println("Nhap cac so A[" + i + "]");
			a[i] = tuan.nextInt();

		}
		for (i = n - 1; i >= 0; i--) {
			// output
			System.out.print("  A[" + i + "] " + a[i]);
		}
	}

}
