package ru.liga.ppr.exam.task_1_GooseDuck;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import ru.liga.ppr.exam.task_1_gooseduck.Task1;

public class Task1Test {

    Task1 task = new Task1();

    @Test
    public void handleGooseDuckCorrect() {
        Map<String, Long> result = task.gooseDuck(
            15
        ).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        assertThat(result)
            .contains(Map.entry("Goose", 4L))
            .contains(Map.entry("Duck", 2L))
            .contains(Map.entry("GooseDuck", 1L))
            .doesNotContainKey("15")
            .doesNotContainKey("9")
            .doesNotContainKey("3")
            .doesNotContainKey("5")
            .contains(Map.entry("4", 1L))
            .contains(Map.entry("11", 1L));
    }

    @Test
    public void emptyListWhenNoElements() {
        assertThat(task.gooseDuck(0))
            .isEmpty();
    }
}
