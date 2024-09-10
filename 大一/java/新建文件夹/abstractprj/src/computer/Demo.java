package computer;

public class Demo {
    public static void main(String[] args) {
        IntelCpu intelCpu = new IntelCpu();
        Computer pc = new Computer();

        AmdCpu amdCpu = new AmdCpu();

        pc.setCpu(amdCpu);
        pc.play();
    }
}
