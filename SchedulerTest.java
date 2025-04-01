package com.scheduler;

import com.scheduler.queues.HeapPriorityQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchedulerTest {

    @Test
    public void testTaskOrdering() {
        Scheduler scheduler = new Scheduler(new HeapPriorityQueue());
        scheduler.addTask("Low Priority Task", 5);
        scheduler.addTask("High Priority Task", 1);
        assertEquals("High Priority Task", scheduler.getNextTask().getName());
    }

    @Test
    public void testIsEmpty() {
        Scheduler scheduler = new Scheduler(new HeapPriorityQueue());
        assertTrue(scheduler.hasTasks() == false);
    }

    @Test
    public void testMultipleTasks() {
        Scheduler scheduler = new Scheduler(new HeapPriorityQueue());
        scheduler.addTask("Task1", 3);
        scheduler.addTask("Task2", 2);
        scheduler.addTask("Task3", 1);
        assertEquals("Task3", scheduler.getNextTask().getName());
        assertEquals("Task2", scheduler.getNextTask().getName());
        assertEquals("Task1", scheduler.getNextTask().getName());
    }
}
