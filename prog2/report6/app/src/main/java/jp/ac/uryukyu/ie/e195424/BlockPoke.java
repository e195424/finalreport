package jp.ac.uryukyu.ie.e195424;
import java.util.Scanner;

public class BlockPoke{
    /**
    * 防御側
    * int Dlevel  //レベル
    * int defense //防御力
    * int HP      //ヒットポイント
    */
    private int Dlevel;
    private int defense;
    private int HP;

    /**
     * 変数のgetterとsetterを作成
     * @param Dlevel 防御側のレベル
     */
    public int getDlevel(){
        return this.Dlevel;
    }

    public void setDlevel(int Dlevel){
        this.Dlevel=Dlevel;
    }

    /**
     * @param defense 防御力
     */
    public int getDefense(){
        return this.defense;
    }

    public void setDefense(int defense){
        this.defense=defense;
    }

    /**
     * @param HP ヒットポイント
     */
    public int getHP(){
        return this.HP;
    }

    public void setHP(int HP){
        this.HP=HP;
    }
    /**
     * 防御側の変数を入力待ちにする
     * セッターに値を入れる
     */
    public void ddate(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("防御側:レベルを入力して下さい");
        int Dlevel = scan.nextInt();

        System.out.printf("防御側:HPを入力してください");
        int HP = scan.nextInt();

        System.out.printf("防御側:防御力を入力して下さい");
        int defense = scan.nextInt();

        setDlevel(Dlevel);
        setDefense(defense);
        setHP(HP);
        System.out.printf("防御側:レベル"+Dlevel+"HP"+HP+"防御力"+defense+"\r\n");
      
    }    
}