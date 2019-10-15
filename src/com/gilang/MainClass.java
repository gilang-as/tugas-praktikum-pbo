package com.gilang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    public static void main(String[] args) {
        String kode="";
        int jumlah=0;
        String cara="";

        double HargaProduk;
        int UkuranProduk=0;
        String WarnaProduk="";

        String NoKasir="";

        float diskon;
        int total;
        System.out.println("===================");
        System.out.println("Program Penjualan");
        System.out.println("===================");
        BufferedReader baca=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukan Kode Barang :");
            kode=baca.readLine();
            System.out.println("Masukan Jumlah Barang :");
            jumlah=Integer.valueOf(baca.readLine());
            System.out.println("Masukan Ukuran Barang :");
            UkuranProduk=Integer.valueOf(baca.readLine());
            System.out.println("Masukan Warna Barang :");
            WarnaProduk=String.valueOf(baca.readLine());
            //System.out.println("Masukan Cara Beli :");
            //cara=baca.readLine();
            System.out.println("Kasir :");
            NoKasir=baca.readLine();
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        DetailProduk produk= new DetailProduk(kode);
        DetailKasir kasir= new DetailKasir(NoKasir);


        HargaProduk=produk.HargaAwalProduk;
        if (cara.equalsIgnoreCase("tunai")) {
            diskon=(float) (HargaProduk*0.10);
        } else {
            diskon=0;
        }
        HargaProduk=jumlah*HargaProduk;
        total=(int) (HargaProduk-diskon);
        System.out.println("====================");
        System.out.println("Struk Pembayaran");
        System.out.println("====================");
        System.out.println("Nama Barang :"+produk.NamaProduk);
        System.out.println("Merek Barang :"+produk.MerkProduk);
        System.out.println("Harga Barang :"+produk.HargaAwalProduk);
        System.out.println("Ukuran Barang :"+UkuranProduk);
        System.out.println("Warna Barang :"+WarnaProduk);
        System.out.println("----------------------");
        //System.out.println("Jumlah Barang :"+jumlah);
        //System.out.println("Total Harga :"+HargaProduk);
        //System.out.println("Cara Beli : "+cara);
        //System.out.println("Potongan Harga : "+diskon);
        //System.out.println("Total Bayar :"+total);
        //System.out.println("----------------------");
        System.out.println("No Kasir :"+NoKasir);
        System.out.println("Nama Kasir :"+kasir.NamaKasir);
        System.out.println("Tanggal :"+kasir.Tanggal);
        System.out.println("Jam :"+kasir.Jam);

    }
}