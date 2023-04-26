package review20200921;

public class ProductServive {

	public static void main(String[] args) {
		Product getInfo = new Product();
		ProductGetValue getInvantoryValue = new ProductGetValue();
        getInfo.setId(1001);
        getInfo.setName("Bike");
        getInfo.setUnitPrice(6000);
        getInfo.setFree(false);
        getInfo.incStock(60);
        getInfo.decStock(30);
        
        Product getInfo2 =new Product(1002,"Computer");
        Product getInfo3 =new Product(1003,"HeadPhone",600,false,200);
        
        System.out.println(getInfo +"\t"+"InvantoryValue: "+getInvantoryValue.CalValue(getInfo));
        System.out.println(getInfo2+"\t"+"InvantoryValue: "+getInvantoryValue.CalValue(getInfo2));
        System.out.println(getInfo3+"\t"+"InvantoryValue: "+getInvantoryValue.CalValue(getInfo3));
        
	}

}
