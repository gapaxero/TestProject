package testInterface.logic;

import testInterface.AbstractTask;
import testInterface.task.TaskOne;
import testInterface.task.TaskProperty.TaskOneProperty;
import testInterface.task.TaskTwo;

/**
 * @author 1091522
 * @Description
 */
public class doWork {

    public static void main(String[] args) {

        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();

        System.out.println(checkTask(taskOne));
        System.out.println(checkTask(taskTwo));

    }

    public static String checkTask(AbstractTask task) {
        return task.getTaskName();
    }

}
