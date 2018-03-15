/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Gift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0, b=0;
        for (int i = 1; i <= n; ++i) {
         int x=sc.nextInt();
        if (x == 100) ++a;
        else ++b;
    }
    int sum = 100 * a + 200 * b;
    if (sum % 200 != 0) 
        System.out.println("NO");
    else {
        int half = sum / 2;
        boolean ans = false;
        for (int i = 0; i <= b; ++i)
            if (200 * i <= half && half - 200 * i <= a * 100) ans = true;
          System.out.println(ans==true?"YES":"NO");
    }
    }
}
