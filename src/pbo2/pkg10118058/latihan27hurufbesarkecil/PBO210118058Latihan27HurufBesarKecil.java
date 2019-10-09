/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan27hurufbesarkecil;

/**
 *
 * @author user
 *  * Nama : Satyaning Andaru Bawalaksana
 * Nim : 10118058
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
import java.util.Scanner;
public class PBO210118058Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String huruf = scanner.next();

        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();

        System.out.println();
        System.out.println("======Hasil Formating======");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf kecil : " + kecil);
        System.out.println("Developed By Satyaning Andaru");
    }
    
}
