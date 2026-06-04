public class dog {

    private String name;
    private  String colour;
    private  String eyeColour;
    private int height;
    public int length;

    public dog() {
    }

    public dog(String name,String colour, String eyeColour, int height, int length) {
        this.colour = colour;
        this.eyeColour = eyeColour;
        this.height = height;
        this.length = length;
        this.name = name;
    }



    //----------- getter setter

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    

 /////-------------------
  
 public void comeHere(){}




}
