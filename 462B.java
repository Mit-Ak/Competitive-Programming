/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg462b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

   public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long k= in.nextInt();
		String s=in.next();
		long a[]=new long[30];
		for(int i=0;i<n;i++){
			a[s.charAt(i)-'A']++;
		}
		Arrays.sort(a);
		long sum=0;
		for(int i=29;i>0 && k>0;i--){
			if(a[i]<=k){
				sum+=a[i]*a[i];
				k-=a[i];}
			else{
				sum+=k*k;
				k=0;
			}
		}
		System.out.println(sum);
	}
}