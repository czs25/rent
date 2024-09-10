import java.util.Scanner;

public class two {
    public static void main(String[] args){

        //”a+aa+aaa+aaaa+a....a“的计算
//        int all=0;
//        Scanner input=new Scanner(System.in);
//        System.out.print("输入你的数字:");
//        int num=input.nextInt();
//
//        System.out.print("输入你的数值宽度:");
//        int n=input.nextInt();
//        for(int i = 1;i <= n; i++){
//            int temp=0;
//            for(int j=1;j<=i;j++){
//                temp+=(int)num*Math.pow(10,(j-1));
//            }
//            System.out.println(""+temp);
//            all = all + temp;
//        }
//        System.out.println("all="+all);


//完数的计算
        for(int i = 1;i<=1000;i++){
            int num=0;
            for(int j=1;j<i;j++){
                if(i%j==0)
                    num+=j;
            }
            if(num==i)
            System.out.println(num+ "是完数");
        }


    }
}
