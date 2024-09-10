package com.ext;

public class Sub extends Base {
    public String name;
    public Sub(String name){
        this();
        super.name = "lisi";
        this.name = "zs";

    }
    public Sub(){
        super("zs");
        System.out.println("sub 构造方法");
    }
}
