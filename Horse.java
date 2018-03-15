/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horse;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Horse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        HashSet hs=new HashSet();
       for(int i=0;i<4;i++){
           hs.add(sc.nextInt());
       }
       System.out.println(4-hs.size());
    }
}
