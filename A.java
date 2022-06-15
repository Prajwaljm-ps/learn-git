package OOPS;

public class A {

    public int pub;
    protected int pro;
    private int pvt;

    public void initialize(int a, int b, int c) {
        pub = a;
        pro = b;
        pvt = c;
    }

    protected void show() {
        System.out.println("Hello");
    }

    public void display() {
        System.out.println("Details : "+pub+" "+pro+" "+pvt);
    }

}
