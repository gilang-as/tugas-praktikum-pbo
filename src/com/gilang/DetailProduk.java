package com.gilang;

public class DetailProduk {
    String NamaProduk;
    String MerkProduk;
    double HargaAwalProduk;
    DetailProduk(String kode){
        if (kode.equalsIgnoreCase("a")){
            NamaProduk="Sandal";
            MerkProduk="Zandillac";
            HargaAwalProduk=125000;
        } else{
            NamaProduk="Tas Ransel";
            MerkProduk="Eiger";
            HargaAwalProduk=325000;
        }
    }
}

