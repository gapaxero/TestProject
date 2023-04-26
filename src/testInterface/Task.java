package testInterface;

/**
 * @author 1091522
 * @Description
 */
public interface Task {

    void go();

    void eat();

    default void count(int a, int b){
        System.out.println(a+b);
    }


}
