/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg237a;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     int hr,mm;

    public Main(int hr, int mm) {
        this.hr = hr;
        this.mm = mm;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Main[] m;
        m=new Main[n];
        for(int i=0;i<n;i++){
            m[i]=new Main(sc.nextInt(),sc.nextInt());
        }
        int count=1,max=1;
        for(int i=0;i<n-1;i++){
            if(m[i+1].hr==m[i].hr && m[i+1].mm==m[i].mm){
                count++;
            } 
            else count=1;
            max=Math.max(max, count);
        }
        System.out.println(max);
    }
    
}
