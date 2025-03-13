public final class AccessManagementTool {
    

    // Controlled Access Mutators for Department

    public static void setDeptChair(Person person, Department dept, Professor chair) {
        if (person instanceof Professor) {
            if (person instanceof Professor) {
                dept.setChair(chair);
            } else {
                System.out.println("Access denied: Only professors can modify department details.");
            }
        } 
    }

    public static void setDeptFaculty(Person person, Department dept, Professor[] faculty) {
        if (person instanceof Professor) {
            if (person instanceof Professor) {
                dept.setFaculty(faculty);
            } else {
                System.out.println("Access denied: Only professors can modify department details.");
            }
        }
    }

    public static void setDeptCourses(Person person, Department dept, Course[] courses) {
        if (person instanceof Professor) {
            if (person instanceof Professor) {
                dept.setCourses(courses);
            } else {
                System.out.println("Access denied: Only professors can modify department details.");
            }
        } 
    }

    // Controlled Access Accessors for Department

    public static Professor getDeptChair(Person person, Department dept) {
        if (person instanceof Professor || person instanceof College_student) {
            return dept.getChair();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    }

    public static Professor[] getDeptFaculty(Person person, Department dept) {
        if (person instanceof Professor || person instanceof College_student) {
            return dept.getFaculty();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    } 

    public static Course[] getDeptCourses(Person person, Department dept) {
        if (person instanceof Professor || person instanceof College_student) {
            return dept.getCourses();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    }


    // ------------------------------------------------------------------------------------------


    // Controlled Access Mutators for Course.

    public static void setCourseInstructor(Person person, Course course, Professor instructor) {
        if (person instanceof Professor) {
            course.setInstructor(instructor);
        } else {
            System.out.println("Access denied: Only professors can modify course details.");
        }
    }

    public static void setCourseCourse_name(Person person, Course course, String name) {
        if (person instanceof Professor) {
            course.setCourseName(name);
        } else {
            System.out.println("Access denied: Only professors can modify course details.");
        }
    }

    public static void setCourseStudents(Person person, Course course, College_student[] students) {
        if (person instanceof Professor) {
            course.setStudents(students);
        } else {
            System.out.println("Access denied: Only professors can modify course details.");
        }
    }


    // Controlled Access Accessors for Course.
    
    public static Professor getCourseInstructor(Person person, Course course) {
        if (person instanceof Professor || person instanceof College_student) {
            return course.getInstructor();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    }

    public static String getCourseCourse_name(Person person, Course course) {
        if (person instanceof Professor || person instanceof College_student) {
            return course.getCourseName();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    }

    public static College_student[] getCourseStudents(Person person, Course course) {
        if (person instanceof Professor || person instanceof College_student) {
            return course.getStudents();
        } else {
            System.out.println("Access denied: Unrecognized person.");
            return null;
        }
    }

}
