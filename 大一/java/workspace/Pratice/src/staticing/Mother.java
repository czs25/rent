package staticing;

public class Mother {
    public static void main(String[] args) {
        System.out.println(Student.getCount());
        System.out.println(Student.add(500,20));
        System.out.println(Student.c);

         new Student(20);
        System.out.println(Student.c);


        Student s1 = new Student();
        System.out.println(Student.c);



    }
}
