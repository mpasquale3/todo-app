
//package com.example.todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task(1, "Test Task");
        assertEquals("Test Task", task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testTaskCompletion() {
        Task task = new Task(2, "Complete this");
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }
}
