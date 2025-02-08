package com.example.kiemtra1.service;

public class Bai2 {
    public static Double thuong(String a, String b) {
        try {
            if(Integer.parseInt(b) == 0){
                return null;
            }
            else return (double) Integer.parseInt(a) / Integer.parseInt(b);
        }
        catch (Exception e) {
            return null;
        }
    }
}
