package ru.liga.ppr.exam.task_4_stonks;

import java.util.List;


public class Task4 {

    public boolean checkEquals(List<String> stocks1, List<String> stocks2)  {
        if (stocks1.size() != stocks2.size()) {
            return false;
        }

        int hash1 = 0;
        for (String stock : stocks1) {
            hash1 += stock.hashCode();
        }

        int hash2 = 0;
        for (String stock : stocks2) {
            hash2 += stock.hashCode();
        }

        return hash1 == hash2;
    }
}
