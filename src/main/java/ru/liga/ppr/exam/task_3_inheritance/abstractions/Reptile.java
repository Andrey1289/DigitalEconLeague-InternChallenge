package ru.liga.ppr.exam.task_3_inheritance.abstractions;

public abstract class Reptile implements Vertebrates {

	public abstract boolean canDropTheTail();

	@Override
	public int countOfVertebra() {
		return 40;
	}
}
