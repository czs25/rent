package pack3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.wash(new Tool() {
            @Override
            public void run() {

            }
        });
    }
}
