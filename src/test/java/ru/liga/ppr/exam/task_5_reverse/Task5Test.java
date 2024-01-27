package ru.liga.ppr.exam.task_5_reverse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public class Task5Test {

	@Test
	public void example1() throws IOException {
		Node<String> next3 = new Node<>("Сделать домашнее задание по литературе", null, null);
		Node<String> next2 = new Node<>("Пообедать", next3, null);
		next3.prev = next2;
		Node<String> next1 = new Node<>("Сделать домашнее задание по математике", next2, null);
		next2.prev = next1;
		Node<String> head = new Node<>("Сходить в магазин", next1, null);
		next1.prev = head;
		assertTrue(check2LinkedList(head));

		Node<String> solutionHead = Task5.reverse(head);
		assertTrue(solutionHead != null);
		assertTrue("Сделать домашнее задание по литературе".equals(solutionHead.value));
		assertTrue(solutionHead.next != null);
		assertTrue("Пообедать".equals(solutionHead.next.value));
		assertTrue(solutionHead.next.next != null);
		assertTrue("Сделать домашнее задание по математике".equals(solutionHead.next.next.value));
		assertTrue(solutionHead.next.next.next != null);
		assertTrue("Сходить в магазин".equals(solutionHead.next.next.next.value));

		assertTrue(check2LinkedList(solutionHead));
	}

	private boolean check2LinkedList(Node<String> head) {
		Node<String> node = head;
		Node<String> nodePrev = null;
		while (node != null) {
			if (nodePrev != null) {
				if (node.prev != nodePrev) {
					return false;
				}
			}
			nodePrev = node;
			node = node.next;
		}
		return true;
	}


}
