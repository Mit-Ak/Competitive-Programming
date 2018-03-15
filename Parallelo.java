/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelo;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Parallelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
          int a1=sc.nextInt();
          int a2=sc.nextInt();
          int a3=sc.nextInt();
          int s1=(int)Math.sqrt(a2*a3/a1);
          int s2=(int)Math.sqrt(a1*a3/a2);
          int s3=(int)Math.sqrt(a1*a2/a3);
          System.out.println(4*(s1+s2+s3));
    }
}
