package in.cdac.domain;

public class Menu {
	private int dishNo;
	private String dishName;
	private float dishPrice;
	private int dishQuantity;
	public int getDishNo() {
		return dishNo;
	}
	public void setDishNo(int dishNo) {
		this.dishNo = dishNo;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public float getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}
	public int getDishQuantity() {
		return dishQuantity;
	}
	public void setDishQuantity(int dishQuantity) {
		this.dishQuantity = dishQuantity;
	}
	public Menu() {
		
	}
	public Menu(int dishNo, String dishName, float dishPrice) {
		this.dishNo = dishNo;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.dishName.equals(obj);
	}
	
	@Override
	public String toString() {
	
		return String.format("%-3d%-10s%-5.2f%-03d",this.dishNo,this.dishName,this.dishPrice,this.dishQuantity);
	}

}
