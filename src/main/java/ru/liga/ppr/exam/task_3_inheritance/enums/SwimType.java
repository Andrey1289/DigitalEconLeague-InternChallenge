package ru.liga.ppr.exam.task_3_inheritance.enums;

public enum SwimType {

	FIN("Плавает с помощью плавников"),
	BODY_BENDING("Плавает с помощью изгибания тела");

	SwimType(String description) {
		this.description = description;
	}

	private final String description;

	public String getDescription() {
		return description;
	}
}
