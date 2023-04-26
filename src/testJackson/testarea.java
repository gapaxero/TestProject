package testJackson;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class testarea {

	public static void main(String[] args) {
		String test ="{\"discount\":\"1\",\"memo\":\"123321123\"}";
		String test2 = "{\"TxnType\":\"HE0012G800\",\"TraDate\":\"090917\",\"FiscDate\":\"090917\",\"TraAcc\":\"087100013366\",\"TraMoney\":\"0000000100000\",\"TraFulAcc\":\"8030000087100013366\",\"GroupID\":\"902\",\"TraSeq\":\"U170000029\",\"Branch\":\"002\"}";
		Gson gson = new Gson();
//		JsonElement jo = new JsonObject();
//		JsonParser parser = new JsonParser();
//		jo = JsonParser.parseString(test);
		
		JsonObject job = new Gson().fromJson(test2, JsonObject.class);
		String res = job.get("TraAcc").getAsString();
		
		String jsonstr = gson.toJson(getData());
		System.out.println(jsonstr);
		
		JsonObject jb = new Gson().fromJson(jsonstr, JsonObject.class);
		System.out.println(jb.get("aaa"));
	}
	
	public static ArrayList<ItemVO> getData(){
		ArrayList<ItemVO> reslist = new ArrayList<ItemVO>();
		ItemVO iv  = new ItemVO("A1","B1","C1");
		ItemVO iv2 = new ItemVO("A2","B2","C2");
		ItemVO iv3 = new ItemVO("A3","B3","C3");
		
		reslist.add(iv); reslist.add(iv2); reslist.add(iv3);
		
		return reslist;
	}

}
