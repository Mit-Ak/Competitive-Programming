/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg350a;

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
        int m=sc.nextInt();
        int[] gd=new int[n];
        int[] wr=new int[m];
        for(int i=0;i<n;i++){
            gd[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            wr[i]=sc.nextInt();
        }
        Arrays.sort(gd);
        Arrays.sort(wr);
        int max=Math.max(2*gd[0],gd[n-1]);
        if(wr[0]<=max){
            System.out.println("-1");
        }
        else
            System.out.println(max);
    }
}