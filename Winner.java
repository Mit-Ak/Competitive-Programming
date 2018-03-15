/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winner;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Winner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String prev=sc.next();
        int fir=0,sec=0;
        String other="";
        if(n>1){
        for(int i=1;i<n;i++){
            String cur=sc.next();
            if(prev.compareTo(cur)==0)
                fir++;
            else{
                sec++;
            other=cur;
            }
        }
        }
        else{
            System.out.println(prev);
           return;
        }
        System.out.println(fir+1>sec ? prev : other);
    }
    
}
