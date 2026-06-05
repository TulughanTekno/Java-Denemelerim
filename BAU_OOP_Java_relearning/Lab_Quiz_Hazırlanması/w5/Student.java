public class Student {

  private String  name;
  private String  departmentName;

   private int age;

private double weight;
private double height;
private double gpa; 

//varible
    public Student(String name, int age, double weight, double height) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.weight = weight;
    }

public Student(String name, int age, double weight, double height, double gpa , String departmantName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.weight = weight;
        this.gpa=gpa;
        this.departmentName=departmantName;
    }

    //const


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

//getset


    public double  getBMI(){
        return (weight/(height*height));
    }

    public String getStatus(){
        double BMI = getBMI();
        if (BMI<=18.5){ return  "Underweight" ;}
        else if (BMI<=24.9) return "Normal";
        else if (BMI<=39.9) return "Overweight";
        else return "Obese";
    }



    public boolean isHonorStudent(){
        if (gpa>=3.5) return true;
        else return false;
    }




}
