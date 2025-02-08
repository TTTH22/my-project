package com.example.kiemtra1.test;

import com.example.kiemtra1.service.Bai5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBai5 {
    private Bai5 bai5 = new Bai5();

    @Test
    public void test1() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("Hoàn", bai5.tenObject(obj));
    }

    @Test
    public void test2() {
        Object obj = null;
        assertEquals("Hoàn", bai5.tenObject(obj));
    }

    @Test
    public void test3() {
        Object obj = new Object() {
        };
        assertEquals("Hoàn", bai5.tenObject(obj));
    }

    @Test
    public void test4() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("Hoàng", bai5.tenObject(obj));
    }

    @Test
    public void test5() {
        Object obj = new Object() {
            String name = "";
            int age = 4;
        };
        assertEquals("Hoàn", bai5.tenObject(obj));
    }

    @Test
    public void test6() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("Hoàng", bai5.tenObject(obj));
    }

    @Test
    public void test7() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
            String diaChi = "sdsd";
        };
        assertEquals("Hoàn", bai5.tenObject(obj));
    }

    @Test
    public void test8() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("H", bai5.tenObject(obj));
    }

    @Test
    public void test9() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("Hoà", bai5.tenObject(obj));
    }

    @Test
    public void test10() {
        Object obj = new Object() {
            String name = "Hoàn";
            int age = 4;
        };
        assertEquals("àn", bai5.tenObject(obj));
    }
}
