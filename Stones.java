/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stones;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Stones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int x=0;
        for(int i=0;i+1<n;i++){
            if(s.charAt(i)==s.charAt(i+1))
                 x++;
        }
        System.out.println(x);
    }
    
}
