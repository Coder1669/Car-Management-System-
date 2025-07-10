package carProject;
import java.util.*;

public class Storage {

	private List<Car> l1 = new ArrayList<>();
	
	public void addCars(Car car)
	{
		l1.add(car);
	}
	
	public List<Car> getAllCars()
	{
		return l1;
	}
	
	public void displayAllCars()
	{
		for(Car x:l1)
		{
			System.out.println(x);
		}
	}
	
	public void sortAscending()
	{
		l1.sort(Comparator.comparingInt((Car c)->c.price));
		displayAllCars();
	}
	
	public void sortDescendingPrize()
	{
		l1.sort(Comparator.comparingInt((Car c)->c.price).reversed());
		displayAllCars();
	}
	
	public void sortManufacturing()
	{
		l1.sort(Comparator.comparingInt((Car c)->c.manufacturingYear).reversed());
		displayAllCars();
	}
}
