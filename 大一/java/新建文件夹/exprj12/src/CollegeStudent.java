public class CollegeStudent extends Student {

    public int age = 20;
    public void study(){
        System.out.println("子类中的Study");
        System.out.println(super.age);
    }
    public void studyByMyself(){

    }
}
