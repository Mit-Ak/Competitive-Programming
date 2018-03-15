/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg939b;

import java.math.BigInteger;
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
        BigInteger n=sc.nextBigInteger();
        int k=sc.nextInt();
        int u=0;
        BigInteger no = null,min,l;
         min=BigInteger.valueOf(Long.MIN_VALUE);
        for(int i=1;i<=k;i++){
           BigInteger d=sc.nextBigInteger();
           BigInteger v= n.mod(d);
            if(v.compareTo(min)>0){
                min=v;
                u=i;
                no=n.divide(v);
            }
        }
        System.out.println(u+" "+no);
    }
}
