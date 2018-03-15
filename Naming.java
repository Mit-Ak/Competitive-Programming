/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naming;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Naming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=null;
        int p=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            s=sc.next();
            p=s.length();
            if(p>10)
                sb.append(s.charAt(0)+""+(p-2)+""+s.charAt(p-1)).append("\n");
            else
                sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}
