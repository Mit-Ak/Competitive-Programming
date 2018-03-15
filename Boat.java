/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boat;

import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Boat {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long x=sc.nextLong();
        long y=sc.nextLong();
        long ex=sc.nextLong();
        long ey=sc.nextLong();
        int pos=0;
        boolean sail=false;
        String s=sc.next();
        for(int i=0;i<t;i++){
            if(x>ex && s.charAt(i)=='W')
                x-=1;
            else if(x<ex && s.charAt(i)=='E')
                x+=1;
            if(y<ey && s.charAt(i)=='N')
                y+=1;
            else if(y>ey && s.charAt(i)=='S')
               y-=1;
            if(ex==x && ey==y){
                pos=i+1;
                sail=true;
                break;
            }
        }
        System.out.println(sail==true?pos:-1);
    }
    
}
