/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summon;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Summon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] p=new int[(s.length()+1)/2];
        int h=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+')
                continue;
            else{
                p[h]=(int) s.charAt(i)-48;
                  h++;
            }
    }
        Arrays.sort(p);
        for(int j=0;j<h-1;j++)
     System.out.print(p[j]+"+");
        System.out.print(p[h-1]);
}
}
