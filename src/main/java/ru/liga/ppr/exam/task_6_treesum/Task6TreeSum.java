package ru.liga.ppr.exam.task_6_treesum;

public class Task6TreeSum {

    public int treeSum(SimpleTreeNode node) {
        if (node == null) {
            return 0;
        }
        // Суммируем значение текущего узла с суммами значений левого и правого поддеревьев
        return node.value() + treeSum(node.left()) + treeSum(node.right());
    }
    }

