/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg450b;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {
     static final int MOD = (int)(1e9) + 7;
    
    static int mod(long num) {
        return (int) ((num + 2*MOD)%MOD);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
      Integer x=sc.nextInt();
        Integer y=sc.nextInt();
        Integer n=sc.nextInt();
         int[] a={x,y,y-x,-x,-y,x-y};
         int p=(n-1)%6;
        System.out.println((mod(a[p])));
    }
}
