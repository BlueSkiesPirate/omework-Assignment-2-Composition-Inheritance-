public class Department {
    private String chair;
    private Professor[] faculty;
    private Course[] courses;


    //Fully loaded constructor
    public Department(String c, Professor[] faculty, Course[] courses){
        this.chair = c;

        this.faculty = new Professor[faculty.length];
        this.courses = new Course[courses.length];

        for(int i =0; i< faculty.length ; i ++){
            this.faculty[i] = new Professor(faculty[i]);
        }

        for(int j=0 ; j< courses.length; j++){
            this.courses[j] = new Course(courses[j]);
        }

    }

    //Copy constructor

        public Department(Department d){
            if (!isValidState(d)) {
                System.out.println("Error: Department does not exist or is invalid!");
                System.exit(1);
            }
            this.chair = d.chair;
    
            this.faculty = new Professor[d.faculty.length];
            this.courses = new Course[d.courses.length];
    
            for(int i =0; i< d.faculty.length ; i ++){
                this.faculty[i] = new Professor(faculty[i]);
            }
    
            for(int j=0 ; j< d.courses.length; j++){
                this.courses[j] = new Course(d.courses[j]);
            }
    
    }

    private boolean isValidState(Department d) {
        return (d != null) &&
            (d.chair != null && d.chair != "") &&
            (d.faculty != null && d.faculty.length > 0) &&
            (d.courses != null && d.courses.length > 0);
    }

    //Setters

    public void setChair(String chair){
        this.chair = chair;
    }

    public void setFaculty(Professor[] faculty){
        this.faculty = new Professor[faculty.length];
        for(int i =0; i< faculty.length ; i ++){
            this.faculty[i] = new Professor(faculty[i]);
        }
    }

    public void setCourses(Course[] courses){
        this.courses = new Course[courses.length];
        for(int j=0 ; j< courses.length; j++){
            this.courses[j] = new Course(courses[j]);
        }
    }

    //Getters
    public String getChair(){
        return this.chair;
    }

    public Professor[] getFaculty(){
        Professor[] tempFaculty = new Professor[this.faculty.length];
        for(int i =0; i< this.faculty.length ; i ++){
            tempFaculty[i] = new Professor(this.faculty[i]);
        }
        return tempFaculty;
    }

    public Course[] getCourses(){
        Course[] tempCourses = new Course[this.courses.length];
        for(int i = 0; i < this.courses.length; i++){
            tempCourses[i] = new Course(this.courses[i]);
        }
        return tempCourses;
    }


    //toString

    public String toString(){

       String output = "";
       output += super.toString();
       output += "The chair of this department is: " + this.chair + "\n";
       output += "The following is a list of courses under this deprtment";
       for(int i = 0; i< this.courses.length; i++){
        output += i + " " + courses[i].toString() + "\n";
       } 
       output += "These are some of the professors in this department";
       for(int i = 0; i< this.faculty.length; i++){
        output += i + " " + faculty[i].toString() + "\n";
       } 

       return output;
    }
}
