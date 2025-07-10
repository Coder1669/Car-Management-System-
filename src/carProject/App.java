package carProject;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c ;
		do {
			System.out.println("Enter 1 to Insert Cars: \nEnter 2 to Display All Cars: \nEnter 3 to Access all cars of a paticular brand and with Price<=?: \n"
					+ "Enter 4 to Access all cars of price <=?: \nEnter 5 to Access all cars of year 2015 and newer of particular brand in particular colour: \n"
					+ "Enter 6 to Sort all cars on price low to high: \nEnter 7 to Sort all cars on price high to low: \nEnter 8 to Sort all cars on year of manufacturing from new to old order\n"
					+ "Enter 9 to List all the brands of car available: \nEnter 10 to Count the number of cars available for a particular brand: \n"
					+ "Enter 11 to Count the number of cars available in all brands: \nEnter 12 to Count the number of Car available in from each manufacturing years: \n"
					+ "Enter 13 to Count the number of cars available in each color: ");
			int choice = sc.nextInt();
			Storage str = new Storage();
			
			switch(choice)
			{
			case 1:
			{
					System.out.println("CarId, ManufacturingYear, Brand, Price, Color");
					int id = sc.nextInt();
					int manu = sc.nextInt();
					String brand = sc.next();
					int price = sc.nextInt();
					String color = sc.next();
			
					
					str.addCars(new Car(id,manu, brand, price, color));
					Service.insertData(str.getAllCars());
			}
			break;
			
			case 2: 
			{
				Service.accessAllCars();
			}
			break;
			
			case 3:
			{
				System.out.println("Enter the car name: ");
				String name = sc.next();
				System.out.println("Enter the price: ");
				int price = sc.nextInt();
				
				Service.accessCars(name, price);
			}
			break;
			
			case 4:
			{
				System.out.println("Enter the price: ");
				int price = sc.nextInt();
				
				Service.accessCarPrice(price);
			}
			break;
			
			case 5:
			{
				System.out.println("Enter the manufacturingYear: ");
				int manu = sc.nextInt();
				System.out.println("Enter the brand: ");
				String brand = sc.next();
				System.out.println("Enter the color: ");
				String color = sc.next();
				
				Service.accessCarYear(manu, brand, color);
			}
			break;
			
			case 6:
			{
				Service.sortAscendingPrice();
			}
			break;
			
			case 7:
			{
				Service.sortDescendingPrice();
			}
			break;
			
			case 8:
			{
				Service.sortManufacturing();
			}
			break;
			
			case 9:
			{
				Service.displayAllBrands();
			}
			break;
			
			case 10:
			{
				System.out.println("Enter the brand: ");
				String brand = sc.next();
				Service.countCarParticularBrand(brand);
			}
			break;
			
			case 11:
			{
				Service.countAllCar();
			}
			break;
			
			case 12:
			{
				Service.countAllCarManufacturingYear();
			}
			break;
			
			case 13:
			{
				Service.countCarsColor();
			}
			break;
			
			default:
				System.out.println("invalid choice");
			}
			
			System.out.println("Press y/Y to continue other key to exit: ");
			c = sc.next().charAt(0);
			System.out.println("----------Program Ends----------\nThank You");
			sc.close();
		}while(c=='Y'|| c=='y');
	}
}
