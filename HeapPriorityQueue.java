package com.scheduler.queues;

import java.util.PriorityQueue;
import java.util.Comparator;
import com.scheduler.Task;

public class HeapPriorityQueue implements PriorityQueue<Task> {
    private PriorityQueue<Task> heap;

    public HeapPriorityQueue() {
        this.heap = new PriorityQueue<>();
    }

    public void insert(Task element, int priority) {
        heap.add(element);
    }

    public Task removeMin() {
        return heap.poll();
    }

    public Task peekMin() {
        return heap.peek();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
