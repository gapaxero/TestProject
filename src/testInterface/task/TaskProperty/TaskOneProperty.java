package testInterface.task.TaskProperty;

import testInterface.Task;

/**
 * @author 1091522
 *
 * @Description
 */
public class TaskOneProperty implements Task {
    @Override
    public void go() {
        System.out.println("GOOOOO");
    }

    @Override
    public void eat() {
        System.out.println("EATTTTTTTTTTT");
    }
}
