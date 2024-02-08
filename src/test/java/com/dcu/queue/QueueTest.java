package com.dcu.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
    private Queue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue<>();
    }

    @AfterEach
    public void tearDown() {
        queue = null;
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

    @Test
    public void testEnqueueNullItem() {
        queue.enqueue(null);
        //assertTrue(queue.isEmpty()); //Failed Test case as we are pushing an object
        // with null value
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeueEmptyQueue() {
        assertNull(queue.dequeue());
    }

    @Test
    public void testPeekEmptyQueue() {
        assertNull(queue.peek());
    }

    @Test
    public void testSizeAfterClear() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.clear();

        assertEquals(0, queue.size());
    }

    @Test
    public void testDequeueAllItems() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, (int) queue.dequeue());
        assertEquals(3, (int) queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueueMultipleItems() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeueNonEmptyQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, (int) queue.dequeue());
        assertEquals(3, (int) queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeekNonEmptyQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.peek());
        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsEmptyOnEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSizeOnEmptyQueue() {
        assertEquals(0, queue.size());
    }

    @Test
    public void testClearOnNonEmptyQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.clear();

        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueNullItem() {
        queue.enqueue(null);
        assertNull(queue.dequeue());
    }

    @Test
    public void testPeekNullItem() {
        queue.enqueue(null);
        assertNull(queue.peek());
    }
}
