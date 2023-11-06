package org.hussard.pattern.openclose;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public void modifyTask(Task task, Task newTask) {
        this.tasks.remove(task);
        this.tasks.add(newTask);
    }

    public void doTasks() {
        for (Task task : this.tasks) {
            task.doTask();
        }
    }
}
