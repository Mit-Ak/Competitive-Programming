/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joke;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Joke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> al=new ArrayList<>();
        String a=sc.next();
        for(int i=0;i<a.length();i++)
            al.add(a.charAt(i));
           String b=sc.next();
         for(int i=0;i<b.length();i++)
            al.add(b.charAt(i));
        String c=sc.next();
        for(int i=0;i<c.length();i++){
            if(al.contains(c.charAt(i))){
            al.remove((Character)c.charAt(i));
        }
    }
        if(al.isEmpty() && c.length()==(a.length()+b.length()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
