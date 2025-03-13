/*
Group members: Kai Xing Sze, Johny Nolasco, Sebastian Reyna
Course: Computer Programming 2/CSCI180
Professor: Dr.Li
Date: 3/13/25
Assignment nameHomework Assignment #2: Composition & Inheritance (*GROUP WORK*)
 */

public class Teacher extends Person {
    private String ID;
    private int monthly_salary;
    private int num_yr_prof;

    //No-arg
    public Teacher(){}

    //Fully Loaded constructor
    public Teacher(String name, int age, String ssn, boolean alive, String ID, int salary, int num_yr_prof){
        //super keyword 
        super(name, age, ssn, alive);
        this.ID = ID;
        this.monthly_salary = salary;
        this.num_yr_prof = num_yr_prof;
    }

    //Copy Constructor
    public Teacher(Teacher t) {
        super(t.getName(), t.getAge(), t.getSsn(), t.getAlive());
        
        if (!isValidState(t)) {
            System.out.println("Error: Teacher does not exist or is invalid!");
            System.exit(1);
        }
        this.ID = t.ID;
        this.monthly_salary = t.monthly_salary;
        this.num_yr_prof = t.num_yr_prof;
    }

    private boolean isValidState(Teacher other) {
        return (other != null) &&
            (other.ID != null && other.ID != "") &&
            (other.monthly_salary >= 0) &&
            (other.num_yr_prof >= 0);
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
        this.ID = id;
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
