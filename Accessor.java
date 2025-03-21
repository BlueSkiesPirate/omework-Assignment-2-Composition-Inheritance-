/*
Group members: Kai Xing Sze, Johny Nolasco, Sebastian Reyna
Course: Computer Programming 2/CSCI180
Professor: Dr.Li
Date: 3/13/25
Assignment nameHomework Assignment #2: Composition & Inheritance (*GROUP WORK*)
 */

public class Accessor {
    public static void main(String[] args) {

    //------------------This is where we create the professor objects
        Professor p1 = new Professor(  
        "Donald", 
        75, 
        "123-45-6789", 
        true,  
        "4902004", 
        120000, 
        41,
        "Computer science",
        "AI",
        "1",
        true);

        Professor p2 = new Professor(
            "Jimmy", 
            30, 
            "111-11-1111", 
            true,  
            "658323", 
            75000, 
            2,
            "Math",
            "Riemman sums",
            "220",
            false
        );

        Professor p3 = new Professor(
        "Rick", 
        50, 
        "123-47-1111", 
        true,  
        "583022", 
        100000, 
        32,
        "Chemisrty",
        "Cellular decoding",
        "7",
        true
        );

        Professor p4 = new Professor(
            "Sarah", 
            45, 
            "222-22-2222", 
            true,  
            "987654", 
            95000, 
            20,
            "Physics",
            "Quantum Mechanics",
            "15",
            true
        );
    //----------------------This is where we create the student objects
        College_student s1 = new College_student(
            "Izzy" , 
            19, 
            "422-74-5829", 
            true, 
            "782945", 
            3.9, 
            "Computer Science", 
            "A");

        College_student s2 = new College_student(
            "Bobby" , 
            20, 
            "333-33-3333", 
            true, 
            "124829", 
            3.8, 
            "Computer Engineering", 
            "A-");

        College_student s3 = new College_student(
            "Mike" , 
            20, 
            "748-83-7247", 
            true, 
            "81983", 
            2.0, 
            "Physics", 
            "C");

        College_student s4 = new College_student(
            "Alex" , 
            21, 
            "425-86-8392", 
            true, 
            "839822", 
            3.5, 
            "Bioengineering", 
            "B+");

    //This is where we create the rosters and lists of faculty

        College_student[] roster1 = new College_student[2];
        College_student[] roster2 = new College_student[2];

        roster1[0] = s1;
        roster1[1] = s2;

        roster2[0] = s3;
        roster2[1] = s4;

        Professor[] facultyList1 = new Professor[2];
        Professor[] facultyList2 = new Professor[2];

        facultyList1[0] = p1;
        facultyList1[1] = p2;

        facultyList2[0] = p3;
        facultyList2[1] = p4;


        //This is where we create the courses

        Course c1 = new Course(p1, "Programming 1", roster2);
        Course c2 = new Course(p2, "Calculus", roster1);
        Course c3 = new Course(p3, "Chem 1", roster1);
        Course c4 = new Course(p4, "Physics 1", roster2);
        

        Course[] courseList1 = new Course[2];
        Course[] courseList2 = new Course[2];

        courseList1[0] = c1;
        courseList1[1] = c2;

        courseList2[0] = c3;
        courseList2[1] = c4;

        Department d1 = new Department(p1, facultyList2, courseList1);
        Department d2 = new Department(p2, facultyList1, courseList2);

        System.out.println(d1.toString());
        System.out.println(d2.toString());



        // Extra Credit

        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("\nWe will use the course name as an example:");
        System.out.println("c1 course name using course getter: " + c1.getCourseName());
        System.out.println("\nProfessor using course getter:");
        System.out.println(p1.getCourseCourse_name(c1));
        
        System.out.println("\nCollege student using course getter:");
        System.out.println(s1.getCourseCourse_name(c1));
    

        System.out.println("\nProfessor using course setter and result:");
        p1.setCourseCourse_name(c1, "Programming 2");
        System.out.println(p1.getCourseCourse_name(c1));

        System.out.println("\nCollege student using course setter and result:");
        s1.setCourseCourse_name(c1, "Anything 2");
        
        System.out.println();

        System.out.println("Same happens with departments.\n");

        System.out.println("////////////////////////////////////////////////////////////");
    }  
}
