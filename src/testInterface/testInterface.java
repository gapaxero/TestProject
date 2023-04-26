package testInterface;

/**
 * @author 1091522
 * @Description
 */
public interface testInterface {

    void go();

    void eat();

    default void count(int a, int b){
        System.out.println(a+b);
    }

    String a = "aa";

}
