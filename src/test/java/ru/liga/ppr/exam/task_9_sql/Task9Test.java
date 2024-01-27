package ru.liga.ppr.exam.task_9_sql;

import static org.assertj.guava.api.Assertions.assertThat;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.liga.ppr.common.Utils;

@SpringBootTest
@Slf4j
class Task9Test {

	@Autowired
	ComputerDAO computerDAO;

	@Test
	void when_type_MFP_then_1row_with_value_E() {
		var resultSet = computerDAO.getMFUProducers("MFP");
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(1)
				.hasColumnCount(1)
				.containsColumns("producer")
				.containsCell(1, "producer", "E");
	}

	@Test
	void when_type_Computer_then_1row_with_value_E() {
		var resultSet = computerDAO.getMFUProducers("Computer");
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(1)
				.hasColumnCount(1)
				.containsColumns("producer")
				.containsCell(1, "producer", "E");
	}

	@Test
	void when_type_ABCD_then_0row() {
		var resultSet = computerDAO.getMFUProducers("ABCD");
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(0);
	}



}
