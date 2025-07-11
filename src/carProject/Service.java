package carProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Service {
	public static void insertData(List<Car> carList)
	{
		Connection conn = DB.createConnection();
		String query = Query.insert;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			for(Car car:carList)
			{
				preparedStatement.setInt(1, car.getCarId());
				preparedStatement.setInt(2, car.getManufacturingYear());
				preparedStatement.setString(3, car.getBrand());
				preparedStatement.setInt(4, car.getPrice());
				preparedStatement.setString(5, car.getColor());
			}
			
			int x = preparedStatement.executeUpdate();
			if(x>0)
			{
				System.out.println("Data entered successfully");
			}
			else {
				System.out.println("Data not entered");
			}
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void accessAllCars()
	{
		Connection conn = DB.createConnection();
		String query = Query.access;
		Storage str = new Storage();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand = rs.getString(3);
				int price = rs.getInt(4);
				String color = rs.getString(5);
				
				Car c1 = new Car(id,manu,brand,price,color);
				str.addCars(c1);
			}
			
			str.displayAllCars();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void accessCars(String brand, int price)
	{
		Connection conn = DB.createConnection();
		String query = Query.accessCars;
		Storage str = new Storage();
		
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			preparedStatement.setString(1, brand);
			preparedStatement.setInt(2, price);
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color);
				str.addCars(c1);
			}
			
			str.displayAllCars();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void accessCarPrice(int price)
	{
		Connection conn = DB.createConnection();
		String query = Query.accessCars1;
		Storage str = new Storage();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			preparedStatement.setInt(1, price);
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color);
				str.addCars(c1);
			}
			
			str.displayAllCars();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void accessCarYear(int manufacturingYear, String brand, String color)
	{
		Connection conn = DB.createConnection();
		String query = Query.accessCars2;
		Storage str = new Storage();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			preparedStatement.setInt(1, manufacturingYear);
			preparedStatement.setString(2, brand);
			preparedStatement.setString(3, color);
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color1 = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color1);
				str.addCars(c1);
			}
			
			str.displayAllCars();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sortAscendingPrice()
	{
		Connection conn = DB.createConnection();
		String query = Query.access;
		Storage str = new Storage();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color1 = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color1);
				str.addCars(c1);
			}
			
			str.sortAscending();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sortDescendingPrice()
	{
		Connection conn = DB.createConnection();
		String query = Query.access;
		Storage str = new Storage();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color1 = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color1);
				str.addCars(c1);
			}
			
			str.sortDescendingPrize();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void sortManufacturing()
	{
		Connection conn = DB.createConnection();
		String query = Query.access;
		Storage str = new Storage();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				int manu = rs.getInt(2);
				String brand1 = rs.getString(3);
				int price1 = rs.getInt(4);
				String color1 = rs.getString(5);
				
				Car c1 = new Car(id, manu, brand1, price1, color1);
				str.addCars(c1);
			}
			
			str.sortManufacturing();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void displayAllBrands()
	{
		Connection conn = DB.createConnection();
		String query = Query.accessBrand;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				String brand = rs.getString(1);
				
				System.out.println(brand);
			}
			
//			str.displayAllCars();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void countCarParticularBrand(String brand)
	{
		Connection conn = DB.createConnection();
		String query = Query.count;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, brand);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				int count = rs.getInt(1);
				System.out.println("Number of cars for brand " + brand + ": " + count);
			}
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void countAllCar()
	{
		Connection conn = DB.createConnection();
		String query = Query.countAll;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				String brand = rs.getString(1);
				int count = rs.getInt(2);
				
				System.out.println(brand+" has "+count+" cars");
			}
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void countAllCarManufacturingYear()
	{
		Connection conn = DB.createConnection();
		String query = Query.countManuFacturingYear;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				int manu = rs.getInt(1);
				int count = rs.getInt(2);
				
				System.out.println(count+" Car is manuFactured in year: "+manu);
			}
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void countCarsColor()
	{
		Connection conn = DB.createConnection();
		String query = Query.countCarColor;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				String color = rs.getString(1);
				int count = rs.getInt(2);
				
				System.out.println(count+" Car is present in "+color+" Color");
			}
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
