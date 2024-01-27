package ru.liga.ppr.exam.task_2_emailchecker;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Task2Test {

    Task2 task = new Task2();

    @Test
    public void checkEmails() {
        assertThat(task.checkEmail("")).isFalse();
        assertThat(task.checkEmail(null)).isFalse();
        assertThat(task.checkEmail("withoutdomain")).isFalse();
        assertThat(task.checkEmail("@withoutinbox")).isFalse();
        assertThat(task.checkEmail("@withoutinbox.ru")).isFalse();
        assertThat(task.checkEmail("without.inbox")).isFalse();
        assertThat(task.checkEmail("@@@@@")).isFalse();
        assertThat(task.checkEmail("@@@.....")).isFalse();
        assertThat(task.checkEmail("@.")).isFalse();
        assertThat(task.checkEmail("myinboxissooooooolong@teta.ru")).isFalse();
        assertThat(task.checkEmail("prettygood@teta.ru")).isTrue();
        assertThat(task.checkEmail("telebot@tetacomp.com")).isTrue();
        assertThat(task.checkEmail("chat@teta.org")).isTrue();
        assertThat(task.checkEmail("under_scopes@teta.ru")).isFalse();
        assertThat(task.checkEmail("ten10@teta.ru")).isTrue();
        assertThat(task.checkEmail("115002345@tetaent.org")).isTrue();
        assertThat(task.checkEmail("11111111111111111111@teta.org")).isFalse();
        assertThat(task.checkEmail("wrongdomain@noteta.ru")).isFalse();
        assertThat(task.checkEmail("wrongdomain@teta.net")).isFalse();
        assertThat(task.checkEmail("symbols$%^&@teta.net")).isFalse();
        assertThat(task.checkEmail("anothergood@tetacomp.com")).isTrue();
    }

}
