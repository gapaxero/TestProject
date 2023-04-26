package rpg;
import java.util.*;
public class RoleEthnicityAndProfession {
private int ethnicity;
private int profession;
private String[] ethnicitys = {"人類", "精靈", "獸人", "矮人", "元素"};
private String[] professions= {"狂戰士", "聖騎士", "刺客", "遊俠", "祭司", "巫師","獵手"};

     public int  GetEthnicity() {
    	 return ethnicity;
     }
     public void SetEthnicity(int ethnicity) {
    	 this.ethnicity=ethnicity;
     }
     public int  GetProfession() {
    	 return profession;
     }
     public void SetProfession(int profession) {
    	 this.profession=profession;
     }
     
    @SuppressWarnings("resource") 
	public int SelectEthnicity() {
		Scanner sc=new Scanner(System.in);
    	 while(true) {
    		  System.out.println("請輸入0~4選擇種族:0人類 1精靈 2獸人 3矮人 4元素");
    		  this.ethnicity =sc.nextInt();
    		  if ( ethnicity>= 0 && ethnicity <= 4)break;
    		  else {
  				System.out.println("請輸入0~4之間的數字!");
  			  }	
    	 }
    	 return ethnicity; 
     }
     
     public int SelectProfession() {
    	 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	 
    	 switch(ethnicity) {
  	     
    	 case 0:
    		 while(true) {
    	      System.out.println("請輸入0~4選擇職業:0狂戰士 1聖騎士 2刺客 3遊俠 4祭司 5巫師");
       		  this.profession =sc.nextInt();
       		  if ( profession>= 0 && profession <= 5)break;
       		  else {
     				System.out.println("請輸入0~5之間的數字!");
     			  }	 
    		 }break;
    	 case 1:
    		 while(true) {
       	      System.out.println("請輸入2~5選擇職業:2刺客 3遊俠 4祭司 5巫師");
          		  this.profession =sc.nextInt();
          		  if ( profession>= 2 && profession <= 5)break;
          		  else {
        				System.out.println("請輸入2~5之間的數字!");
        			  }	 
       		 }break;
    	 case 2:
    		 while(true) {
          	      System.out.println("請輸入0,3,4選擇職業:0狂戰士3遊俠 4祭司");
             		  this.profession =sc.nextInt();
             		  if ( profession == 0 || profession == 3 || profession == 4)break;
             		  else {
           				System.out.println("請輸入0,3,4!");
           			  }	 
          		 }break;
    	 case 3:
    		 while(true) {
       	      System.out.println("請輸入0,1,4選擇職業:0狂戰士  4祭司  5獵手");
          		  this.profession =sc.nextInt();
          		  if ( profession == 0 || profession == 1 || profession == 4)break;
          		  else {
        				System.out.println("請輸入0,1,5!");
        			  }	 
       		 }break;
    	 case 4:
    		 while(true) {
       	      System.out.println("請輸入4,5選擇職業:4祭司 5巫師");
          		  this.profession =sc.nextInt();
          		  if ( profession == 4 || profession == 5)break;
          		  else {
        				System.out.println("請輸入4,5!");
        			  }	 
       		 }break;
       	 default: break;
       	 }
     return profession;  	 
     }
     
     public void PrintResult() {
    	 System.out.println("===============");
    	 System.out.println("種族: "+ethnicitys [this.ethnicity]);  	 
    	 System.out.println("職業: "+professions[this.profession]);
    	 System.out.println("===============");
     }
     

}
