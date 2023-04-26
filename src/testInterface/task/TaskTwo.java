package testInterface.task;

import testInterface.AbstractTask;
import testInterface.task.TaskProperty.TaskTwoProperty;

/**
 * @author 1091522
 * @Description
 */
public class TaskTwo extends AbstractTask<TaskTwoProperty> {

    @Override
    public void doTask(TaskTwoProperty taskTwoProperty) {

        taskTwoProperty.go();

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

    @Override
    public String getTaskName() {
        return "TaskTwo";
    }

}
