package ru.liga.ppr.exam.task_4_stonks;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void example1() throws IOException {
        List<String> stocks1 = new java.util.ArrayList<>();
        stocks1.add("A");
        stocks1.add("B");
        List<String> stocks2 = new java.util.ArrayList<>();
        stocks2.add("A");
        stocks2.add("B");
        stocks2.add("A");
        assertFalse(new Task4().checkEquals(stocks1, stocks2));
    }

    @Test
    public void example2() throws IOException {
        List<String> stocks1 = new java.util.ArrayList<>();
        stocks1.add("A");
        stocks1.add("B");
        List<String> stocks2 = new java.util.ArrayList<>();
        stocks2.add("A");
        stocks2.add("B");
        assertTrue(new Task4().checkEquals(stocks1, stocks2));
    }

    @Test
    public void example3() throws IOException {
        List<String> stocks1 = new java.util.ArrayList<>();
        stocks1.add("B");
        stocks1.add("A");
        List<String> stocks2 = new java.util.ArrayList<>();
        stocks2.add("A");
        stocks2.add("B");
        assertTrue(new Task4().checkEquals(stocks1, stocks2));
    }


    @Test
    public void example5() throws IOException {
        List<String> stocks1 = new java.util.ArrayList<>();
        stocks1.add("B");
        stocks1.add("A");
        stocks1.add("C");
        List<String> stocks2 = new java.util.ArrayList<>();
        stocks2.add("A");
        stocks2.add("B");
        assertFalse(new Task4().checkEquals(stocks1, stocks2));
    }

    @Test
    public void example6() throws IOException {
        List<String> stocks1 = new java.util.ArrayList<>();
        stocks1.add("A");
        stocks1.add("B");
        stocks1.add("B");
        List<String> stocks2 = new java.util.ArrayList<>();
        stocks2.add("A");
        stocks2.add("B");
        stocks2.add("A");
        assertFalse(new Task4().checkEquals(stocks1, stocks2));
    }

}
