import jp.ac.uryukyu.ie.e195424.*;

public class Main {
    public static void main(String[] args){
        AttackPoke AP = new AttackPoke();
        BlockPoke BP= new BlockPoke();
        DamageCalc DC = new DamageCalc(AP,BP);

        System.out.printf("MAX:"+DC.MaxCalc()+"\r\nMIN:"+DC.MinCalc());
    }
}
