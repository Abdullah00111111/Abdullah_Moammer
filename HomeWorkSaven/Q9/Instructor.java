package HomeWorkSaven.Q9;

public class Instructor extends person{
    private int salary;
    
    Instructor(){}
    
    Instructor(String name, int Age, int salary){
        super(name, Age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" + "salary=" + salary + '}' + super.toString();
    }
    
    
}
