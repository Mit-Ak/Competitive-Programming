/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Jam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        int[] r=new int[n];
        int ls=0,rs=0;
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
            ls+=l[i];
            rs+=r[i];
        }
         ls=Math.min(ls,n-ls);
         rs=Math.min(rs,n-rs);
         System.out.println(ls+rs);
    }
}
