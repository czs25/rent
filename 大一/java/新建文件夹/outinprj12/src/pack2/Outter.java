package pack2;

public class Outter {
        private int num2 = 20;
    public void show(final int num3){
        int num1 = 10;

        class Inner{
            public void show(){
//                num1++;
                System.out.println(num1);
                num2++;
                System.out.println(num2);

                System.out.println(num3);
            }
        }

        Inner inner = new Inner();
    }
}
