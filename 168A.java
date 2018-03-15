/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg168a;

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
         Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int x = input.nextInt();
       int y = input.nextInt();

       double need = Math.ceil((double)(y*n)/100);
       System.out.printf("%.0f\n",(need<x)? 0:need-x);
    }
}