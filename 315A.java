/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg315a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];

		for(int i=0;i<a.length;i++)
		{		a[i]=sc.nextInt();
			b[i]=sc.nextInt();}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j] && i!=j)
				{	n--;
					break;
				}
			}
		}
		System.out.println(n);
	}
}