package testInterface;

import testInterface.task.TaskProperty.TaskOneProperty;

/**
 * @author 1091522
 * @Description
 */
public abstract class AbstractTask<T extends Task> {

    protected abstract void doTask(T task);

    public abstract String getTaskName();

}
