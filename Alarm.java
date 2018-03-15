/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Alarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int hh=sc.nextInt();
    int mm=sc.nextInt();
    int count=0;
   if(hh==07||hh==17||mm==07||mm==17 || mm==27 || mm==37|| mm==47 || mm==57){
       System.out.println(0);
   return;
   }
   else{
       while(hh!=07 && hh!=17 && mm!=07 && mm!=17 && mm!=27 && mm!=37 && mm!=47 && mm!=57 && mm!=7 && hh!=7)
       {
           mm-=n;
           count++;
           if(mm<0){
           mm=mm%60;
           hh=hh-1;
            }
        if(hh<0){
               hh=hh%24;
                }
  //  System.out.println(hh+"::"+mm);
       }
    System.out.println(count);
    }
    }
    }
