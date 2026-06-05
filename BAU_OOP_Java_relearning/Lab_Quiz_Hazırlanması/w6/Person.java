public class Person {
    protected int id;
protected String name;
protected String  email;

//var

    public Person( int id, String name, String email) {
        this.email = email;
        this.id = id;
        this.name = name;
    }

    


public String getInfo(){

   return ("ID: " + id + " Name: " + name + " E-Mail: " + email);


}

}
