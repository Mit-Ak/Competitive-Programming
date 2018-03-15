/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazzu;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Jazzu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int child=0,max=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if((m+a[i]-1)/m>=max){
                child=i+1;
                max=Math.max(max,(m+a[i]-1)/m);
            }
        }
        System.out.println(child);
    }
}
