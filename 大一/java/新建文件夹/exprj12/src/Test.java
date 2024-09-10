public class Test {
    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        Teacher t2 = t1;
//        int n1 = 2, n2 = 2;
//        System.out.println(n1 == n2);
//        System.out.println(t1 == t2);
//        System.out.println(t1.equals(t2));
//        Object obj = new Object();



        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.setName("zhangsan");
        System.out.println(collegeStudent.getName());
        collegeStudent.study();
        System.out.println(collegeStudent.age);
//        String s1 = "abc";
//        for(int i = 0; i < 99999999; i++) {
//            s1 += "defddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddgggggggggggggggggggggggggggggggggg";
//        }
    }
}
