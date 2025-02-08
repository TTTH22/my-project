package com.example.kiemtra1.service;

public class Bai1 {
    public static Integer tich(String a, String b) {
        try {
            return Integer.parseInt(a) * Integer.parseInt(b);
        }
        catch (Exception e) {
            return null;
        }
    }
}
