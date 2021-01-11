package jp.ac.uryukyu.ie.e195424;

public class DamageCalc{
    double damage;
    double MIN; //低乱数
    double MAX; //高乱数
    int a,p,w,b;

    public DamageCalc(AttackPoke AP, BlockPoke BP){
        AP.adate();
        BP.ddate();
        a=AP.getAlevel();
        p=AP.getPower();
        w=AP.getWork();
        b=BP.getDefense();
    }

    public double Com(){
        damage=a*2/5+2;
        damage=Math.floor(damage)*w*p/b;
        damage=Math.floor(damage)/50+2;

        return damage;
    }
    public int MinCalc(){
        double Damage;
        Damage=Com();
        //double Damage=50.0;

        MIN=Math.floor(Damage)*0.85;
        MIN=Math.floor(MIN);
        int min=(int)MIN;

        return min;
    }
    public int MaxCalc(){
        double Damage;
        Damage=Com();
        //double Damage=50.0;

        MAX=Math.floor(Damage);
        int max=(int)MAX;

        return max;
        
    }
}
