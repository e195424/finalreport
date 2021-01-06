package jp.ac.uryukyu.ie.e195424;

import java.util.Scanner;
class AttackPoke{
    private int Alevel;
    private int power;
    private int work;
    private String Aname;
    
    public int getAlevel(){
        return Alevel;
    }

    public void setAlevel(int Alevel){
        this.Alevel=Alevel;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power=power;
    }

    public int getWork(){
        return work;
    }

    public void setWork(int work){
        this.work=work;
    }

    public String getAName(){
        return Aname;
    }

    public void setAname(String Aname){
        this.Aname=Aname;
    }
}
class BlockPoke{
    private int Dlevel;
    private int defense;
    private int HP;
    private String Dname;

    public int getDlevel(){
        return Dlevel;
    }

    public void setDlevel(int Dlevel){
        this.Dlevel=Dlevel;
    }

    public int getDefense(){
        return defense;
    }

    public void setDefense(int defense){
        this.defense=defense;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int HP){
        this.HP=HP;
    }

    public String getDName(){
        return Dname;
    }

    public void setDName(String Dname){
        this.Dname=Dname;
    }
}
class aDateIn{
    public aDateIn(){
        AttackPoke AP = new AttackPoke();
        Scanner scan = new Scanner(System.in);

        System.out.printf("攻撃側:レベルを入力して下さい");
        int Alevel = scan.nextInt();

        System.out.printf("攻撃側:攻撃力を入力して下さい");
        int Apower = scan.nextInt();

        System.out.printf("攻撃側:技の威力を入力して下さい");
        int work = scan.nextInt();

        System.out.printf("攻撃側:名前を入力して下さい");
        String Aname = scan.nextLine();

        System.out.printf("攻撃側:レベル"+Alevel+"攻撃力"+Apower+"技の威力"+work+"名前"+Aname);
        AP.setAlevel(Alevel);
        AP.setPower(Apower);
        AP.setWork(work);
        AP.setAname(Aname);
    }
}
class dDateIn{
    public dDateIn(){
        BlockPoke BP = new BlockPoke();
        Scanner scan = new Scanner(System.in);
        System.out.printf("防御側:レベルを入力して下さい");
        int Dlevel = scan.nextInt();

        System.out.printf("防御側:HPを入力してください");
        int HP = scan.nextInt();

        System.out.printf("防御側:防御力を入力して下さい");
        int defense = scan.nextInt();

        System.out.printf("防御側:名前を入力して下さい");
        String Dname = scan.nextLine();

        System.out.printf("防御側:レベル"+Dlevel+"HP"+HP+"攻撃力"+defense+"名前"+Dname);
        BP.setDlevel(Dlevel);
        BP.setDefense(defense);
        BP.setHP(HP);
        BP.setDName(Dname);
    }
}
class Main {
    public static void main(String[] srgs){
        AttackPoke AP = new AttackPoke();
        BlockPoke BP = new BlockPoke();
        int damage;
        int a=AP.getAlevel();
        int p=AP.getPower();
        int w=AP.getWork();
        int b=BP.getDefense();
        
        damage=a*2+2;

    }
}
