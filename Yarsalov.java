/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yarsalov;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Yarsalov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int Count=1,max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i+1<n;i++){
            if(arr[i]!=arr[i+1]){
                Count=1;
            }
            else{
                Count++;
            }
          max= Math.max(max,Count);
        }
       System.out.println(max<=(n+1)/2?"YES":"NO");
    }
    
}
