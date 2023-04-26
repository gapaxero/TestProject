package TestArea;

public class testrn {
    int a = 1;


    public static void main(String[] args) {

        int b = 0;

//        add(a);

        testrn tt = new testrn();

        for (int i = 0; i < 10; i++) {
            tt.add();
        }

        System.out.println(tt.a);

    }

    public void add() {
        this.a = this.a + 1;
    }

    public static int addT(int a) {
        a = a + 1;

        return a;
    }

}
