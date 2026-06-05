

public class Staff extends Person{ //non academic employee

    private String department;

    private double salary;

    //var

    public Staff(int id, String name,String email, String department, double salary) {
        super(id, name, email);
        this.department = department;
        this.salary = salary;
    }


    

    public void work(){

            System.out.println(name+"did something about working!");



    }




}
