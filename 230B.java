/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg230b;

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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double max=0;
        boolean[] prime=new boolean[1000001];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=0;i<1001;i++){
            if(prime[i]){
            for(int j=2*i;j<1000001;j+=i){
               prime[j]=false;   
            }
            }
        }
       for(int x=0;x<n;x++)
		{
			long a=sc.nextLong();
			if((double)Math.sqrt(a)==(int)Math.sqrt(a) && prime[(int)Math.sqrt(a)])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
    }
}
