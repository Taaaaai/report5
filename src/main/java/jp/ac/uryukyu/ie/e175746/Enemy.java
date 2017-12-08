package jp.ac.uryukyu.ie.e175746;

public class Enemy extends LivingThing {





    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);

    }
    public void attack(LivingThing opponent) {
        int damege = (int) (Math.random() * getAttack());
        int kakusin = (int) (Math.random() * 10 + 1);
        if (!isDead()) {

            if (kakusin <= 3) {

                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damege *2);
                opponent.wounded(damege * 2);
            } else if (damege == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！", getName(), opponent.getName());
            } else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damege);
                opponent.wounded(damege);

            }

        }
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        super.wounded(damage);


    }




}
