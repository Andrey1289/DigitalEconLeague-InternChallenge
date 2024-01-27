package ru.liga.ppr.common;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;
import java.util.List;
import java.util.stream.IntStream;
import lombok.experimental.UtilityClass;
import org.springframework.jdbc.support.rowset.SqlRowSet;

@UtilityClass
public class Utils {

	public static Table<Integer, String, String> toTable(SqlRowSet resultSet) {
		Table<Integer, String, String> table = TreeBasedTable.create();
		var md = resultSet.getMetaData();
		int numCols = md.getColumnCount();
		List<String> colNames = IntStream.range(0, numCols).mapToObj(i -> md.getColumnName(i + 1)).toList();
		while (resultSet.next()) {
			colNames.forEach(cn -> table.put(resultSet.getRow(), cn, String.valueOf(resultSet.getObject(cn))));
		}
		return table;
	}

}
