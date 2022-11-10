package Class;

import java.util.Objects;

public class employee extends Person{
    private String fName, lName, phoneNumber;
    private int age, joinDate, ID;
    private static String job = "Delegate";
    public employee(){}
    
    public employee(String txt[], int number[]){
        super("ALriad", 5000);
        fName = txt[0];
        lName = txt[1];
        phoneNumber = txt[2];
        age = number[0];
        joinDate = number[1];
        ID = number[2];
    }

    @Override
    public String toString(){
        return "Name : " + getfName() + " " + getlName()
                + "\njob : " + getJob()
                + "\nID : " + getID()
                + "\nDepartment : " + super.getDep()
                + "\nSalary : " + super.getSalary()
                + "\nAge : " + getAge()
                + "\nPhone Number : " + getPhoneNumber()
                + "\nJoine Date : " + getJoinDate();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee emp = (employee) o;
        return ID == emp.ID && age == emp.age && joinDate == emp.joinDate && Objects.equals(this.fName, emp.fName) && Objects.equals(this.lName, emp.lName);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.fName);
        hash = 19 * hash + Objects.hashCode(this.lName);
        hash = 19 * hash + Objects.hashCode(this.phoneNumber);
        hash = 19 * hash + this.age;
        hash = 19 * hash + this.joinDate;
        hash = 19 * hash + this.ID;
        return hash;
    }

    public static String getJob() {
        return job;
    }
    
        public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
