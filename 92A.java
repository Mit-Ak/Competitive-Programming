/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg92a;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt() % (n * (n + 1) / 2);
    for (int i = 0; i < n && m >= i; i++)
      m -= i;
    System.out.println(m);
  }
}
