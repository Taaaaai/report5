package jp.ac.uryukyu.ie.e175746;

public class Hero extends LivingThing{




    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }



    public void attack(LivingThing opponent) {
        int damege = (int) (Math.random() * getAttack());
        int kakusin = (int) (Math.random() * 10 + 1);
        if (!isDead()) {

            if (kakusin <= 4) {

                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damege *2);
                opponent.wounded(damege * 2);
            } else if (damege == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            } else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damege);
                opponent.wounded(damege);

            }

        }
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead(true);
            System.out.printf("%sは道半ばで力尽きてしまった。\n", getName());
        }
    }



}
