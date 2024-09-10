package pack1;

public class Outter {
    private int num1;
    private int num2;
    public void show(){
        num1++;
        System.out.println(num1);

        Inner inner = new Inner();
    }
    class Inner{
        int num1;
        public void show(){
            Inner.this.num1++;
            Outter.this.num1++;
            System.out.println("hello" + num1);
        }
    }
}
