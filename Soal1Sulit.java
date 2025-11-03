/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1sulit;

/**
 *
 * @author Faiq
 */
import java.util.Scanner;
public class Soal1Sulit {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + i + " : ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\n===== HASIL REKAP NILAI =====");
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.printf("Nilai Rata-rata : %.2f\n", rataRata);
        
    }
}
