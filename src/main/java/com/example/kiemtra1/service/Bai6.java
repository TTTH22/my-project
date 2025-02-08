package com.example.kiemtra1.service;

public class Bai6 {
    public static String timPhanTuBeNhat(Object[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng.");
        }

        // Biến để lưu phần tử bé nhất là số
        Double minNumber = null;
        String minText = null;

        for (Object element : arr) {
            if (element instanceof Number) {
                // Kiểm tra nếu phần tử là số
                double num = ((Number) element).doubleValue();
                if (minNumber == null || num < minNumber) {
                    minNumber = num; // Cập nhật phần tử nhỏ nhất
                }
            } else if (element instanceof String) {
                // Kiểm tra nếu phần tử là chữ (String)
                String text = (String) element;
                if (minText == null || text.compareTo(minText) < 0) {
                    minText = text; // Cập nhật phần tử chữ nhỏ nhất
                }
            }
        }

        // Trả về kết quả
        if (minNumber != null) {
            return "Số nhỏ nhất: " + minNumber;
        } else if (minText != null) {
            return "Chữ nhỏ nhất: " + minText;
        } else {
            return "Không có phần tử hợp lệ trong mảng.";
        }
    }
}
