package ru.liga.ppr.exam.task_7_sql;

import static org.assertj.guava.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.liga.ppr.common.Utils;

@SpringBootTest
class Task7Test {

	@Autowired
	GoodsDAO goodsDAO;

	@Test
	void when_frequency_above_555_then_1row() {
		var resultSet = goodsDAO.getComputerWithFrequencyMoreThen(555);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(2)
				.hasColumnCount(1)
				.containsColumns("producer")
				.containsCell(1, "producer", "B")
				.containsCell(2, "producer", "A");
	}


	@Test
	void when_frequency_above_99999_then_1row() {
		var resultSet = goodsDAO.getComputerWithFrequencyMoreThen(99999);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(0);
	}

	@Test
	void when_frequency_above_0_then_1row() {
		var resultSet = goodsDAO.getComputerWithFrequencyMoreThen(0);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(3)
				.hasColumnCount(1)
				.containsColumns("producer")
				.containsCell(1, "producer", "E")
				.containsCell(2, "producer", "B")
				.containsCell(3, "producer", "A");
	}

}
