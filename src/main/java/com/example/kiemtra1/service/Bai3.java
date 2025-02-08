package com.example.kiemtra1.service;

public class Bai3 {
    public static double trungBinhCong(String[] numbers) {
        if (numbers == null || numbers.length == 0) { // Kiểm tra mảng rỗng hoặc null
            throw new IllegalArgumentException("mảng phải lớn hơn 0");
        }

        double sum = 0;
        for (String num : numbers) {
            try {
                sum += Double.parseDouble(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Giá trị không hợp lệ: " + num);
            }
        }

        return sum / numbers.length;
    }
}
