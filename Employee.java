/*编写一个Employee类，声明为抽象类，包含如下三个属性：name,id,salary
,提供必要的构造器和抽象方法：work（）
对于Manager类来说，它既是员工，还具有奖金（bonus）的属性
请使用继承性的思想，涉及CommonEmployee类和Manager类，要求类中必要的方法进行属性访问*/
package abstracttest;

public abstract class Employee {
    private String name;

    private int id;

    private double salary;

    public Employee(){
        super();
    }

    public Employee(String name,int id,double salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
}

