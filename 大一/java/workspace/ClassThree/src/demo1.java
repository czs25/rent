public class demo1 {
    public static void main(String[] args) {
        getsum(10, 20);//直接调用
        int num = allsum(10, 22);//赋值调用
        System.out.println(num);//输出调用

    }

    public static void getsum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public static int allsum(int sum1, int sum2) {
        int resulm = sum1 + sum2;
        System.out.println(resulm);
        return resulm;
    }
}



