package testextends;

public class TT {

    public static void main(String[] args) {
        CTT ctt = new CTT();

    }

}

class ATT{
    ATT(){
        System.out.println("這裡是A的建構子");
    }
}
class BTT extends ATT{
    BTT(){
        System.out.println("這裡是B的建構子");
    }
    BTT(String str){
        this();
        System.out.println("嗨這裡是B："+str);
    }
}
class CTT extends BTT{
    CTT(){
        this("hello tina");
        System.out.println("這裡是C的建構子");
    }
    CTT(String str){
        super(str);
        System.out.println("嗨這裡是C："+str);
    }
}
