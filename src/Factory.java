
public class Factory {

	public Product createProduct (String productName){
		Product p = null;
		if (productName.equalsIgnoreCase("A")){
			p = new ProductA();
		}
		else if (productName.equalsIgnoreCase("B")){
			p = new ProductB();
		}
		return p;
	}

}
