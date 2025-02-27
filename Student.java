public class Student extends Person{
    private String stu_id;
    private double gpa;

    //Fully Loaded constructor
    public Student(String name, int age, String ssn, boolean alive, String stu_id, double gpa){
        //super keyword 
        super(name, age, ssn, alive);

        this.stu_id = stu_id;
        this.gpa = gpa;

    }
    //Copy Constructor
    public Student(Student s) {
        super(s.getName(), s.getAge(), s.getSsn(), s.getAlive());
        this.stu_id = s.stu_id;
        this.gpa = s.gpa;
    }

    //get methods
    public String getStu_id() {
        return this.stu_id;
    }
    public double getGpa() {
        return this.gpa;
    }

    //set methods
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        String s = "";
        s += "Student Information: " + "\n";
        //Super toString
        s += super.toString();
        s += "Id: " + this.stu_id + "\n";
        s += "GPA : " + this.gpa + "\n";
        return s;
    }
}
