package abstructly;

    public class Son extends Father {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public Son(){}

    public Son(int age, String name, int num) {
        this.num=num;
        super.setName(name);
        super.setAge(num);
        System.out.println(name+age);
    }


    public void show(){
        System.out.println("son");
    }


}