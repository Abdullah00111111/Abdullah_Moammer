package HomeWorkSaven.Q9;

public class student extends person{
    private String major;

    public student(String name, int Age, String major) {
        super(name, Age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" + "major=" + major + '}' + super.toString();
    }
}
