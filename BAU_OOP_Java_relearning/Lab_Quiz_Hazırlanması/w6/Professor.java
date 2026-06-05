public class Professor extends Staff { 

    private String title;
private int publications;

//var

    public Professor(int id, String name, String email, String department, double salary, String title, int publications) {
         super(id, name, email, department, salary);
        this.title= title;
         this.publications=publications;
         
    }

//const


public void teach(){
    System.out.println(name+"teached.");

}

public String getInfo(){

     return ("ID: " + id + " Name: " + name + " E-Mail: " + email + "Title: "+ title + "Publications: "+ publications);


}
}
