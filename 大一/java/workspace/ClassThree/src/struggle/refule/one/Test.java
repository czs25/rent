package struggle.refule.one;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张三",5000,2000);
        Developer developer = new Developer("李四",50,160);
        Scanner scanner = new Scanner(System.in);
        String a = manager.toString();
        String b = developer.toString();

        System.out.println(a);
        System.out.println(b);
        System.out.print(manager);
        System.out.println("，工资:" + manager.calculateSalary());

        System.out.print(developer);
        System.out.println("，工资:" + developer.calculateSalary());

        Manager manager1 = new Manager("喵喵", 5000,2000);
        manager1.setBonus(2000);
        Manager manager2 = new Manager("汪汪", 6000,2000);
        manager2.setBonus(3000);
        Developer developer1 = new Developer("哈哈", 22, 180);
        Developer developer2 = new Developer("嘻嘻", 33, 140);

        Employee[] employees = {manager1, manager2, developer1, developer2};
        Employee maxEmployeeSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].compareTo(maxEmployeeSalary) > 0) {
                maxEmployeeSalary= employees[i];
            }
        }

        System.out.println("工资最多的员工是:" + maxEmployeeSalary);
        System.out.println("工资:" + maxEmployeeSalary.calculateSalary());
    }

}
