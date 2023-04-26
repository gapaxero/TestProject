package testJackson;

public class ItemVO {
	private String aaa = "";
	private String bbb = "";
	private String ccc = "";
	
	public ItemVO() {}
	
	public ItemVO(String aaa, String bbb, String ccc) {
		super();
		this.aaa = aaa;
		this.bbb = bbb;
		this.ccc = ccc;
	}
	
	public String getAaa() {
		return aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public String getBbb() {
		return bbb;
	}
	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public String getCcc() {
		return ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
	
	
}
