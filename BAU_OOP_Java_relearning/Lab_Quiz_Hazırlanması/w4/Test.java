

public class Test {



    public static void main(String[] args) {
        Student stu1 = new Student("Ayse", 3.4, "Software");

        System.out.println(stu1.gpa);

        stu1.gpa = 3;

        Student stu2 = new Student("Fevzi");

        System.out.println(stu2.department);

        stu2.department = "Moftware";

        System.out.println(stu2.department);
        System.out.println(stu1.gpa);


    }
}
