package testJackson.JacksonTool;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JackTools {
	
	static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);// 可忽略POJO沒有的屬性
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);// 可接收大寫的json，轉為POJO時，Key全部變小寫
	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
	    mapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
	    mapper.setVisibility(PropertyAccessor.SETTER, JsonAutoDetect.Visibility.NONE);
	}
	
	public static ObjectMapper getMapper() {
		return mapper;
	}
	
	public static String jsonSerialize(Object o) throws JsonProcessingException {
		String res = "";
		res = mapper.writeValueAsString(o);		
		return res;
	}
	
	public static Object jsonDeSerialize(String json,Object o) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(json, o.getClass());
	}
	
	public static <T> T readValue(String value, Class<T> obj) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(value, obj);
	}

	public static JsonNode readTree(Object model) {
		try {
			return mapper.readTree(mapper.writeValueAsString(model));
		} catch (Exception e) {
			return null;
		}
	}

}
