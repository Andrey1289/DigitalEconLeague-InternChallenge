package ru.liga.ppr.exam.task_6_treesum;

public class SimpleTreeNode {
	private final SimpleTreeNode left;
	private final SimpleTreeNode right;
	private final int value;

	public SimpleTreeNode(SimpleTreeNode left, SimpleTreeNode right, int value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public SimpleTreeNode left() {
		return left;
	}

	public SimpleTreeNode right() {
		return right;
	}

	public int value() {
		return value;
	}
}