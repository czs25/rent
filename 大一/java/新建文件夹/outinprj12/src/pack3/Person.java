package pack3;

public class Person {

    public void wash(Tool tool){
        tool.run();
    }

    public void wash(){
        Tool tool = new Machine();
        tool.run();

        Tool tool1 = new Tool(){
            public void run(){

            }
        };
        tool1.run();

    }
}
