package testJackson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import testJackson.JacksonTool.JackTools;
import testJackson.POJO.User;

@SuppressWarnings("unused")
public class TestJackson {

	public static void main(String[] args) throws Exception {
		File json1 = new File("src/testJson/POJO/Json1.json");
		File json2 = new File("src/testJson/POJO/Json2.json");
		File json3 = new File("src/testJson/POJO/Json3.json");
		
		User u1 = new User("CCC","26","0816","987","M");
		User u2 = new User("AAA","18","0624","777","F");

		List<String> list = new ArrayList<>();
		list.add("aa");list.add("bb");list.add("cc");list.add("dd");list.add("ee");

		String jsonStr = JackTools.jsonSerialize(list);
		
		String aaa = "{\"NAME\":\"CCC\",\"AGE\":\"77\",\"BDate\":\"123456\",\"SEQ\":\"99\",\"G\":\"F\"}";
		User user = JackTools.readValue(aaa, User.class);

		JsonNode node = JackTools.getMapper().readTree(aaa);

		Map<String, Object> map = JackTools.getMapper().convertValue(node, new TypeReference<Map<String, Object>>(){});
//		List<User> listUser = JackTools.getMapper().readValue(json3, new TypeReference<List<User>>(){});



		System.out.println(map);
		
	}
	
	public static String setDataJson(String entrance, String jwtToken) throws JsonProcessingException {
		String resJson = "";
		Map<String, String> map = new TreeMap<>();
		map.put("entrance", entrance);
		map.put("jwtToken", jwtToken);
		
		resJson = JackTools.getMapper().writeValueAsString(map);
		
		return resJson;
	}
	
	public static Map<String, String> getData(String json) throws Exception {
		String str = "";
		Map<String, String> m = JackTools.getMapper().readValue(json, new TypeReference<TreeMap<String, String>>() {});
		
		return m;
	}
	
}
