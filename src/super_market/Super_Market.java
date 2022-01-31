/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_market;

import java.util.Scanner;

/**
 *
 * @author shandy
 */
public class Super_Market {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        double diskon;
        int belanja, totalBayar;
        String member;

        System.out.println("jumlah perbelanjaan= ");
        belanja = input.nextInt();
        System.out.println("iya/tidak");
        System.out.println("apakah anda member =");
        member = input.next();
        if (member.equals("tidak")) {
            if (belanja > 500000) {
                diskon = 5 * belanja;
                System.out.println("total diskon anda adalah Rp. " + diskon);
            } else {
                System.out.println("anda tidak mendapatkan diskon");
            }
        }

        if (member.equals("iya")) {
            if (belanja > 500000) {
                diskon = 15 * belanja;
                System.out.println("total diskon anda adalah Rp." + diskon);
            } else if (belanja > 100000) {
                diskon = 5 * belanja;
                System.out.println("total diskon anda adalah Rp. " + diskon);
            } else {
                System.out.println("total diskon anda adalah Rp. 2000");

            }

        }
    }

}
