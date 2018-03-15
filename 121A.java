/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg121a;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

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
        ArrayList<Long> al=new ArrayList<>();
        TreeSet<Long> ts=new TreeSet<>();
        ts.add(4L);
        ts.add(7L);
        al.add(4L);
        al.add(7L);
        for(int i=2;i<9;i++){
            int size=al.size();
            for(int j=0;j<size;j++)
            {
                if(al.get(j).toString().length()==i-1){
                    long n1=Integer.parseInt(al.get(j)+"4");
                    long n2=Integer.parseInt(al.get(j)+"7");
                    ts.add(n1);
                    ts.add(n2);
                    al.add(n1);
                    al.add(n2);
                }
            }
        }
        ts.add(4444444444L);
        long l=sc.nextLong(), r=sc.nextLong();
        long n=l;
        long sum=0;
        while(n<=r){
            long next=ts.higher(n-1);
            sum+=next*(Math.min(r, next)-n+1);
            n=next+1;
        }
        System.out.println(sum);
    }
}
