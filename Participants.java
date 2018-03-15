/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participants;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Participants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,c=0,sum=0,x=0;
        for(int i=0;i<n;i++){
            sum=0;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            sum=a+b+c;
            if(sum>=2)
                x++;
        }
        System.out.println(x);
    }
    
}
