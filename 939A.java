/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg939a;

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
        boolean out=false;
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++)
            a[i]=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(a[a[a[i]]]==i)
                out=true;
        }
        System.out.println(out==true?"YES":"NO");
    }
    
}
