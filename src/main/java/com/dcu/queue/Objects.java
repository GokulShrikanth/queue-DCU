package com.dcu.queue;

public class Objects {
    int id;

    Objects(int i) {
        this.id = i;
    }

    public static void main(String[] args) {
        Queue<Objects> queue = new Queue<>();
        queue.enqueue(new Objects(1));
        queue.enqueue(new Objects(2));
        queue.enqueue(new Objects(3));
        queue.enqueue(new Objects(4));
        queue.enqueue(new Objects(5));

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue().id);
        }
    }
}
