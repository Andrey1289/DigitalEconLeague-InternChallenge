package ru.liga.ppr.exam.task_3_inheritance.abstractions;

import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

public abstract class Fish implements Vertebrates {

	public abstract SwimType swim();

	@Override
	public int countOfVertebra() {
		return 20;
	}
}
