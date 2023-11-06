package org.hussard.pattern.openclose;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TaskListTest {
    /**
     * Method under test: {@link TaskList#doTasks()}
     */
    @Test
    void doTasks() {
        TaskList taskList = new TaskList();
        TaskDeadline taskDeadline = Mockito.spy(new TaskDeadline());
        TaskToDo taskToDo = Mockito.spy(new TaskToDo());
        TaskMeeting taskMeeting = Mockito.spy(new TaskMeeting());
        taskList.addTask(taskDeadline);
        taskList.addTask(taskToDo);
        taskList.addTask(taskMeeting);
        taskList.doTasks();

        Mockito.verify(taskDeadline).doTask();
        Mockito.verify(taskToDo).doTask();
        Mockito.verify(taskMeeting).doTask();
    }


    /**
     * Method under test: {@link TaskList#doTasks()}
     */
    @Test
    void doTasks_ParamIsTaskDeadline() {
        TaskList taskList = new TaskList();
        TaskDeadline taskDeadline = Mockito.spy(new TaskDeadline());
        taskList.addTask(taskDeadline);
        taskList.doTasks();

        Mockito.verify(taskDeadline).doTask();
    }

    /**
     * Method under test: {@link TaskList#doTasks()}
     */
    @Test
    void doTasks_ParamIsNull() {
        TaskList taskList = new TaskList();
        taskList.addTask(null);
        assertThatThrownBy(() -> taskList.doTasks())
                .hasMessage("Cannot invoke \"org.hussard.pattern.openclose.Task.doTask()\" because \"task\" is null");
    }
}

