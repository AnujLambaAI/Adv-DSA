package com.scheduler;

import com.scheduler.queues.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private PriorityQueue<Task> queue;

    public Scheduler(PriorityQueue<Task> queue) {
        this.queue = queue;
    }

    public void addTask(String name, int priority) {
        Task task = new Task(name, priority);
        queue.insert(task, priority);
    }

    public Task getNextTask() {
        return queue.removeMin();
    }

    public boolean hasTasks() {
        return !queue.isEmpty();
    }
}
