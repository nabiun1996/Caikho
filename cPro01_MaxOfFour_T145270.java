/**
 * 
 */
package pWE10_ControlAndFlow_T145270;

import java.util.Scanner;

/**
 * @author Tuan Pham(T145270)
 *
 */
public class cPro01_MaxOfFour_T145270 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d;
		double max1 = 0, max2 = 0, max = 0;
		// tao bien luu
		Scanner tuan = new Scanner(System.in);
		// input
		System.out.println("Nhap so thu nhat :");
		a = tuan.nextDouble();
		System.out.println("Nhap so thu hai :");
		b = tuan.nextDouble();
		System.out.println("Nhap so thu ba :");
		c = tuan.nextDouble();
		System.out.println("Nhap so thu tu :");
		d = tuan.nextDouble();
		// calculate
		if (a > b) {
			max1 = a;
		} else {
			max1 = b;
		}
		if (c > d) {
			max2 = c;
		} else {
			max2 = d;
		}
		if (max1 > max2) {
			max = max1;
		} else {
			max = max2;

			// output
			System.out.println("Max=" + max);
		}
	}

}
