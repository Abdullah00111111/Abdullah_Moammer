package HomeWorkSaven.Q9;

public class person {
    private String name;
    private int hisAge;
    
    person(){}
    
    person(String name, int hisAge){
        this.name = name;
        this.hisAge = hisAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHisAge() {
        return hisAge;
    }

    public void setHisAge(int hisAge) {
        this.hisAge = hisAge;
    }

    @Override
    public String toString() {
        return "name=" + name + ", hisAge=" + hisAge + '}';
    }
    
    
}
