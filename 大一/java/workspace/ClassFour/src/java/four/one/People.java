package java.four.one;

public class People {
    public String name;
    public String sex;
    public int age;

    public void setSex(String sex){
        this.name=name;
    }
    public String getSex(){
        return sex;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public People show(){
        System.out.println("身为一个"+getSex()+"的"+getName()+"今年"+getAge()+"岁了");
        return new People();
    }

}
