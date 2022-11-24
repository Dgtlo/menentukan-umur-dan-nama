/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menerimaumur;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menerimaumur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner scan = new Scanner (System.in);
        System.out.print ("masukan nama: ");
        nama=scan.nextLine();
        System.out.print ("masukan umur: ");
        umur=scan.nextInt();
        
        if (umur>=60)
        {
        System.out.println ("tuan"+nama+"apakah sudah pensiun?");
        }
        else if (umur <60 && umur >=25)
        {
        System.out.println ("saudara"+nama+"apakah masih bekerja?");
        }
        else if (umur >=0 && umur < 25)
        {
        System.out.println ("adik"+nama+"apakah masih sekolah?");
        }
        else
        {
        System.out.println ("inputan anda salah");
        }
    }
    
}
