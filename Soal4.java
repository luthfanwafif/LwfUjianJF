package com.juaracoding.LWFujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] film = new String[5];

        System.out.println("Daftar film bioskop");
        /*Inputan sebuah nama film dengan metode perulangan*/
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukan nama film " + (i + 1) + ": ");
            film[i] = input.nextLine();

        }
        /*untuk menampilkan daftar film yang ingin di tonton*/
        System.out.println("\nFilm yang ingin ditonton");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i+1)+"."+film[i]);
        }

        /*Menutup scanner ( opsional )*/
        input.close();
    }
}
