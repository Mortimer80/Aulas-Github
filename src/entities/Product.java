package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantityX) {
		this.quantity += quantityX;
	}

	public void removeProducts(int quantityX) {
		this.quantity -= quantityX;
	}

	public String toString() {
		return name 
				+ ", $ " 
				//+ price + " ," 
				+ String.format("%.2f ", price)
				+", "
				+ quantity 
				+ " units, Total: $ " 
				//+ totalValueInStock();
				+ String.format("%.2f", totalValueInStock());

	}
}
