/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String p;
        for(int i=0;i<n;i++){
            p=sc.next();
            if("++X".equals(p))
                x++;
            if("X++".equals(p))
                x++;
            if("X--".equals(p))
                x--;
            if("--X".equals(p))
                x--;
        }
        System.out.println(x);
    }
    
}
