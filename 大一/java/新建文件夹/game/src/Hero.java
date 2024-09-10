import java.util.Random;

public class Hero {
    private String name;
    private int hp;
    private int minAttackNum;
    private int maxAttackNum;
    public Hero(){}
    public Hero(String name){
        this.name = name;
    }
    public Hero(String name, int hp, int minAttackNum, int maxAttackNum){
//        this(name);
        this.name = name;
        this.hp = hp;
        this.minAttackNum = minAttackNum;
        this.maxAttackNum = maxAttackNum;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public void setMaxAttackNum(int maxAttackNum){
        this.maxAttackNum = maxAttackNum;
    }
    public int getMaxAttackNum(){
        return this.maxAttackNum;
    }
    public void setMinAttackNum(int minAttackNum){
        this.minAttackNum = minAttackNum;
    }
    public int getMinAttackNum(){
        return this.minAttackNum;
    }
    public void attack(Monster monster){
        Random random = new Random();
        int count =random.nextInt(maxAttackNum - minAttackNum) + minAttackNum;
        monster.setHp(monster.getHp() - count);
        System.out.println("英雄" + this.getName() + "攻击 " + monster.getName() + ",掉血" + count);
    }

    public void attack(Monster[] monsters) {
        for(Monster monster : monsters){
            attack(monster);
        }
    }
}
