package computer;

import java.io.Serial;
import java.io.Serializable;

public class IntelCpu implements Cpu, Serializable {
    @Override
    public void run() {
        System.out.println("intel cpu is running");
    }
}
