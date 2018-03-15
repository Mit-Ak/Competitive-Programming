/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godsend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Godsend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long num=0,count=0;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
           if(arr[i]%2!=0)
               count++;
     }
        if(count==0){
            System.out.println("Second");
        }
       else if(count%2==0 || count%2!=0)        {
            System.out.println("First");
        }
    }
}
