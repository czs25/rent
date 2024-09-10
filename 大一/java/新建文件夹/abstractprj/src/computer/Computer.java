package computer;

public class Computer {
    private Cpu cpu;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void play(){
        cpu.run();
    }

}
