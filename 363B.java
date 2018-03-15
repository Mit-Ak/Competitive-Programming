/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg363b;

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
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=0;
        for(int i=0;i<k;i++){
            first+=arr[i];
        }
        int h=first,m=0;
        for(int i=1;i<n-k+1;i++){
            h=h+arr[i+k-1]-arr[i-1];
            if(h<first){
                first=h;
                m=i;
            }
        }
        System.out.println(m+1);
    }
}
