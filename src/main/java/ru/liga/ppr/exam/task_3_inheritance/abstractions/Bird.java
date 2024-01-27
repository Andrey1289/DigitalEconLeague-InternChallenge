package ru.liga.ppr.exam.task_3_inheritance.abstractions;

import ru.liga.ppr.exam.task_3_inheritance.enums.FlyType;

public abstract class Bird implements Vertebrates {

	public abstract FlyType fly();

	@Override
	public final int countOfVertebra() {
		return 50;
	}

}
