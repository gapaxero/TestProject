package testException;

/**
 * @Author 1091522
 * @Description
 */
public class MingException extends Exception {

    private String code;

    private String desc;

    public MingException() {
    }

    public MingException(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getMessage() {
        return code + ":" + desc;
    }

}
