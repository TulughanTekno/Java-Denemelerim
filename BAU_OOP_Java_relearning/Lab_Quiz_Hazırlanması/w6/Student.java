public class Student extends Person {

    private String studentNo;
    private double gpa;

    //var

    public Student(int id, String name, String email, String studentNo, double gpa) {

        super(id, name, email);
        this.gpa = gpa;
        this.studentNo = studentNo;
    }




    public void study(){

        System.out.println(name+" studied.");



    }
@Override
    public String getInfo(){


          return ("ID: " + id + " Name: " + name + " E-Mail: " + email + "Student Number: "+ studentNo + "GPA: "+ gpa);
        
    }

}
