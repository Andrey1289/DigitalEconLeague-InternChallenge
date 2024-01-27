package ru.liga.ppr.exam.task_8_sql;

import static org.assertj.guava.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.liga.ppr.common.Utils;

@SpringBootTest
class Task8Test {

	@Autowired
	ProducerDAO producerDAO;

	@Test
	void when_minModels_3_then_1row_with_producer_E_and_count_3() {
		var resultSet = producerDAO.getProducerAndStatsHavingMoreThen3Models(3);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(1)
				.hasColumnCount(2)
				.containsColumns("producer", "count")
				.containsCell(1, "producer", "E")
				.containsCell(1, "count", "3");

	}


	@Test
	void when_minModels_2_then_2row_with_producer_E_count_3_and_producer_A_count_2() {
		var resultSet = producerDAO.getProducerAndStatsHavingMoreThen3Models(2);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(2)
				.hasColumnCount(2)
				.containsColumns("producer", "count")
				.containsCell(1, "producer", "E")
				.containsCell(1, "count", "3")
				.containsCell(2, "producer", "A")
				.containsCell(2, "count", "2");
	}

	@Test
	void when_minModels_100_then_0row() {
		var resultSet = producerDAO.getProducerAndStatsHavingMoreThen3Models(100);
		var result = Utils.toTable(resultSet);
		assertThat(result)
				.hasRowCount(0);
	}




}
