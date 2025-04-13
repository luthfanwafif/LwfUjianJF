package com.juaracoding.LWFujian1jf.ujian1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Inputan penjumlahan tiket*/
        System.out.print("Jumlah tiket: ");
        int jumlahtiket = input.nextInt();
        input.nextLine();

        /*Inputan hari untuk pembelian sebuah tiket*/
        System.out.print("Silahkan masukan hari yang anda pilih : ");
        String hari = input.nextLine().toLowerCase();

        /*Menentukan sebuah harga tiket berdasarkan hari*/
        int hargaTiket;
        if (hari.equals("sabtu")|| hari.equals("minggu")) {
            hargaTiket = 45000;
        }else {
            hargaTiket = 35000;
        }

        /*Menghitung untuk total harga*/
        int totalharga = jumlahtiket * hargaTiket;

        /*Pengecekan diskon*/
        boolean dapatDiskon = false;
        if (jumlahtiket >= 5) {
            totalharga-= (totalharga * 10 / 100);
            dapatDiskon = true;
        }

        DecimalFormat formatRupiah = new DecimalFormat("#,###.00");
        String totalRupiah = "Rp" + formatRupiah.format(totalharga)
                .replace('.','#')
                .replace(',','.')
                .replace('#',',');

        /*Menampilkan hasil RINCIAN PEMBELIAN TIKET FILM Berserta harga per tiket */
        System.out.println("==========================================");
        System.out.println("        RINCIAN PEMBELIAN TIKET FILM      ");
        System.out.println("==========================================");

        System.out.println("Harga per tiket : Rp " + formatRupiah.format(hargaTiket)
                .replace('.','#')
                .replace(',','.')
                .replace('#',','));
        System.out.println("Jumlah tiket : " + jumlahtiket);
        if (dapatDiskon) {
            System.out.println("Diskon : 10% ( Pembelian untuk 5 Tiket atau Lebih ) ");
        } else {
            System.out.println("Diskon: Tidak ada (karena pembelian kurang dari 5 Tiket) ");

        }
        System.out.println("Total harga yang harus dibayar: " + totalRupiah);
        /*Mendapatkan diskon 10% jika pembelian lebih dari 5 Tiket atau lebih*/
        if (jumlahtiket >= 5) {
            totalharga = totalharga - (totalharga * 10 / 100);
        }
        System.out.println("==========================================");
        System.out.println("Terima kasih telah membeli tiket di sistem kami.");
        System.out.println("Selamat menonton dan semoga harimu menyenangkan!");
        System.out.println("==========================================");

        /*Menutup scanner ( opsional )*/
        input.close();
    }
}
