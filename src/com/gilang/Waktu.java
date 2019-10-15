package com.gilang;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Waktu {
    LocalDateTime myDateObj = LocalDateTime.now();
    public String tanggal() {
        return myDateObj.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String jam() {
        return myDateObj.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
