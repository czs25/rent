package java.fuxi.shuzu;

        public class ShuZu {
            private int num;
            public ShuZu add(){
                num++;
                return this;
            }
            public int getNum() {
                return num;
            }
            public static void main(String[] args) {
                ShuZu cou = new ShuZu();
                cou.add().add();
                System.out.println(cou.getNum());
            }
        }
//        int [][]a = {{1,2},{2,3},{3,4}};
//        int[][] b= new int[3][4];
//        for(int i =0;i<b.length;i++){
//            for(int j = 0;j<b[i].length;j++){
//                b[i][j]=i+j;
//            }
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println(); // 每打印完一行后换行
//        }

