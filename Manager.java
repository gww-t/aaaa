package abstracttest;

public class Manager extends Employee {
    private double bonus;

    public Manager(double bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行效率");
    }

    public double getBonus() {
        return bonus;
    }
}
class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("员工在一线车间生产产品");
    }
}