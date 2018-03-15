/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nf=0,no=0;
        String s="";
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            if(c==5)
                nf++;
            else
                no++;
        }
        if(nf>=9 && nf>0){
            nf=nf-nf%9;
        for(int i=0;i<nf;i++)
            s+=5;
         for(int i=0;i<no;i++)
            s+=0;
          System.out.println(s);
        }
        else if(nf<9 && no>0)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
