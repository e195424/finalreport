package jp.ac.uryukyu.ie.e195424;

class AttackPoke{
    private int level;
    private int power;
    private String name;
    AttackPoke(int l, int p, String n){
        this.level=l;
        this.power=p;
        this.name=n;
    }
    void print(){
        System.out.printf("レベル:%d\n", level);
        System.out.printf("名前:%d\n", level);
    }
    public int getLevel(){
        return level;
    }
    public int getPower(){
        return power;
    }
    public String getName(){
        return name;
    }
}
class BlockPoke{
    private int defence;
    BlockPoke(int b){
        this.defence=b;
    }
    public int getDefence(){
        return defence;
    }
    
}
class DamageCalc{

}
class Main {
    public static void main(String[] srgs){
        System.out.println();
    }
}
