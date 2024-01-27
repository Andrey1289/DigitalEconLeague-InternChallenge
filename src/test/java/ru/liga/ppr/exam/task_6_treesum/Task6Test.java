package ru.liga.ppr.exam.task_6_treesum;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Task6Test {


    Task6TreeSum task = new Task6TreeSum();

    @Test
    public void sortSimpleTree() {
        SimpleTreeNode root = new SimpleTreeNode(
            new SimpleTreeNode(null, null, 1),
            new SimpleTreeNode(null, null, 3),
            2);
        assertThat(task.treeSum(root)).isEqualTo(6);
    }

    @Test
    public void checkTreeDoesNotUseLexographicSort() {
        SimpleTreeNode root = new SimpleTreeNode(
            new SimpleTreeNode(null, null, 1),
            new SimpleTreeNode(null, null, 10),
            2);
        assertThat(task.treeSum(root)).isEqualTo(13);
    }

    @Test
    public void complexTree() {
        SimpleTreeNode root = new SimpleTreeNode(
            new SimpleTreeNode(
                new SimpleTreeNode(null, null, 1),
                new SimpleTreeNode(null, null, 2),
                3),
            new SimpleTreeNode(
                null,
                new SimpleTreeNode(
                    new SimpleTreeNode(null, null, 4),
                    null,
                    5),
                6),
            7);
        assertThat(task.treeSum(root)).isEqualTo(28);
    }
}
