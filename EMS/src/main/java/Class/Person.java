package Class;

public class Person {
    private String dep;
    private double salary;

    
    public Person(String dep, double salary){
        this.dep = dep;
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return "\nDepartment : " + getDep()
                + "\nSalary : " + getSalary();
    }
    
    
}
