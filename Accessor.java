public class Accessor {
 public static void main(String[] args) {


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
    Professor p3 = new Professor(
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

    College_student s1 = new College_student("Izzy" , 19, "422-74-5829", true, "782945", 3.9 );
    College_student s2 = new College_student("Bobby" , 20, "333-33-3333", true, "124829", 3.8 );
    College_student s3 = new College_student("Mike" , 20, "748-83-7247", true, "81983", 2.0 );
    College_student s4 = new College_student("Alex" , 21, "425-86-8392", true, "839822", 3.5 );

  

    College_student[] roster1 = new College_student[2];
    College_student[] roster2 = new College_student[2];

    roster1[0] = s1;
    roster1[1] = s2;

    roster2[0] = s3;
    roster2[1] = s4;

    Professor[] facultyList1 = new Professor[3];

    facultyList1[0] = p2;
    facultyList1[0] = p3;


    Course c1 = new Course(p2, "Chem 1", roster1);
    Course c2 = new Course(p1, "Programming 1", roster2);

    Course[] CourseList = new Course[3];

    CourseList[0] = c1;
    CourseList[1] = c2;
    

    Department d1 = new Department();
    Department d2 = new Department("Quandale Dingle", facultyList1, CourseList );

 }  
}

// Extra credit: (10 points)

// To protect the data integrity, you should make it so the instances of professor can
//  use both the set and get methods of department and course, but the instances of student 
//  can only use the get methods of department and course.