package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai3;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBai3 {
    private Bai3 bai3 = new Bai3();

    @Test
    public void test1() {
        assertEquals(4, bai3.trungBinhCong(new String[]{"3", "4", "5"}), 0.001);
    }

    @Test
    public void test2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                bai3.trungBinhCong(new String[]{})
        );
        System.out.println("Thông báo ngoại lệ: " + exception.getMessage()); // Debug xem lỗi là gì
    }

    @Test
    public void test3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                bai3.trungBinhCong(new String[]{"a", "b", "c"})
        );
        System.out.println("Thông báo ngoại lệ: " + exception.getMessage()); // Debug xem lỗi là gì

    }

    @Test
    public void test4() {
        assertEquals(0, bai3.trungBinhCong(new String[]{"0", "0", "0"}), 0.001);
    }

    @Test
    public void test5() {
        assertEquals(4, bai3.trungBinhCong(new String[]{"a", "4", "5"}), 0.001);
    }

    @Test
    public void test6() {
        assertEquals(-4, bai3.trungBinhCong(new String[]{"-3", "-4", "-5"}), 0.001);
    }

    @Test
    public void test7() {
        assertEquals(4, bai3.trungBinhCong(new String[]{}), 0.001);
    }

    @Test
    public void test8() {
        assertEquals(6, bai3.trungBinhCong(new String[]{"3", "4", "5"}), 0.001);
    }

    @Test
    public void test9() {
        assertEquals(4.5, bai3.trungBinhCong(new String[]{"0", "4", "5"}), 0.001);
    }

    @Test
    public void test10() {
        assertEquals(4.8, bai3.trungBinhCong(new String[]{"9", "4", "5"}), 0.001);
    }

}
