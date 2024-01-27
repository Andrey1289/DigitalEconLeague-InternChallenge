package ru.liga.ppr.exam.task_5_reverse;

public class Task5 {

    public static Node<String> reverse(Node<String> head) {
        Node<String> current = head;
        Node<String> temp = null;
        Node<String> newHead = null;

        while (current != null) {
            // Меняем местами ссылки next и prev у текущего узла
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Обновляем newHead, чтобы оно указывало на последний обработанный узел
            newHead = current;

            // Перемещаемся к следующему узлу в исходном списке
            current = current.prev;
        }
        // Возвращаем newHead, которое теперь указывает на первый узел перевернутого списка
        return newHead;
    }

}
