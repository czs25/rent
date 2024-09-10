package com.ext;

public class Test {
    /**
     * final 加在类前，代表本类不可以被继承
     * fianl 加在变量前，常量，代表值不可以被修改
     * final 加在方法前，代表该方法不能被重写
     * @param args
     */
    public static void main(String[] args) {
//        Person p = new Person();
//        p.show();

        Person p1 = new Teacher();
        p1.show();

        p1 = new Student();
        p1.show();
    }
}
