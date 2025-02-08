package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBai1 {
    private Bai1 bai1 = new Bai1();

    @Test
    public void test1() {
        assertEquals(Integer.valueOf(15), bai1.tich("3", "5"));
    }

    @Test
    public void test2() {
        assertEquals(null, bai1.tich("sds", "5"));
    }

    @Test
    public void test3() {
        assertEquals(Integer.valueOf(0), bai1.tich("0", "5"));
    }

    @Test
    public void test4() {
        assertEquals(Integer.valueOf(-15), bai1.tich("-3", "5"));
    }

    @Test
    public void test5() {
        assertEquals(Integer.valueOf(15), bai1.tich("-3", "-5"));
    }

    @Test
    public void test6() {
        assertEquals(Integer.valueOf(6), bai1.tich("3", "5"));
    }

    @Test
    public void test7() {
        assertEquals(Integer.valueOf(23), bai1.tich("fdfdf", "5"));
    }

    @Test
    public void test8() {
        assertEquals(Integer.valueOf(3), bai1.tich("-3", "5"));
    }

    @Test
    public void test9() {
        assertEquals(Integer.valueOf(3), bai1.tich("0", "5"));
    }

    @Test
    public void test110() {
        assertEquals(Integer.valueOf(3), bai1.tich("3", "5"));
    }


}
