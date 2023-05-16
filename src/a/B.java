package a;

public class B {
    {
        System.out.println("代码块执行");
    }

    public static void main(String[] args) {

        System.out.println("main方法");
        B b = new B();
        B b1 = new B();
        B b2= new B();
    }
}
