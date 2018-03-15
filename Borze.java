/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borze;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Borze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p="";
        for(int i=0;i<s.length();i++){
            if(".".equals(s.substring(i,i+1)) &&s.substring(i,i+1)!=null)
                p+=0;
            else if("-.".equals(s.substring(i,i+2))&& s.substring(i,i+2)!=null){
                p+=1;
                i++;
            }
            else if("--".equals(s.substring(i,i+2))&& s.substring(i,i+2)!=null){
                p+=2;
            i++;
            }
        }
        System.out.println(p);
    }
    
}
