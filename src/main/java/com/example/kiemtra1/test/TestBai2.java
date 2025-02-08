package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBai2 {
    private Bai2 bai2 = new Bai2();

    @Test
    public void test1() {
        assertEquals(Double.valueOf(4), bai2.thuong("8", "2"));
    }

    @Test
    public void test2() {
        assertEquals(Double.valueOf(-4), bai2.thuong("-8", "2"));
    }

    @Test
    public void test3() {
        assertEquals(Double.valueOf(0), bai2.thuong("0", "2"));
    }

    @Test
    public void test4() {
        assertEquals(null, bai2.thuong("dfdfdf", "2"));
    }

    @Test
    public void test5() {
        assertEquals(null, bai2.thuong("8", "0"));
    }

    @Test
    public void test6() {
        assertEquals(Double.valueOf(2), bai2.thuong("8", "2"));
    }

    @Test
    public void test7() {
        assertEquals(Double.valueOf(4), bai2.thuong("4", "0"));
    }

    @Test
    public void test8() {
        assertEquals(Double.valueOf(4), bai2.thuong("8", "fđfdf"));
    }

    @Test
    public void test9() {
        assertEquals(Double.valueOf(4), bai2.thuong("8", "-2"));
    }

    @Test
    public void test10() {
        assertEquals(Double.valueOf(4), bai2.thuong("-8", "-2"));
    }
}
