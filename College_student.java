/*
Group members: Kai Xing Sze, Johny Nolasco, Sebastian Reyna
Course: Computer Programming 2/CSCI180
Professor: Dr.Li
Date: 3/13/25
Assignment nameHomework Assignment #2: Composition & Inheritance (*GROUP WORK*)
 */

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

    // Getters and setters ------------------------------
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
