/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg349a;

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
        int p25=0,p50=0,p100=0;
        int p=sc.nextInt();
        if(p==25)
            p25++;
        else
        {
            System.out.println("NO");
            return;
        }
        for(int i=1;i<n;i++){
            p=sc.nextInt();
           if(p==25)
               p25++;
           if(p==50){
              if(p25>=1){
                  p25--;
                  p50++;
              }
              else{
                  System.out.println("NO");
                  return;
              }
           }
           if(p==100){
              
              if(p25>=1 && p50>=1)
               {
                   p100++;
                   p25--;
                   p50--;
               }
              else if(p25>=3){
                   p25-=3;
                   p100++;
               }
              else{
                  System.out.println("NO");
                  return;
              }
        }
    }
        System.out.println("YES");
    }
}
