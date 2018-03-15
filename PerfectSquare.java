/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectsquare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class PerfectSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=0;
        long max=0;
       long[] arr=new long[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
         }
       for(int i=0;i<n;i++){
           val=(int)Math.sqrt(arr[i]);
           if(val*val!=arr[i])
              max=Math.max(max,arr[i]);         
       }
       System.out.println(max);
    }
}
