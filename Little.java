/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package little;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Little {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String d="";
        int i=0;
        
        while(d!=null && i<s.length()){
           d=s.substring(i,s.length());
            String p=new StringBuffer(d).reverse().toString();
            System.out.println(d);
           if(d.equals(p) && d.length()!=1){
               i++;
               break;
           }
           i++;
        }
        System.out.println(i%2==0?"Second":"First");
}
}
//if(i==s.length()-1){
        //       i++;
         //      break;
         //  }
  /* while(d!=null){
           d=s.substring(i,s.length());
            String p=new StringBuffer(s).reverse().toString();
            System.out.println(d);
           if(d.equals(p)){
               break;
           }
           i++;
           if(i==s.length()){
               break;
           }
        }
*/