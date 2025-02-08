package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBai4 {
    private Bai4 bai4 = new Bai4();

    @Test
    public void test1() {
        assertEquals("a", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test2() {
        assertEquals("1", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test3() {
        assertEquals("3", bai4.TimPhanTu(10, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test4() {
        assertEquals("a", bai4.TimPhanTu(20, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test5() {
        assertEquals("1", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test6() {
        assertEquals("a", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test7() {
        assertEquals("a", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test8() {
        assertEquals("a", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test9() {
        assertEquals("a", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

    @Test
    public void test10() {
        assertEquals("2", bai4.TimPhanTu(2, new Object[]{1, 3, "a", 3, "4"}));
    }

}
