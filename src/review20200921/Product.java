package review20200921;

public class Product {
private String name;
private int id;
private double unitPrice;
private boolean free;
private int stock;

	public int getID() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free=free;
	}
	
	public void incStock(int amount) {
		stock=stock+amount;
	}
	public void decStock(int amount) {
		stock=stock-amount;
	}
	public int getStock() {
		return stock;
	}
	
	public Product() {}
	public Product(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Product(int id,String name,double unitPrice,boolean free,int stock) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.free=free;
		this.stock=stock;
		
	}
	
	public String toString() {
		return "ID: "+id+"\t"+"Name: "+name+"\t"+"Price: "+unitPrice+"\t"
				+"Available: "+free+"\t"+"Stock: "+stock;
	}
	

}
