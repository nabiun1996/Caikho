/**
 * 
 */
package pWE10_ControlAndFlow_T145270;

import java.util.Scanner;

/**
 * @author Tuan Pham(T145270)
 *
 */
public class cPro02_MinOfFive_T142570 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double min = 0;
		double[] x = new double[5];
		// tao bien luu
		Scanner tuan = new Scanner(System.in);
		// input
		for (i = 0; i <= 4; i++) {
			System.out.println("Nhap so thu" + (i + 1) + ":");
			x[i] = tuan.nextDouble();
		}
		i = 1;
		min = x[0];
		while (i <= 4) {

			if (min < x[i]) {
				min = min;
			} else {
				min = x[i];
			}
			i++;
		}
		//output
		System.out.println("Min=" + min);
	}

}
