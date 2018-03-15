/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg166a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main implements Comparable {
    int pb;
    int pt;

    public Main(int pb, int pt) {
        this.pb = pb;
        this.pt = pt;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        Main m[];
        m =new Main[n];
        for(int i=0;i<n;i++){
            m[i]=new Main(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(m);
         //System.out.println();
        for(int i=0;i<n;i++){
          if(m[i].pb==m[k-1].pb && m[i].pt==m[k-1].pt)
              count++;
        }
         System.out.println(count);
    }

    @Override
    public int compareTo(Object t) {
        Main m =(Main) t;
        if(m.pb<this.pb)
          return -1;
        else if(m.pb>this.pb)
            return 1;
        else 
           if(m.pt<this.pt)
               return 1;
           else if(m.pt>this.pt)
               return -1;
           else 
               return 0;
    }
}
