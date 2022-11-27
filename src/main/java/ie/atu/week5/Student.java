package ie.atu.week5;

public class Student {
    private String name;
    private String eMail;
    private String myCourse;

    // Default constructor
    public Student() {
        // Empty strings
        name = "";
        eMail = "";
        myCourse = "";
    }

    // Constructor for the second student
    public Student(String name) {
        this.name = name;
        eMail = "";
        myCourse = "";
    }

    // Generate the getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMyCourse() {
        return myCourse;
    }

    public void setMyCourse(String myCourse) {
        this.myCourse = myCourse;
    }
}
