/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Lang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
          s=s.toLowerCase();
          s=s.replace("a", "");
          s=s.replace("e", "");
          s=s.replace("i", "");
          s=s.replace("o", "");
          s=s.replace("u", "");
          s=s.replace("y", "");
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<s.length()-1;i++){
              sb.append('.').append(s.charAt(i));
          }
          sb.append(".").append(s.charAt(s.length()-1));
          System.out.println(sb.toString());
    }
}
