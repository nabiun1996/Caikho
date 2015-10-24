/**
 * 
 */
package pWE10_ControlAndFlow_T145270;

import java.util.Scanner;

/**
 * @author Tuan Pham(T145270)
 *
 */
public class cPro03_ClassifyMe_T145270 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, i, s = 0;
		// tao bien luu
		Scanner tuan = new Scanner(System.in);
		// input
		System.out.println("Nhap n (voi n>0):");
		n = tuan.nextInt();
		// calculate
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				s = s + i;
			}
		}
		// output
		if (s == 2 * n) {
			System.out.println("<n> is perfect number");
		} else {

			if (s > 2 * n) {
				System.out.println("<n> is adubant number");
			} else {
				System.out.println("<n> is deficient number");
			}
		}
	}

}
