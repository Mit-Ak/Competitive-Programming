/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg361a;

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
        int[] b=new int[n];
        a[0]=k;
        for(int i=0;i<n;i++){
            for(int l=0;l<n;l++){
                b[l]=a[(l+i)%n];
            System.out.print(b[l]+" ");
            }
            System.out.println();
        }
    }
}
