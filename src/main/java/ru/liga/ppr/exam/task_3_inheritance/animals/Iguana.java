package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Reptile;

public class Iguana extends Reptile {

	@Override
	public boolean canDropTheTail() {
		return false;
	}

}
