package testInterface.task;

import testInterface.AbstractTask;
import testInterface.task.TaskProperty.TaskOneProperty;

/**
 * @author 1091522
 * @Description
 */
public class TaskOne extends AbstractTask<TaskOneProperty> {

    @Override
    public void doTask(TaskOneProperty taskOneProperty) {

        taskOneProperty.eat();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public String getTaskName() {
        return "taskOne";
    }

}
