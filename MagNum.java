/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnum;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class MagNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0,state=0;
        boolean magic =true;
        while (n != 0)
    {
         d = n % 10;
        n /= 10;

        if (d == 1)
        {
            state = 0;
        }
        else if (d == 4 && state < 2)
        {
            state = state + 1;
        }
        else
        {
            magic = false;
        }
    }
    if (state != 0)
    {
        magic = false;
    }
        System.out.println(magic==true ? "YES":"NO");
    }
}
