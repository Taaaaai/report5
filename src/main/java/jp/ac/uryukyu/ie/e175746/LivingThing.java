package jp.ac.uryukyu.ie.e175746;

public class LivingThing {
    private String name;
    int hitPoint;
    private int attack;
    private boolean dead;






    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }





    public boolean isDead() { return this.dead; }

    public void setDead(boolean dead) { this.dead = dead; }

    public int getHitPoint(){ return this.hitPoint; }

    public  void  setHitPoint(int hitPoint) { this.hitPoint = hitPoint; }

    public  String getName(){ return this.name; }

    public void setName(String name) { this.name = name; }

    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }




}
