/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucky;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Lucky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       long a=sc.nextLong();
       int k=0;
        while(a!=0){
            if(a%10==4 || a%10==10)
                k++;
            a/=10;
        }
        if(k==4 || k==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
