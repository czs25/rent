public class Student {
    static Student stu;
    private Student(){

    }
    public static Student getInstance(){
        if(stu != null){
            stu = new Student();
        }
        return stu;
    }
}
