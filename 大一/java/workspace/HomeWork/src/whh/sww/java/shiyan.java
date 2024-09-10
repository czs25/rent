package whh.sww.java;

public class shiyan {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer("Dell", "黑色", 3800.0);
        computers[1] = new Computer("Lenovo", "黑色", 4800.0);
        computers[2] = new Computer("Apple", "白色", 8800.0);
        computers[3] = new Computer("Lenovo", "灰色", 5800.0);
        computers[4] = new Computer("Dell", "白色", 2800.0);
    }
    System.out.println(computers[2].brand);
}
