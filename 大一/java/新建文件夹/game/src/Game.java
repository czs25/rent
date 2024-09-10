public class Game {
    Hero hero;
    Monster[] monsters;
    public void init(){
        hero = new Hero();
        hero.setName("tiga");
        hero.setHp(300);
        hero.setMaxAttackNum(50);
        hero.setMinAttackNum(20);

        monsters = new Monster[10];
        for(int i = 0; i < monsters.length; i++){
            monsters[i] = new Monster("monster" + i, 50, 5, 20  );
        }
    }

    public void run(){
        boolean flag = true;
        int i = 0;
        for(; i < monsters.length; i++){
            while(true) {
                hero.attack(monsters[i]);
                monsters[i].attack(hero);
                if (hero.getHp() <= 0) {
                    flag = false;
                    break;
                }
                if (monsters[i].getHp() <= 0) {
                    System.out.println(monsters[i].getName() + "挂掉了");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(flag == false){
                System.out.println("YOU LOSE");
                break;
            }
        }
        if(i >= 9){
            System.out.println("YOU WIN");
        }
    }
}
