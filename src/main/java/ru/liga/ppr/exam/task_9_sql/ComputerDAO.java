package ru.liga.ppr.exam.task_9_sql;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComputerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getMFUProducers(String type) {
		return jdbcTemplate.queryForRowSet("""
            SELECT DISTINCT g2.producer AS "producer"
            FROM goods g2
            WHERE g2.type = :type
            AND g2.producer IN (
                SELECT g.producer
                FROM goods g
                JOIN (
                    SELECT model
                    FROM computer
                    WHERE price = (
                        SELECT MIN(price) FROM computer
                    )
                    AND frequency = (
                        SELECT MAX(frequency)
                        FROM computer
                        WHERE price = (
                            SELECT MIN(price) FROM computer
                        )
                    )
                ) c ON g.model = c.model
            )
            """,Map.of("type", type));
	}

}
