/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg934a;

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
        int m=sc.nextInt();
        Integer[] a=new Integer[n];
        Integer[] b=new Integer[m];
        long mul=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-2]<0 && b[m-1]>0 ||(a[n-2]<0 && b[m-1]<0)){
            mul=a[n-2]*b[0];
        }
        if((a[n-2]>0 && b[m-1]<0) || (a[n-2]>0 && b[m-1]>0)){
            mul=a[n-2]*b[m-1];
        }
     System.out.println(mul);
    }
}
