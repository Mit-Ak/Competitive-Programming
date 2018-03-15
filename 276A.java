/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg276a;

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
        long t=sc.nextInt();
        long sum=Integer.MIN_VALUE;
      for(int i=1;i<=n;i++){
        long  f=sc.nextInt();
        long  k=sc.nextInt();
        if(k>=t)
          sum=Math.max(sum,f-k+t);
        else
            sum=Math.max(sum, f);
      }
      System.out.println(sum);
    }
}
