public class Style{
    String name;
    public int age;
    public char sex;
    public void study(){
        System.out.println(age+"岁的"+name+"爱学习");
    }
    private int no;
    public void setno(int no){
        this.no=no;
    }
    public int getno(){
        return this.no;
    }
    public Style(){
        System.out.println("Style的无参构造方法");
    }
    public Style(int no){
        this();
        System.out.println("Style的单参构造方法");
    }
    public Style(int no,String name){
        this(no);
        this.no=no;
        this.name=name;
        System.out.println("Style的双参构造方法");
        
    }
}


