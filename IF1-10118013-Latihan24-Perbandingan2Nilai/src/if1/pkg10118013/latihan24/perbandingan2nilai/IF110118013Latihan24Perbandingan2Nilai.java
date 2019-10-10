/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan24.perbandingan2nilai;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Perbandingan Dua Buah Nilai
 */
public class IF110118013Latihan24Perbandingan2Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Perbandingan Nilai");
        Scanner scanner = new Scanner(System.in);
        String aktifitas = "Ya";
        while (aktifitas.equals("Ya")){
            System.out.print("Masukkan nilai pertama : ");
            int[] nilai = new int[2];
            nilai[0] = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai[1] = scanner.nextInt();
            System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1])? " Lebih Kecil " : ((nilai[0] == nilai[1]))? " Sama Dengan " : " Lebih Besar "));
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aktifitas = scanner.next();
        }
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
