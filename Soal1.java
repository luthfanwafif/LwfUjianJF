package com.juaracoding.LWFujian1jf.ujian1;

import java.text.NumberFormat;
import java.util.Locale;

public class Soal1 {
    public static void main(String[] args) {
        /*menyimpan sebuah informasi film*/
        String namaFilm = "Avengers: Endgame";
        int hargaTiket = 50000;
        int jumlahTiket = 3;

        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        /*cetak output */
        System.out.println("Nama Film: " + namaFilm);
        System.out.println("Harga Tiket: " + formatRupiah.format(hargaTiket));
        System.out.println("Jumlah Tiket: "+ jumlahTiket);
        System.out.println("Total Bayar: " + formatRupiah.format(hargaTiket * jumlahTiket ));
    }
}
