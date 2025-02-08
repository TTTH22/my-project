package com.example.kiemtra1.service;

import java.lang.reflect.Field;

public class Bai5 {
    public static String tenObject(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Đối tượng không tồn tại");
        }

        try {
            // Lấy lớp của đối tượng
            Class<?> clazz = object.getClass();

            // Kiểm tra xem đối tượng có thuộc tính "name" hay không
            Field field = clazz.getDeclaredField("name"); // Truy cập trường "name"
            field.setAccessible(true); // Cho phép truy cập trường private

            // Lấy giá trị của thuộc tính "name" từ đối tượng
            String name = (String) field.get(object);
            if (name.isBlank()) {
                throw new IllegalArgumentException("Tên bị trống");
            }
            else return name;

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalArgumentException("Không thể truy xuất thông tin: " + e.getMessage());
        }
    }
}
