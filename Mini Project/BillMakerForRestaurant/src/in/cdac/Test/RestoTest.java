package in.cdac.Test;

import java.util.ArrayList;
import java.util.Scanner;

import in.cdac.domain.Menu;
import in.cdac.domain.Table;

public class RestoTest {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Menu>menus= null;
	private ArrayList<Table>tables=null;
	private	Menu menu = new Menu();
	public RestoTest() {
		menus = new ArrayList<>();
		tables = new ArrayList<>();
	}
	public void addDishes(Menu menu) {
		menus.add(menu);
	}
	public void addTable(Table table) {
		tables.add(table);
	}
	public void addDish() {
		System.out.println("Enter Dish Number");
		int number = sc.nextInt();
		System.out.println("Enter Dish Name");
		sc.nextLine();
		String dishName = sc.nextLine();
		System.out.println("Enter Dish Price");
		float dishPrice =sc.nextFloat();
		Menu menu =new Menu(number, dishName, dishPrice);
		menus.add(menu);
		
	}
	public void addTable() {
		System.out.println("Enter Table Number");
		int num =sc.nextInt();
		System.out.println("Enter Customer Name");
		sc.nextLine();
		String name =sc.nextLine();
		Table table=new Table(num, name);
		tables.add(table);
	}
	public void findDish(String[] name) {
		boolean dish =menus.contains(name);
		if(dish==true) {
			System.out.println(name+" dish is already Present.");
		}else {
			System.out.println(name+" dish is Not Present.");
		}
	}
	public void removeDish(String[] name) {
		boolean dish =menus.contains(name);
		boolean removedStatus=menus.remove(name);
		if(removedStatus==true) {
			System.out.println(name+" dish is Removed.");
		}else {
			System.out.println(name+" dish is Not Present.");
		}
	}
		
	
}
