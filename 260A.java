/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg260a;

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
        int a=sc.nextInt()*10;
        int b=sc.nextInt();
        int n=sc.nextInt();
        int i=0;
            for(int j=0;j<=9;j++){     
                 if((a+j)%b==0)   {
                    a=a+j;
                    i=1;
                    break;
                 }
            }  
            if(i==0)
        System.out.println("-1");
            else{
                for(int j=1;j<n;j++){
                    a=a*10;
                }
                System.out.println(a);
            }
    } 
}
