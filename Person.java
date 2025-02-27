public class Person {
    private String name;
    private int age;
    private String ssn;
    private boolean alive;

    //No-arg constructor
    public Person(){}

    //Fully Loaded constructor
    public Person(String name, int age, String ssn, boolean alive){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.alive = alive;
    }

    //Copy Constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        this.ssn = p.ssn;
        this.alive = p.alive;
    }

    //get methods
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getSsn() {
        return this.ssn;
    }
    public boolean getAlive() {
        return  this.alive;
    }


    //set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //toString method
    public String toString() {
        String s = "";
        s += "Name: " + this.name + "\n";
        s += "Age: " + this.age + "\n";
        s += "SSN: " + this.ssn + "\n";
        s += "Vital Status: " + (this.alive ? "Alive" : "Deceased") + "\n";

        return s;
    }

}
