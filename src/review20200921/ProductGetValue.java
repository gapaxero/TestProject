package review20200921;

public class ProductGetValue {

	public double CalValue(Product a) {
		return a.getStock()*a.getUnitPrice();
	}

}
