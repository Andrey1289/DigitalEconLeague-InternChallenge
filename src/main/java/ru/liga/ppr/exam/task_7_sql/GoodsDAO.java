package ru.liga.ppr.exam.task_7_sql;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getComputerWithFrequencyMoreThen(int frequency) {
			return jdbcTemplate.queryForRowSet(
					"""
							 SELECT DISTINCT g.producer
                        FROM computer c
                        JOIN goods g ON c.model = g.model AND g.type = 'Computer'
                        WHERE c.frequency >= :frequency
                        ORDER BY g.producer DESC""", Map.of("frequency", frequency));
	}

}
