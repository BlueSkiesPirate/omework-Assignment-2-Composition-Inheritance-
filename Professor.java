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

    public Professor(Professor other) {
        this.speciality = other.speciality;
        this.research_area = other.research_area;
        this.rank = other.rank;
        this.tenured = other.tenured;
    }

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

        s+= "Speciality: " + this.speciality + "\n";
        s+= "Rank: " + this.rank + "\n";
        s+= "Research Area: : " + this.research_area + "\n";
        s+= "Tenured: " + this.tenured + "\n";

        return s;
    }
}
