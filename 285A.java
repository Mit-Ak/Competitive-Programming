/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg285a;

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
        int k=sc.nextInt();
        int[] a=new int[n];
        int p=0;
        for(int i=n;i>0 && p<n;i--){
            a[p]=i;
            p++;
        }
        Arrays.sort(a,0,n-k); 
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    } 
}
