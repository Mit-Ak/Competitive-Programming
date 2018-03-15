/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg144a;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int min=Integer.MAX_VALUE,max=0;
        int pn=0,px=0,count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(min>=a[i]){
                min=a[i];
                pn=i;
            }
            if(max<a[i]){
                max=a[i];
                px=i;
            }
        }
        while(a[0]!=max || a[n-1]!=min){
              if(px>0){
                  int k=0;
                  if(px-pn==1){
                      k=a[px-1];
                  a[px-1]=a[px];
                  a[px]=k;
                 // System.out.println(a[px-1]+" "+a[px]);
                  px--;
                  pn++;
                  }
                  else{  
                  k=a[px-1];
                  a[px-1]=a[px];
                  a[px]=k;
                 // System.out.println(a[px-1]+" "+a[px]);
                  px--;
                  }
                 count++;
              }
              if(pn<n-1){
                  int l=0;
                  if(px-pn==1){
                     l=a[pn+1];
                  a[pn+1]=a[pn];
                  a[pn]=l;
                   //System.out.println(a[pn]+" "+a[pn+1]);
                  px--;
                  pn++;
                  }else{
                  l=a[pn+1];
                  a[pn+1]=a[pn];
                  a[pn]=l;
                  //System.out.println(a[pn]+" "+a[pn+1]);
                  pn++;
                  }
                  count++;
              }
        }
        System.out.println(count);
    }
}
