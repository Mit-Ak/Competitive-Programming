/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg189a;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int val=0, max=0;
        for(int i=0;i<=n;i++){
          for(int j=0;j<=n;j++){
              val=a*i+b*j;
              if((n-val)%c==0 && n-val>=0)
                  max=Math.max(max, i+j+(n-val)/c);
          }  
        }
        System.out.println(max);
    }
    
}
