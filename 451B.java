/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg451b;

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
        int[] a=new int[n];
          for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
         int l=0,r=n-1;
         while(l<n-1 && a[l]<a[l+1])
             l++;
         while(r>=0 && a[r-1]<a[r])
             r--;
         for(int i=l,j=r;i<j;i++,j--)
         {
             int k=a[l];
             a[l]=a[j];
             a[j]=k;
         }
         boolean sorted=true;
         for(int i=1;i<n;i++)
             sorted&=a[i-1]<a[i];
         l++;
         r++;
        System.out.println(sorted==true?"yes\n"+l+" "+r:"no");
    }
}
