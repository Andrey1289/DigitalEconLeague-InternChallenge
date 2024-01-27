package ru.liga.ppr.exam.task_3_inheritance.enums;

public enum FlyType {

	FLAPPING_OF_WINGS("Летает с помощью взмаха крыльев");

	FlyType(String description) {
		this.description = description;
	}

	private final String description;

	public String getDescription() {
		return description;
	}

}
