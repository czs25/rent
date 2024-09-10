public class Student {
    private String name;
    private String gender;

    public int age = 10;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void study(){
        System.out.println("父类中的study");
    }
}
