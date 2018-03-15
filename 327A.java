/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg327a;

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
        int n1=0,max=0,sum=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            n1+=k;
            if(k==0)
           max=Math.max(max, ++sum);
            else if(--sum<0)
                sum=0;
    }
         if(n1==n)
           max=-1;
        System.out.println(n1+max);
    }
}
