package com.gilang;

public class DetailKasir {
    String NamaKasir;
    String Tanggal;
    String Jam;
    Waktu s = new Waktu();
    DetailKasir(String NoKasir){
        if (NoKasir.equalsIgnoreCase("20")){
            NamaKasir="Septiarini";
            Tanggal = s.tanggal();
            Jam = s.jam();
        }else{
            NamaKasir="Agus";
            Tanggal = s.tanggal();
            Jam = s.jam();
        }
    }
}
