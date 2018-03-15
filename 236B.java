/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg236b;

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
        // TODO code application logic here\
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long sum=0;
        int[] s=new int[a*b*c+1];
        for(int i=1;i<=a*b*c;i++){
                for(int k=i;k<=a*b*c;k+=i){
                    s[k]++;
                }
            }
        
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                for(int k=1;k<=c;k++){
                 sum+=s[i*j*k];
                }
            }
        }
        System.out.println(sum%(1073741824));
    }
}
