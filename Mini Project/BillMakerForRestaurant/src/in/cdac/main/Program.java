package in.cdac.main;
import java.util.Scanner;
import in.cdac.Test.RestoTest;
public class Program {
	
	private static Scanner sc = new Scanner(System.in);
	private RestoTest test = new RestoTest();
	private static int dishMenu() {
		System.out.println("Enter Choice ");
		System.out.println("0.Exit.");
		System.out.println("1.Add dish.");
		System.out.println("2.find dish.");
		System.out.println("2.Remove dish");
		System.out.println("4.Take Order.");
		return sc.nextInt();
	}
	private static int menuList() {
		System.out.println("Enter Choice ");
		System.out.println("0.Exit.");
		System.out.println("1.Add Table.");
		System.out.println("2.Menu Book.");
		System.out.println("2.find Table.");
		System.out.println("4.clear Table.");
		
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int dishChoice;
		String [] name = new String[1];
		RestoTest test = new RestoTest();
		Program program = new Program();
		while((choice=menuList())!=0) {
			switch(choice) {
				case 1:test.addTable();break;
				case 2: while((dishChoice=dishMenu())!=0) {
							switch(dishChoice) {
							case 1: test.addDish();break;
							case 2:System.out.println("Enter Dish to be found.");
									sc.nextLine();
								   name [0]= sc.nextLine();
								   test.findDish(name);
								   break;
							case 3:System.out.println("Enter Dish to be Removed.");
									sc.nextLine();
								   name [0]= sc.nextLine();
								   test.removeDish(name);	   
							
							}
						}
				case 3: //Program.findTable();break;
			}
		}

	}
	
	
	
	

}
