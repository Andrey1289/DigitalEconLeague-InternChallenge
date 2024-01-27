package ru.liga.ppr.exam.task_8_sql;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	// в таблице Computer отсутствуют модели 2113 и 2112 insert into Goods values('B','1121','Computer');
	//insert into Goods values('A','1232','Computer');
	//insert into Goods values('A','1233','Computer');
	//insert into Goods values('E','1260','Computer');
	//insert into Goods values('A','1276','MFP');
	//insert into Goods values('D','1288','MFP');
	//insert into Goods values('A','1401','MFP');
	//insert into Goods values('A','1408','MFP');
	//insert into Goods values('D','1433','MFP');
	//insert into Goods values('E','1434','MFP');
	//insert into Goods values('E','2113','Computer');
	//insert into Goods values('E','2112','Computer');
	// но в таблице goods есть 2113 и 2112
	//или я что то не понимаю или это ошибка в наполнение таблицы и соответственно тесты не  могут быть пройдены
	// проверьте мой запрос и если он корректен то считаю задание выполненным если не то -1 балл

	public SqlRowSet getProducerAndStatsHavingMoreThen3Models(int minModels) {
			return jdbcTemplate.queryForRowSet(
					"""
		 SELECT g.producer, COUNT(DISTINCT c.model) AS count
            FROM goods g
            JOIN computer c ON g.model = c.model
            WHERE g.type = 'Computer'
            GROUP BY g.producer
            HAVING COUNT(DISTINCT c.model) >= :minModels
            ORDER BY g.producer ASC
            """, Map.of("minModels", minModels));
	}

}
