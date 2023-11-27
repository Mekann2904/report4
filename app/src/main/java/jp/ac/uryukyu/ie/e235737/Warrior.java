package jp.ac.uryukyu.ie.e235737;

// Warriorクラスの実装
public class Warrior extends Hero {
    // Warriorクラスのコンストラクタ
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    // 新しいメソッドの実装
    public void attackWithWeaponSkill(LivingThing opponent) {
        if (!isDead()) {
            int damage = (int) (getAttack() * 1.5); // 攻撃の150%
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
