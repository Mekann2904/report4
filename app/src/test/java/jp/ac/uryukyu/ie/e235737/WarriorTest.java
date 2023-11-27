package jp.ac.uryukyu.ie.e235737;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    public void testAttackWithWeaponSkill() {
        // Warriorクラスからオブジェクトを生成
        Warrior warrior = new Warrior("勇者", 100, 20);

        // attackWithWeaponSkillを3回実行し、ダメージが正しく計算されていることを確認
        for (int i = 0; i < 3; i++) {
            // 敵のオブジェクトを作成（仮の値）
            LivingThing enemy = new Enemy("モンスター", 50, 10);

            // ウェポンスキルのダメージを計算
            int expectedDamage = (int) (warrior.getAttack() * 1.5);

            // attackWithWeaponSkillを実行
            warrior.attackWithWeaponSkill(enemy);

            // 正しいダメージが与えられていることを確認
            assertEquals(50 - expectedDamage, enemy.getHitPoint());
        }
    }
}