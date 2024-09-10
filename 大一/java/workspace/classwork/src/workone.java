import java.util.Scanner;

//崔子硕 2022015459 软件一班
public class workone {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<i;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*num-2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}


//崔子硕 2022015459 软件一班
//public class workone{
//    public static void main(String[] args){
//        Scanner input =new Scanner(System.in);
//        int num=input.nextInt();
//        int num1=num;
//        int all=1;
//        if(num1<=0) {
//            System.out.println("请输入正整数");
//        }
//        else{
//            for(int i = 0;;i++){
//                if(num1==0)
//                    break;
//                else
//                    all*=num1;
//                    num1=num1-1;
//            }
//            System.out.println(num+"的阶乘是:"+all);
//        }
//    }
//
//}
