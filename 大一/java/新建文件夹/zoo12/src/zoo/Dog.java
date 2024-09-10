package zoo;

public class Dog extends Animal implements LandAnimal {
    @Override
    public void eat() {
        System.out.println("小狗吃饭");
    }

    public void eat(String food){
        System.out.println("小狗吃" + food);
    }
}
