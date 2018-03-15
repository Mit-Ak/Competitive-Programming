/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Black {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=0;
        for(int i=n+1;i<=50;i++){
            p=0;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0)
                    p++;
            }
            if(p==0)
            {
                p=i;
                break;
            }
        }
        if(p==m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
