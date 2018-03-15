/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg104a;

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
        if(n>=1 && n<=10)
            System.out.println(0);
        if(n>=11 && n<=19)
            System.out.println(4);
        if(n==20)
            System.out.println(15);
        if(n==21)
            System.out.println(4);
        if(n>=22 && n<=25 )
            System.out.println(0);
    }
    
}
