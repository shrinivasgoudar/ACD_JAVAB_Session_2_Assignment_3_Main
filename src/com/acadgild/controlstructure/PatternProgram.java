/**
 * 
 */
package com.acadgild.controlstructure;

/**
 * @author shrinivasa.goudar
 *
 */
public class PatternProgram {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		String res = "";
		int num = 5;
		for (int i = 1; i <= num; i++) {
			res = res + i;
			System.out.println(res);
			if (i == num) {
				for (int j = num - 1; j > 0; j--) {
					res = res.substring(0, j);
					System.out.println(res);
				}
			}
		}
	}

}
