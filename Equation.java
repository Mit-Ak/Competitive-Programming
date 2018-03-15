/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
       for(int i=0;i<=n;i++){
           for(int j=0;j<=m;j++)
           {
               if(i*i+j==n && j*j+i==m)
                   count++;
           }
       }
       System.out.println(count);
    }   
}
