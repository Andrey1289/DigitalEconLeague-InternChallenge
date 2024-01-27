package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Bird;
import ru.liga.ppr.exam.task_3_inheritance.enums.FlyType;

public class Albatross extends Bird {

    @Override
    public FlyType fly() {
        return FlyType.FLAPPING_OF_WINGS;
    }
}
