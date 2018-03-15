/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldiers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Soldiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n+1];
        int p=0,fin=0,sin=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            h[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            p=Math.abs(h[i+1]-h[i]);
           if(p<min){
               min=p;
               fin=i;
               sin=i+1;
           }
        }
        if(min>Math.abs(h[n]-h[1])){
            fin=n;
            sin=1;
        }
        System.out.println(fin+" "+sin);
    }
}
