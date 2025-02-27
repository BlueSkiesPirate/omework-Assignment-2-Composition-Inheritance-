public class College_student extends Student {
    private String major;
    private String grade;

    // Fully loaded constructor
    public College_student(String name, int age, String ssn, boolean alive, String stu_id, double gpa, String major, String grade) {
        super(name, age, ssn, alive, stu_id, gpa);
        this.major = major;
        this.grade = grade;
    }

    // Copy constructor
    public College_student(College_student other) {
        super(other.getName(), other.getAge(), other.getSsn(), other.getAlive(), other.getStu_id(), other.getGpa());
        if (!isValidState(other)) {
            System.out.println("Error: College Student does not exist or is invalid!");
            System.exit(1);
        }
        this.major = other.major;
        this.grade = other.grade;
    }

    private boolean isValidState(College_student c) {
        return (c != null) &&
            (c.major != null && c.major != "") &&
            (c.grade != null && c.grade != "");
    }

    // Getters and setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // toString
    public String toString() {
        String rtnInfo = "";
        rtnInfo += super.toString();
        rtnInfo += "Collge student information: \n" +
            "Major: " + major + "\n" +
            "Grade: " + grade + "\n";

        return rtnInfo;
    }
}
