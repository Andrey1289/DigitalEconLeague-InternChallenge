package ru.liga.ppr.exam.task_1_gooseduck;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {


    public List<String> gooseDuck(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "GooseDuck" : "Goose") : (i % 5 == 0 ? "Duck" : String.valueOf(i)))
                .collect(Collectors.toList());
    }
}
