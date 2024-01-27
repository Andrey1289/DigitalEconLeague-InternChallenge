package ru.liga.ppr.exam.task_2_emailchecker;

import java.util.regex.Pattern;

public class Task2 {
	private static final String EMAIL_PATTERN =
			"^[a-zA-Z0-9]{1,15}@teta\\.(ru|org|com)$|" +
					"^[a-zA-Z0-9]{1,15}@tetaent\\.(ru|org|com)$|" +
					"^[a-zA-Z0-9]{1,15}@tetacomp\\.(ru|org|com)$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);


	public boolean checkEmail(String address) {
		if (address == null || address.isEmpty()) {
			return false;
		}
		return pattern.matcher(address).matches();
	}
}
