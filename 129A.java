/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg129a;

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
        int co=0,ce=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k%2==0)
                ce++;
            else
                co++;
        }   
        
            System.out.println(co%2==0?ce:co);
    }
}
