package pack1;

public class Test {
    public static void main(String[] args) {
        Outter outter = new Outter();

        Outter.Inner inner = new Outter().new Inner();
        inner.show();
    }
}
