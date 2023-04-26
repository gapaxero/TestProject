package testEnum;

public class Test3 {
	public static void main(String[] args) {
		CaseEntity case1 = getCaseData(setTestPOJO());
		String name = case1.getName();
		String age = case1.getAge();
		Type type = case1.getType();
		
		System.out.println(Type.Normal.name());
	}
	
	public static Type getReqType(String input) {
		return Type.valueOf(input);
	}
	
	public static CaseEntity getCaseData(TestPOJO pojo) {
		CaseEntity entity = new CaseEntity();
		entity.setAge(pojo.getAge());
		entity.setName(pojo.getName());
		entity.setType(pojo.getType());
		return entity;
	}
	
	public static TestPOJO setTestPOJO() {
		TestPOJO tp = new TestPOJO();
		tp.setAge("123");
		tp.setName("BBB");
		tp.setType(Type.valueOf("Super"));
		
		return tp;
	}
}
