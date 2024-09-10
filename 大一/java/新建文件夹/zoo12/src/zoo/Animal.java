package zoo;

public abstract class Animal {
    private String name;
    private String color;
    private String gender;
    public Animal(){

    }

    public Animal(String name, String color, String gender){
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void eat();

}
