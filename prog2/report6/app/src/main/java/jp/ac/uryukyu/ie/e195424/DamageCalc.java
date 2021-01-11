package jp.ac.uryukyu.ie.e195424;

public class DamageCalc{
    double damage;
    double MIN; //低乱数
    double MAX; //高乱数
    int a,p,w,b;

    /**
     * テストで利用するコンストラクタ。レベル、攻撃力、技の威力、防御力を指定する。
     * @param a 攻撃側レベル
     * @param p 攻撃側攻撃力
     * @param w 技の威力
     * @param b 防御側の防御力
     */
    public DamageCalc(int a, int p, int w, int b){
        this.a=a;
        this.p=p;
        this.w=w;
        this.b=b;
    }
    /**
     * Mainで利用するコンストラクタ。レベル、攻撃力、技の威力、防御力を指定する。
     * @param a 攻撃側レベル
     * @param p 攻撃側攻撃力
     * @param w 技の威力
     * @param b 防御側の防御力
     */
    public DamageCalc(AttackPoke AP, BlockPoke BP){
        AP.adate();
        BP.ddate();
        a=AP.getAlevel();
        p=AP.getPower();
        w=AP.getWork();
        b=BP.getDefense();
    }
    /**
     * ダメージ計算を行うメソッド
     */
    public double Com(){
        damage=a*2/5+2;
        damage=Math.floor(damage)*w*p/b;
        damage=Math.floor(damage)/50+2;

        return damage;
    }
    
    /**
     * ダメージ幅の最小値
     */
    public int MinCalc(){
        double Damage;
        Damage=Com();
        //double Damage=50.0;

        MIN=Math.floor(Damage)*0.85;
        MIN=Math.floor(MIN);
        int min=(int)MIN;

        return min;
    }

    /**
     * ダメージ幅の最大値
     */
    public int MaxCalc(){
        double Damage;
        Damage=Com();
        //double Damage=50.0;

        MAX=Math.floor(Damage);
        int max=(int)MAX;

        return max;
        
    }
}
