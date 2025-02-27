public class Teacher extends Person {
    private String ID;
    private int monthly_salary;
    private int num_yr_prof;

    //No-arg
    public Teacher(){}

    //Fully Loaded constructor
    public Teacher(String name, int age, String ssn, boolean alive, String ID, int salary, int _yr_prof){
        //super keyword 
        super(name, age, ssn, alive);
        this.ID = ID;
        this.monthly_salary = salary;
        this.num_yr_prof = num_yr_prof;
    }

    //Copy Constructor
    public Teacher(Teacher t) {
        super(t.getName(), t.getAge(), t.getSsn(), t.getAlive());
        this.ID = t.ID;
        this.monthly_salary = t.monthly_salary;
        this.num_yr_prof = t.num_yr_prof;
    }

    //get methods
    public String getId() {
        return this.ID;
    }
    public int getMonthly_salary() {
        return this.monthly_salary;
    }
    public int getNum_yr_prof() {
        return this.num_yr_prof;
    }

    //set methods
    public void setId(String id) {
        this.ID = ID;
    }
    public void setMonthly_salary(int monthly_salary) {
        this.monthly_salary = monthly_salary;
    }
    public void setNum_yr_prof(int num_yr_prof) {
        this.num_yr_prof = num_yr_prof;
    }

    //toString method
    public String toString() {
        String s = "";
        s += "Teacher Information: " + "\n";
        //Super toString 
        s += super.toString();
        s += "Id: " + this.ID + "\n";
        s += "Salary: " + this.monthly_salary + "\n";
        s += "Years In Profession : " + this.num_yr_prof + "\n";
        return s;
    }

}
