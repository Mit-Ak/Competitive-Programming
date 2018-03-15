/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg433b;

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
        Integer[] a=new Integer[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         long[] preUnsorted=new long[n];
          for(int i=0;i<n;i++){
              preUnsorted[i]+=(i==0?a[i]:a[i]+preUnsorted[i-1]);
        }
          Arrays.sort(a);
          long[] preSorted=new long[n];
          for(int i=0;i<n;i++){
              preSorted[i]+=(i==0?a[i]:a[i]+preSorted[i-1]);
          }
          int m=sc.nextInt();
          while(m-->0){
          int t=sc.nextInt(); int l=sc.nextInt()-1; int r=sc.nextInt()-1;
          if(t==2){
              System.out.println(preSorted[r]-(l==0?0:preSorted[l-1]));
          }
          if(t==1){
              System.out.println(preUnsorted[r]-(l==0?0:preUnsorted[l-1]));
          }
          }
    }
}
