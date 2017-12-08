package jp.ac.uryukyu.ie.e175746;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 20, 5);
        Enemy enemy = new Enemy("スライム", 10, 2);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( !hero.isDead()  && !enemy.isDead()  ){
            turn++;
            System.out.printf("\n%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
            System.out.println("\nモンスターのhpは" + enemy.hitPoint);
            System.out.println("\n勇者のhpは" + hero.hitPoint);
        }
        System.out.println("戦闘終了");
    }
}
