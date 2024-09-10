import java.util.Scanner;

//创建一个学生类
public class Student {
    String name;
    private int age;
    boolean male;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }

    public void setage(int num){
        if(num>=0 && num<=100)
            age=num;
        else
            System.out.println("输入不合理");

    }
    public int getage(){
        return this.age;
    }

    public void setmale(boolean sex){
        male=sex;
    }
    public boolean isMale(){
        return male;
    }
    public void show(){
         System.out.println("我叫:"+name+",年龄:"+age);
    }


//构造方法
     public Student(){
        System.out.println("无参构造方法");
         System.out.println("我叫:"+name+",年龄:"+age);
     }
     public Student(int age){
        this();
        System.out.println("单参构造方法");
         System.out.println("我叫:"+name+",年龄:"+age);
     }
    public Student(String name,int age){
        this(age);
        System.out.println("双参构造方法");
        this.name=name;
        this.age=age;
        System.out.println("我叫:"+name+",年龄:"+age);

    }


//类




}





