package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai6;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBai6 {
    private Bai6 bai6 = new Bai6();

    @Test
    public void test1() {
        Object[] arr = {"Banana", "Apple", "Orange", "Grapes"};
        assertEquals("Chữ nhỏ nhất: Apple", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test2() {
        Object[] arr = {"Banana", "Apple", "Orange", "Grapes"};
        assertEquals("Chữ nhỏ nhất: Apple", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test3() {
        Object[] arr = {};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                bai6.timPhanTuBeNhat(arr));
        assertTrue(exception.getMessage().contains("Mảng không được rỗng"));
    }

    @Test
    public void test4() {
        Object[] arr = {5, "Banana", 3, "Apple", "Orange", 2};
        assertEquals("Số nhỏ nhất: 2.0", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test5() {
        Object[] arr = {3};
        assertEquals("Số nhỏ nhất: 3.0", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test6(){
        Object[] arr = {5, "Apple", 3, "Apple", 8};
        assertEquals("Số nhỏ nhất: 3.0", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test7() {
        Object[] arr = {-5, -3, -7, -2};
        assertEquals("Số nhỏ nhất: -7.0", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test8() {
        Object[] arr = {-5, 3, -2, 8, 1};
        assertEquals("Số nhỏ nhất: -5.0", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test9() {
        Object[] arr = {5.5, 3.2, 7.8, 2.1};
        assertEquals("Số nhỏ nhất: 2.1", bai6.timPhanTuBeNhat(arr));
    }

    @Test
    public void test10() {
        Object[] arr = {3, "Banana", 2, "Apple", "Orange"};
        assertEquals("Chữ nhỏ nhất: Apple", bai6.timPhanTuBeNhat(arr));
    }
}
