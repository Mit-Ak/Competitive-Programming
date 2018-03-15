/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg845c;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */class Tv implements Comparable<Tv>{
       int l,r;

    public Tv(int l, int r) {
        this.l = l;
        this.r = r;
    }
       @Override
    public int compareTo(Tv m){
        return this.l-m.l;
    }
 }
public class Main {

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Tv[] m=new Tv[n];
        
        for(int i=0;i<n;i++)
            m[i]=new Tv(sc.nextInt(),sc.nextInt());
        Arrays.sort(m);
        
        int flag=1;
        int e1=-1,e2=-1;
        for(int i=0;i<n&&flag==1;i++){
            int start=m[i].l;
            int end=m[i].r;
            if(start>e1)
                e1=m[i].r;
            else if(start>e2)
                e2=m[i].r;
            else
                flag=0;
        }
        if(flag==1)
           System.out.println("YES");
        else
            System.out.println("NO");
    }
}
