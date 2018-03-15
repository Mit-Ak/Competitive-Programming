/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Segment {

    /**
     * @param args the command line arguments
     */
    long l,r;

    public Segment(long l, long r) {
        this.l = l;
        this.r = r;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Segment[] s;
        boolean found=false;
        s=new Segment[n];
        for(int i=0;i<n;i++){
            long l=sc.nextLong();
            long r=sc.nextLong();
            min=(int)Math.min(min, l);
            max=(int)Math.max(max, r);
            s[i]=new Segment(l,r);
        }
        for(int i=0;i<n;i++){
            if(s[i].l==min && s[i].r==max)
            {
                min=i+1;
                found=true;
                break;
            }
    }
        System.out.println(found==true?min:-1);
    }
}
