package testThread;

/**
 * @Author 1091522
 * @Description
 */
public class ThreadNew {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("gogo");
        }).start();

    }

}
