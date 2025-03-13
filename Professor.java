/*
Group members: Kai Xing Sze, Johny Nolasco, Sebastian Reyna
Course: Computer Programming 2/CSCI180
Professor: Dr.Li
Date: 3/13/25
Assignment nameHomework Assignment #2: Composition & Inheritance (*GROUP WORK*)
 */

public class Professor extends Teacher {
    private String speciality;
    private String research_area;
    private String rank;
    private boolean tenured;

    //no-arg
    public Professor(){}

    //fully loaded constructor
    public Professor(
            String name,
            int age,
            String ssn,
            boolean alive,
            String ID,
            int salary,
            int num_yr_prof,
            String speciality,
            String research_area,
            String rank,
            boolean tenured
    )
    {
        super(name, age, ssn, alive, ID, salary, num_yr_prof);
        this.speciality = speciality;
        this.research_area = research_area;
        this.rank = rank;
        this.tenured = tenured;
    }

    public Professor(Professor p) {
        super(p.getName(),p.getAge(),p.getSsn(), p.getAlive(),p.getId(), p.getMonthly_salary(),p.getNum_yr_prof());
        this.speciality = p.speciality;
        this.research_area = p.research_area;
        this.rank = p.rank;
        this.tenured = p.tenured;
    }

    // Controlled Access Accessors for Department ------------------------------
    public Professor getDeptChair(Department dept) {
        return AccessManagementTool.getDeptChair(this, dept);
    }

    public Professor[] getDeptFaculty(Department dept) {
        return AccessManagementTool.getDeptFaculty(this, dept);
    }

    public Course[] getDeptCourses(Department dept) {
        return AccessManagementTool.getDeptCourses(this, dept);
    }

    // Constrolled Access Mutators for Department
    public void setDeptChair(Department dept, Professor chair) {
        AccessManagementTool.setDeptChair(this, dept, chair);
    }

    public void setDeptFaculty(Department dept, Professor[] faculty) {
        AccessManagementTool.setDeptFaculty(this, dept, faculty);
    }

    public void setDeptCourses(Department dept, Course[] courses) {
        AccessManagementTool.setDeptCourses(this, dept, courses);
    }

    // Controlled Access Accessors for Course ------------------------------
    public Professor getCourseInstructor(Course course) {
        return AccessManagementTool.getCourseInstructor(this, course);
    }

    public String getCourseCourse_name(Course course) {
        return AccessManagementTool.getCourseCourse_name(this, course);
    }

    public College_student[] getCourseStudents(Course course) {
        return AccessManagementTool.getCourseStudents(this, course);
    }

    // Constrolled Access Mutators for Course ------------------------------
    public void setCourseInstructor(Course course, Professor instructor) {
        AccessManagementTool.setCourseInstructor(this, course, instructor);
    }

    public void setCourseCourse_name(Course course, String name) {
        AccessManagementTool.setCourseCourse_name(this, course, name);
    }

    public void setCourseStudents(Course course, College_student[] students) {
        AccessManagementTool.setCourseStudents(this, course, students);
    }

    // Accessors and Mutators ------------------------------
    public String getSpeciality() {
        return speciality;
    }

    public String getResearch_area() {
        return research_area;
    }

    public String getRank() {
        return rank;
    }

    public boolean isTenured() {
        return tenured;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setResearch_area(String research_area) {
        this.research_area = research_area;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }

    public String toString() {
        String s = "";
        s+= "Name: " + this.getName() + "\n";
        s+= "Speciality: " + this.speciality + "\n";
        s+= "Rank: " + this.rank + "\n";
        s+= "Research Area: " + this.research_area + "\n";
        s+= "Tenured: " + this.tenured + "\n";

        return s;
    }
}
