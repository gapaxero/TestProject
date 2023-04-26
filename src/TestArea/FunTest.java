package TestArea;

import lombok.Data;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 1091522
 * @Description
 */
public class FunTest {

    public static void main(String[] args) {
        aaa aa = new aaa();

        String str = aa.getName().replace("A" , "b");

        System.out.println(str);
        System.out.println(aa.getName());

    }

}

@Data
class aaa {

    private List<String> list;

    private String name = "AAA";

}
