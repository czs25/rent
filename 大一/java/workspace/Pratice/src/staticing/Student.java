package staticing;

public class Student {
    private  static final int count = 28;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getCount(){
        return count;
    }
    public static int c = 0;
    Student(){
        c = c + 15;
    }
    Student(int i){
        c = c + i;
    }

    static{
        System.out.println("超级喜欢阿颖");
        c++;
    }
    public static int add(int a,int b){
        int c = a + b ;
        return c;


    }
}