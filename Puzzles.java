/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Puzzles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
       for(int i=0;i<k;i++){
          if(i+n-1<k){
              min=Math.min(min,arr[i+n-1]-arr[i]);
          }
          else{
              break;
          }
       }
       System.out.println(min);
    }
}
