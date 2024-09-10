package struggle.refule.one;

public abstract class Employee {
    public abstract int calculateSalary();

    private String name;
    public Employee(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "姓名:"+name;
    }

    public int compareTo(Employee employee) {
        if (this.calculateSalary() > employee.calculateSalary()) {
            return 1;
        } else if (this.calculateSalary() < employee.calculateSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
