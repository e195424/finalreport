package jp.ac.uryukyu.ie.e195424;
import java.util.Scanner;

public class AttackPoke{
    private int Alevel;
    private int power;
    private int work;
    
    public int getAlevel(){
        return this.Alevel;
    }

    public void setAlevel(int Alevel){
        this.Alevel=Alevel;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power=power;
    }

    public int getWork(){
        return this.work;
    }

    public void setWork(int work){
        this.work=work;
    }

    public void adate(){
        Scanner scan = new Scanner(System.in);

        System.out.printf("攻撃側:レベルを入力して下さい");
        int Alevel = scan.nextInt();

        System.out.printf("攻撃側:攻撃力を入力して下さい");
        int Apower = scan.nextInt();

        System.out.printf("攻撃側:技の威力を入力して下さい");
        int work = scan.nextInt();

        setAlevel(Alevel);
        setPower(Apower);
        setWork(work);

        System.out.printf("攻撃側:レベル"+Alevel+"攻撃力"+Apower+"技の威力"+work+"\r\n");
        
    }
}