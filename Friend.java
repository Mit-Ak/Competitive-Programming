/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Friend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,count=0;
        for(int i=0;i<n;i++){
            a+=sc.nextInt();
        }
        a=a%(n+1);
        for(int i=1;i<=5;i++){
            if((i+a)%(n+1)==1)
                continue;
            count++;
        }
        System.out.println(count);
    }
    
}
