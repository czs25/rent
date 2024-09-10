package java.four.one;

public class Student extends People{
        private String adress;


        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }


    public Student show(){
        System.out.println("studen show");
        return new Student();
    }

}
