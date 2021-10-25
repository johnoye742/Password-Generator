/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class PassGen {
public static StringBuilder sb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=============== PASSWORD GEN V1.0 BY John Oye ===============");
        System.out.println("Input password length(in numbers) :");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String characters = "~!@#$%^&*()-_=+{}<>?|\\/0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] c1 = characters.split("");
        sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            sb.append(c1[new Random().nextInt(c1.length)]);
        }
        System.out.println(sb.toString());
    }
    
}
