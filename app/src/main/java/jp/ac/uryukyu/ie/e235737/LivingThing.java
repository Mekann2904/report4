package jp.ac.uryukyu.ie.e235737;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    protected boolean dead;

    // コンストラクタ
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.setHitPoint(hitPoint);
        this.attack = attack;
        this.dead = false; // 初期値として false を設定
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    //ゲッター、セッター
    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint(){
        return hitPoint;
    }
    public void setHitpoint(int hitPoint){
        this.setHitPoint(hitPoint);
    }


    public void attack(LivingThing opponent) {
        if (!dead) {
            // 攻撃対象にダメージを与える処理
            int damage = this.attack;
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた。\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
