/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toast;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Toast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int min=0;
        min=Math.min((k*l)/nl, c*d);
        min=Math.min(min,p/np)/n;
        System.out.print(min);
        String s=sc.next();
 
    }
}
