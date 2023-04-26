package rpg;
import java.util.*;
public class RoleProperty {
private int Str;         //力量
private int Con;         //體力
private int Wis;         //智慧
private int Agi;         //敏捷
private int intelligence;//智力
private int Level=1;     //初始等級
private int Atk;         //基礎攻擊力
private int Def;         //基礎防禦力
private int Hp;          //基礎血量
private int Mp;          //基礎魔力

	
	public RoleProperty() {
		
	}
	public int GetStr() {
		return Str;
	}
	public int Getintelligence() {
		return intelligence;
	}
	public int GetCon() {
		return Con;
	}
	public int GetWis() {
		return Wis;
	}
	public int GetAgi() {
		return Agi;
	}
	public int GetAtk() {
		return Atk;
	}
	public int GetDef() {
		return Def;
	}
    public int GetLevel() {
    	return Level;
    }
    public int GetHp() {
    	return Hp;
    }
    public int GetMp() {
    	return Mp;
    }
    
    public void RandomInitRoleProperty(int s ,int a,int c,int i,int w) {   	
		Random random = new Random();
		int sum = 0;
		do {
			Str = random.nextInt(5)+s;
			Con = random.nextInt(5)+c;
			Wis = random.nextInt(5)+w;
			intelligence = random.nextInt(5)+i;
			Agi = random.nextInt(5)+a;
			sum = Str+Con+Wis+intelligence+Agi;
		} while (sum != 100);
		
		Hp  = 20*Con; // 生命值=20*體力	
		Mp  = 10*(Wis+intelligence) ; // 魔法值=(智力+智慧)*10
		Atk = 5 *Str; //基礎攻擊力=5*力量
		Def = (int) (30+(Con+Str)*0.5);//基礎防禦=30+體力力量的一半
		
    }
    public void SetProfessionProperty(int Profession) {
    	if(Profession==0)RandomInitRoleProperty(40,20,30,5,5);
    	if(Profession==1)RandomInitRoleProperty(25,15,30,20,10);
    	if(Profession==2)RandomInitRoleProperty(20,35,20,15,10);
    	if(Profession==3)RandomInitRoleProperty(15,40,15,10,20);
    	if(Profession==4)RandomInitRoleProperty(15,20,15,35,15);
    	if(Profession==5)RandomInitRoleProperty(10,20,10,20,40);
    }
    public void ShowPlayerProperty() {
    //	System.out.println("===============");  
    	System.out.println("體力  "+this.Str);
    	System.out.println("敏捷  "+this.Agi);
    	System.out.println("智慧  "+this.Wis);
    	System.out.println("智力  "+this.intelligence);
    	System.out.println("體力  "+this.Con);
    	System.out.println("血量  "+this.Hp);
    	System.out.println("魔力  "+this.Mp);
    	System.out.println("攻擊力  "+this.Atk);
    	System.out.println("防禦力  "+this.Def);
    	System.out.println("===============");   	
    }
}
