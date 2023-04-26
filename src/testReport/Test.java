package testReport;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Test {

	public static void main(String[] args) throws IOException {
		
		int c=0;int j=1;int page =1;int pagec=0;
		String t ="分行                 批號                金額                   頁次:";
		String tt= "筆數: ";int ttt=0;
		ArrayList<String> a = new ArrayList<String>();
		a.add("001");a.add("123456789");a.add("500");
		a.add("001");a.add("321654987");a.add("1200");
		a.add("002");a.add("321654987");a.add("600");
		a.add("021");a.add("321654988");a.add("1200");
		a.add("003");a.add("123456789");a.add("8080");
		a.add("003");a.add("123456789");a.add("7777");
		a.add("003");a.add("123456789");a.add("5656");
		a.add("003");a.add("123456789");a.add("9090");
		a.add("003");a.add("123456789");a.add("1000");
		a.add("003");a.add("123456789");a.add("1500");
		a.add("003");a.add("123456789");a.add("500650");
		a.add("004");a.add("123456789");a.add("20");
		a.add("004");a.add("123456789");a.add("20");
		a.add("004");a.add("123456789");a.add("20");
		a.add("004");a.add("123456789");a.add("20");
		a.add("005");a.add("123459999");a.add("20");
		System.out.println(t+page);
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+"  ");c++;
			if(c%3==0) {ttt++;
			
			if((j+2<a.size())) {
					if(!a.get(j).equals(a.get(j + 3))){
						page=1;
						pagec=0;j+=3;
						System.out.print("\n"+tt+ttt);ttt=0;
						if((j+2>a.size()))System.out.print("\n"+tt+ttt);ttt=0;
						System.out.print("\n"+t+page+"\n");
					}else if((j+2>a.size())) {
						System.out.print("\n"+tt+ttt);ttt=0;
					}
					
					else {
						pagec++;j+=3;
						System.out.print("\n");
						if(pagec%5==0 && pagec*3+1<=a.size()) {
							page++;
							System.out.print(t+page+"\n");
							
						}
					}
				}
			}
		}
	}
	
	public static void separateDataTool(int startindex,int plusindex,int changeline,int page,int pagec,ArrayList<String> reslist) {
		int j=startindex;
		if((j+plusindex<reslist.size())&&(!reslist.get(j).equals(reslist.get(j + changeline)))) {
			j+=changeline;pagec=0;
		}else {
			j+=changeline;pagec++;
			if(pagec%changeline==0 && pagec*changeline+1<=reslist.size()) {
				page++;
			}
		}
	}
}


//if(i%3==0&&i+3<a.size()) {
//	if (!a.get(i).equals(a.get(i + 3))) {
//		System.out.print(t+"\n");
//	}
//}

//if(c%3==0) {
//	System.out.print("\n");pagec++;
//	if(pagec%3==0 && pagec*3+1<=a.size()) {
//		page++;System.out.print(t+page+"\n");
//	}
//}

//for(int i=0;i<a.size();i++) {
//	System.out.print(a.get(i)+"  ");c++;
//	
//	if(c%3==0) {
//		if((i%3==0&&i+3<a.size())&&(!a.get(i).equals(a.get(i + 3)))) {	
//			System.out.print("\n"+t+"\n");
//		}else {
//			System.out.print("\n");
//		}
//	}
//}


//if(c%3==0) {
//	ttt++;
//	if((j+2<a.size())&&(!a.get(j).equals(a.get(j + 3)))) {
//		page=1;
//		j+=3;pagec=0;
//		System.out.print("\n"+tt+ttt);ttt=0;
//		if((j+2>a.size()))System.out.print("\n"+tt+ttt);ttt=0;
//		System.out.print("\n"+t+page+"\n");
//		
//	}
//	
//	else {
//		j+=3;pagec++;
//		System.out.print("\n");
//		if(pagec%10==0 && pagec*3+1<=a.size()) {
//			page++;
//			System.out.print(t+page+"\n");
//			
//		}
//	}
//}
