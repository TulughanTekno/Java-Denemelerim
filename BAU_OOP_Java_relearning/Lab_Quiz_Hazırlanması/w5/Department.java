import java.util.ArrayList;

public class Department {
private String name;
private String officeLocation;
private ArrayList<Course> offeredCourse;

//var

    public Department(String name, String officeLocation) {
        this.name = name;
        this.officeLocation = officeLocation;
        offeredCourse = new ArrayList<>();
    }

    public void addCourse(Course newCourse) {
        offeredCourse.add(newCourse);
    }







}


