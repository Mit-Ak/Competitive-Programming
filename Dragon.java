/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Dragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        int x=0;
        boolean[] dg=new boolean[d+1];
        for(int i=1;i<=d;i++){
            if(i%k==0 || i%l==0 || i%m==0 || i%n==0){
                dg[i]=true;
              x++;
            }
        }
        System.out.println(x);
    }
    
}
