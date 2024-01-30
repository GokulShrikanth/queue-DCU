package com.dcu.queue;

public class Objects {
    int id;

    Objects(int i) {
        this.id = i;
    }
    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
    static Object obj = new Objects(1);
    public static void main(String[] args) {
        Queue<Objects> queue = new Queue<>();
        queue.enqueue(new Objects(1));
        queue.enqueue(new Objects(2));
        queue.enqueue(new Objects(3));
        queue.enqueue(new Objects(4));
        queue.enqueue(new Objects(5));

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue().id);
            System.out.println(obj.toString());
        }
    }
}
