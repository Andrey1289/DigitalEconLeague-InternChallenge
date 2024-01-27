package ru.liga.ppr.exam.task_5_reverse;

class Node<V> {
    public V value;  
    public Node<V> next;  
    public Node<V> prev;  
 
    public Node(V value, Node<V> next, Node<V> prev) {  
        this.value = value;  
        this.next = next;  
        this.prev = prev;  
    }
}