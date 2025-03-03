public class Department {
    private Professor chair;
    private Professor[] faculty;
    private int numFaculty;
    private Course[] courses;
    private int numCourses;


    //Fully loaded constructor
    public Department(Professor chair, Professor[] faculty, Course[] courses){
        this.chair = new Professor(chair);

        this.faculty = new Professor[faculty.length];
        this.courses = new Course[courses.length];

        for(int i =0; i< faculty.length ; i ++){
            this.faculty[i] = new Professor(faculty[i]);
        }

        for(int j=0 ; j< courses.length; j++){
            this.courses[j] = new Course(courses[j]);
        }

        this.numFaculty = this.faculty.length;
        this.numCourses = this.courses.length;

    }

    //Copy constructor

        public Department(Department d){
            if (!isValidState(d)) {
                System.out.println("Error: Department does not exist or is invalid!");
                System.exit(1);
            }
            this.chair = new Professor(d.chair);
    
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
        return (d != null) 
        && (d.chair != null) 
        && (d.faculty != null && d.faculty.length > 0) 
        && (d.courses != null && d.courses.length > 0);
    }

    //Setters

    public void setChair(Professor chair){
        this.chair = new Professor(chair);
    }

    public void setFaculty(Professor[] faculty){
        this.faculty = new Professor[faculty.length];
        for(int i = 0; i < faculty.length ; i++){
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
    public Professor getChair(){
        Professor tempChair = new Professor(this.chair);
        return tempChair;
    }

    public Professor[] getFaculty(){
        Professor[] tempFaculty = new Professor[this.faculty.length];
        for(int i =0; i< this.faculty.length ; i ++){
            tempFaculty[i] = new Professor(this.faculty[i]);
        }
        return tempFaculty;
    }

    public int getNumFaculty() {
        return numFaculty;
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
       output += "\n**********************************************************************\n";
       output += "The chair of this department is: \n" + this.chair.toString() + "\n";
       output += "The following is a list of courses under this department: \n";
       output += "---------------------------------------------------------\n";
       for(int i = 0; i< courses.length; i++){
        output += i+1 + " " + courses[i].toString() + "\n";
       } 
       output += "Total courses: " + numCourses;
       output += "\n---------------------------------------------------------\n";
       output += "\nThese are some of the professors in this department: \n";
       output += "----------------------------------------------------\n";
       for(int i = 0; i< this.faculty.length; i++){
        output += i+1 + " " + faculty[i].toString() + "\n";
       } 
       output += "Total faculty members: " + this.numFaculty;
       output += "\n----------------------------------------------------\n";
       output += "**********************************************************************\n";

       return output;
    }
}
