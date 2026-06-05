import java.util.ArrayList;

public class Course {

private String courseName;
private Faculty instructor;
private ArrayList<Student> studentsList;

//varib

    public Course(String courseName, Faculty instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        studentsList = new ArrayList<>();
    }

    //const


    public void addStudent (Student stu){

        studentsList.add(stu);


    }


    public String getCourseReport(){

        StringBuilder report = new StringBuilder();

        report.append("Course: ").append(courseName).append("\n");
        report.append("Instructor: ").append(instructor.getSupervisorName()).append("\n");
        report.append("Enrolled Students;  \n");

        
        for (Student stu :studentsList){

            report.append("Student Name: ").append(stu.getName()).append(" BMI: ").append(stu.getStatus()).append("\n");

        }

        return report.toString();

    }





}
