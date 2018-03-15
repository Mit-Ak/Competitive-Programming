/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160b;

import java.util.Arrays;
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
        String s=sc.next();
        int[] a=new int[n];
        int[] b=new int[n];
        int x=0,y=0;
        for(int i=0;i<n;i++){
            a[i]=s.charAt(i);
        }
        for(int i=n;i<2*n;i++){
          b[i-n]=s.charAt(i);
    }
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[0]>b[0])
            x++;
        if(a[0]<b[0])
            y++;
        for(int i=1;i<n;i++){
            if(x>0 && a[i]>b[i]){
                x++;
            }
            if(y>0 && a[i]<b[i]){
                y++;
            }
        }
        System.out.println(x==n ||y==n ?"YES":"NO");
    }
}
