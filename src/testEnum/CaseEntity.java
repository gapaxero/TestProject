package testEnum;

import lombok.Data;

@Data
public class CaseEntity {
	
	private String name;
	
	private String age;
	
	private Type type = Type.Normal;
}
