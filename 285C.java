/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg285c;

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
        long sum=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            sum+=Math.abs(a[i]-(i+1));
        }
        System.out.println(sum);
    }
    
}
