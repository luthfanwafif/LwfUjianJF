package com.juaracoding.LWFujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Meminta input nama film*/
        System.out.print("Masukan nama film :");
        String namaFilm = input.nextLine();

        /*Mengubah nama film menjadi huruf besar semua*/
        String namaFilmBesar = namaFilm.toUpperCase();

        /*Menampilkan hasil*/
        System.out.println("Nama film dalam huruf besar :" +namaFilm.toUpperCase());

        /*Menutup scanner ( opsional )*/
        input.close();

    }
}
