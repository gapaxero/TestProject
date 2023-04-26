package testThread;

/**
 * @Author 1091522
 * @Description
 */
public class SyncDeadLockTest {

    public static final String str1 = "AAA";
    public static final String str2 = "BBB";

    public static void main(String[] args) {

        new Thread(new LockTaskA()).start();
        new Thread(new LockTaskB()).start();

    }

    static class LockTaskA implements Runnable {
        @Override
        public void run() {
            String classname = getClass().getSimpleName();
            try {
                System.out.println(classname + " Running");

                for (int i = 0; i < 2; i++) {
                    synchronized (str1) {
                        System.out.println("[" + Thread.currentThread().getName() + "]" + classname + " Lock str1");
                        Thread.sleep(3000);

                        synchronized (str2) {
                            System.out.println("[" + Thread.currentThread().getName() + "]" + classname + " Lock str2");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class LockTaskB implements Runnable {
        @Override
        public void run() {
            String classname = getClass().getSimpleName();
            try {
                System.out.println(classname + " Running");

                for (int i = 0; i < 2; i++) {
                    synchronized (str2) {
                        System.out.println("[" + Thread.currentThread().getName() + "]" + classname + " Lock str2");
                        Thread.sleep(3000);
                        synchronized (str1) {
                            System.out.println("[" + Thread.currentThread().getName() + "]" + classname + " Lock str1");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
