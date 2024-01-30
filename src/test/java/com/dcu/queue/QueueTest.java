package com.dcu.queue;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    private Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, (int) queue.dequeue());
        assertEquals(3, (int) queue.dequeue());

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.peek());
        assertEquals(1, (int) queue.peek());
        assertEquals(1, (int) queue.peek());

        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);

        assertFalse(queue.isEmpty());

        queue.dequeue();

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());

        queue.dequeue();

        assertEquals(2, queue.size());

        queue.clear();

        assertEquals(0, queue.size());
    }

    @Test
    public void testClear() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());

        queue.clear();

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }
}
