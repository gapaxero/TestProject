package testJackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTool {

	public static void main(String[] args) {		

	}
	
	public static String printStrJson(Object jsonObject) {
		String res = "";
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			res = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			res = "Jsonparser Error";
			e.printStackTrace();
		}		
		return res;		
	}
	
}
