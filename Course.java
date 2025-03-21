/*
Group members: Kai Xing Sze, Johny Nolasco, Sebastian Reyna
Course: Computer Programming 2/CSCI180
Professor: Dr.Li
Date: 3/13/25
Assignment nameHomework Assignment #2: Composition & Inheritance (*GROUP WORK*)
 */

public class Course {
    private Professor instructor;
    private String course_name;
    private College_student[] students;
    private int numStudents;

    // Fully loaded constructor
    public Course(Professor instructor, String course_name, College_student[] students) {
        this.instructor = new Professor(instructor);
        this.course_name = course_name;
        this.students = new College_student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
        this.numStudents = this.students.length;
    }

    // Copy Constructor
    public Course(Course other) {
        if (!isValidState(other)) {
            System.out.println("Error: Course does not exist or is invalid!");
            System.exit(1);
        }
        this.instructor = new Professor(other.instructor);
        this.course_name = other.course_name;
        this.students = new College_student[other.students.length];
        for (int i = 0; i < other.students.length; i++) {
            this.students[i] = other.students[i];
        }
        this.numStudents = this.students.length;
    }

    private boolean isValidState(Course c) {
        return (c != null) 
        && (c.instructor != null) 
        && (c.course_name != null) 
        && (c.students != null && c.students.length > 0);
    }

    // Getters and Setters
    public Professor getInstructor() {
        Professor tempInstructor = new Professor(instructor);
        return tempInstructor;
    }

    public void setInstructor(Professor instructor) {
        instructor = new Professor(instructor);
    }


    public String getCourseName() {
        return course_name;
    }

    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }


    public College_student[] getStudents() {
        College_student[] studList = new College_student[this.students.length];
        for (int i = 0; i < this.students.length; i++) {
            studList[i] = this.students[i];
        }
        return studList;
    }

    public void setStudents(College_student[] students) {
        this.students = new College_student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
    }

    // toString method
    public String toString() {
        String courseInfo = "Course Details: " +  
        "\nInstructor: " + instructor.getName() +  "\nCourse Name: " + this.course_name;
        
        courseInfo += "\n\nStudent Roster: ";
        courseInfo += "\n----------------\n";
        for (Student student : students) {
            courseInfo +=  student.toString() + "\n";
        }
        courseInfo += "Total Students: " + this.numStudents;
        courseInfo += "\n----------------\n";

        return courseInfo;
    }
}
