/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class General {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n];
        int max=0,min=Integer.MAX_VALUE,start=0,end=0;
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
           max=Math.max(h[i],max);
           min=Math.min(h[i], min);
         }
        if(max==h[0] && min==h[n-1]){
            System.out.println(0);
            return;
        }
         for(int i=0;i<n;i++){
             if(max==h[i])
                 start=i;
         }
          for(int i=0;i<n;i++){
             if(min==h[i]){
                 start=i;
               break;
             }
         }
          if(start<=Math.ceil(n/2) && end>=Math.ceil(n/2))
              System.out.println(start+n-1-end);
          else
              System.out.println(start+n-2-end);
    }
}
