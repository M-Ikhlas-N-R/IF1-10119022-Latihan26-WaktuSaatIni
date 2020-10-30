package com.latihan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Menampilkan waktu saat ini Latihan 26
 */
public class GetTime {
    public static void main(String[] args) {
        String pola = null;
        Locale lokal = null;
        String hasil = null;

        Date tanggalDanWaktu = new Date();
        pola = "EEEE, dd MMM yyyy H:mm:ss";
        hasil = GetTime.tampilkanTanggalDanWaktu(
                tanggalDanWaktu, pola, lokal);
        System.out.println("Hari ini adalah hari : " + hasil);
    }

    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,
                                                     String pola, Locale lokal) {
        String tanggalStr = null;
        SimpleDateFormat formatter = null;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }

        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }
}
