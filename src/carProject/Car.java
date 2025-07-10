package carProject;

public class Car {

	int carId;
	String brand;
	int price;
	String color;
	int manufacturingYear;
	
	Car()
	{
		
	}
	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	Car(int carId, int manufacturingyear, String brand, int price, String color)
	{
		this.carId = carId;
		this.manufacturingYear = manufacturingyear;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	@Override
	public String toString() {
		return "[carId=" + carId + ", brand=" + brand + ", price=" + price + ", color=" + color
				+ ", manufacturingYear=" + manufacturingYear + "]";
	}

	
	
	
}
