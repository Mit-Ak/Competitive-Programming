/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg287a;

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
		Scanner sc =new Scanner(System.in);
		int arr[][]=new int[4][4];
		boolean flag = false;
		for(int i=0;i<4;i++)
		{
			String s = sc.next();
			for(int j=0;j<4;j++)
			{
				if(s.charAt(j)=='#')
					arr[i][j]=1;
			}
		}
           BB:       for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]!=2)
				{
					flag = true;
					break BB;
				}
			}
		}
		if(flag)
			System.out.println("YES");
		 else
			 System.out.println("NO");
	}
}