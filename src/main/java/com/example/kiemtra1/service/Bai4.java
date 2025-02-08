package com.example.kiemtra1.service;

public class Bai4 {
    public static Object TimPhanTu(int x, Object[] arr) {
        for(Object o : arr) {
            if(x >= 0 && x < arr.length) {
                return arr[x];
            }
            else{
                throw new IllegalArgumentException("Mảng không có index trên");
            }
        }
        return null;
    }
}
