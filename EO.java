/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eo;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class EO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        if(k<=(n+1)/2){
            System.out.println(2*k-1);
        }
        else
            System.out.println((k-(n+1)/2)*2);
    }
}
