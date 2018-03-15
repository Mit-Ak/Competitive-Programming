/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Team {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0,count1=0;
        boolean danger=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count=0;
            
            while(s.charAt(i)=='0'){
               i++;
               count++;
               if(i>=s.length())
                    break;
            }   
            }
            else{
                count1=0;
            while(s.charAt(i)=='1'){
                i++;
                count1++;
                if(i>=s.length())
                    break;
            }}
            if(count>=7||count1>=7)
                danger=true;
        }
        System.out.println(danger==true ? "YES":"NO");
    }
}
