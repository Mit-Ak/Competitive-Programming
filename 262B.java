/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg262b;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int min = (int) (1e5);
		int sum = 0;
		int cur = 0;

		for (int i = 0; i < n; i++) {
			cur = sc.nextInt();
			if (cur < 0 && k > 0) {
				cur *= -1;
				k--;
			}

			sum += cur;
			min = Math.min(cur, min);
		}

		if (k > 0)
			sum = sum - min + (int) Math.pow(-1, k) * min;
		System.out.println(sum);

	}
}
