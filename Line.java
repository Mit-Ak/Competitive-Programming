/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=0;
        for(int i=1;i<=n-a;i++){
            if(n-(i+a)<=b)
                x++;
    }
    System.out.println(x);
    }
}
