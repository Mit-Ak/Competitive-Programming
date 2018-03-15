/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg289b;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Akarsh
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        int p=0;
        long sum=0;
        boolean out=true;
        int[] k=new int[n*m];
        for(int i=0;i<n*m;i++){
            k[i]=sc.nextInt();   
        }
        Arrays.sort(k);
        int c=(n*m)/2;
        for(int i=0;i<n*m;i++){
            p=Math.abs(k[c]-k[i]);
            if(p%d!=0){
                out=false;
               break;
            }
            sum+=p;
        }
        System.out.println(out==true?sum/d:"-1");
    }
}
