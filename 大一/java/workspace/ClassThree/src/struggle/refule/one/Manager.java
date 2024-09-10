package struggle.refule.one;

public class Manager extends Employee{
    private int baseSalary;
    private int bonus;
    public Manager(String name, int baseSalary, int bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "，职位:经理";
    }
}
