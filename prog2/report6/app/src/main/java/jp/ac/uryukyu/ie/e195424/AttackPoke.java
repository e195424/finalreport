package jp.ac.uryukyu.ie.e195424;
import java.util.Scanner;

public class AttackPoke{
    /**
    * 攻撃側
    * int Alevel //レベル
    * int power  //攻撃力
    * int work   //威力
    */
    private int Alevel;
    private int power;
    private int work;
    
    /**
     * 変数のgetterとsetterを作成
     * @param Alevel 攻撃側のレベル
     */
    public int getAlevel(){
        return this.Alevel;
    }

    public void setAlevel(int Alevel){
        this.Alevel=Alevel;
    }

    /**
     * @param power 攻撃力
     */
    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power=power;
    }

    /**
     * @param work 技の威力
     */
    public int getWork(){
        return this.work;
    }

    public void setWork(int work){
        this.work=work;
    }

    /**
     * 攻撃側の変数を入力待ちにする
     * セッターに値を入れる
     */
    public void adate(){
        Scanner scan = new Scanner(System.in);

        System.out.printf("攻撃側:レベルを入力して下さい");
        int Alevel = scan.nextInt();
        setAlevel(Alevel);

        System.out.printf("攻撃側:攻撃力を入力して下さい");
        int Apower = scan.nextInt();
        setPower(Apower);

        System.out.printf("攻撃側:技の威力を入力して下さい");
        int work = scan.nextInt();
        setWork(work);
    }
}