public class Student {

    private String fullName;

    public double gpa;

    public String department;

    //--------------------

    public Student() {
    }

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student( String fullName, double gpa,String department) {
        this.department = department;
        this.fullName = fullName;
        this.gpa = gpa;
    }




////-------------------


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }




/// 
 

public String fullNameValidator(String name){
    if (name.trim().isEmpty() )
        return "Name Valid";
    else
        return "Name Invalid";
}

public double gpaValidator(double gpa){
    if (gpa<=4){
        if (gpa>0){
            return gpa;
        }
         else {
            return -1;
        }  
    }  
     else {
    return -1;
    }


}





}

