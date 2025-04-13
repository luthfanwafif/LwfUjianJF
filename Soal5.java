package com.juaracoding.LWFujian1jf.ujian1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal5 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] hargaTiket = new int[5];
        int totalHarga = 0;

        DecimalFormat formatRupiah = new DecimalFormat("Rp#,###.00");

        System.out.println("===== Masing - Masing Harga Tiket Film =====\n");

        /*inputan untuk sebuah harga tiket*/
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.print("Masukan harga tiket film " + (i + 1) + ": ");
            hargaTiket[i] = input.nextInt();
            totalHarga += hargaTiket[i];

        }

        System.out.println("\n========== Rincian Harga Tiket ==========");
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": "+ formatRupiah.format(hargaTiket[i]));
        }

        System.out.println("==========================================");
        System.out.println("total harga tiket : "+ formatRupiah.format(totalHarga));

        System.out.println("\nTerima kasih telah menggunakan layanan dari kami.");
        System.out.println("Kami senang dapat melayani Anda.");
        System.out.println("Selamat menonton dan semoga pengalaman menonton Anda menyenangkan!");

        input.close();
    }
}
