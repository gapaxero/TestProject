package testReflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.google.gson.JsonObject;

public class TestReflecttion {

	public static void main(String[] args) throws Exception {
		String className = TestModel.class.getName();
		System.out.println("className:" + className);
		
		Class<?> clazz = Class.forName(className);
		
		//==============ClassINFO===================
		Object ins = clazz.getDeclaredConstructor().newInstance();
		System.out.println("NewInstance:" + ins);
		System.out.println("Modifiers: "  + Modifier.toString(clazz.getModifiers()));
		System.out.println("Package: "    + clazz.getPackage().getName());
		//===========================================	
		
		//==============Field[]======================	
		Field[] field = clazz.getDeclaredFields();		
		for(int i = 0 ; i < field.length ; i++) {
			System.out.println(field[i].getName());
		}
		//===========================================
		
		//==============Method[]=====================
		Method[] method = clazz.getDeclaredMethods();		
		for(int i = 0 ; i < method.length ; i++) {
			System.out.println(method[i].getName());
		}
		//===========================================
		
	}
	
	public static JsonObject getJsonStr() {
		
		
		
		return null;
	}
	

}
