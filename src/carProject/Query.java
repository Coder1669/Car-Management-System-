package carProject;

public class Query {

	static String insert = "INSERT INTO car(CarId, ManufacturingYear, Brand, Price, Color) VALUES (?, ?, ?, ?, ?)";
	static String access = "SELECT * FROM car";
	static String accessCars = "SELECT * FROM car WHERE BRAND=? AND PRICE<=?";
	static String accessCars1 = "SELECT * FROM car WHERE PRICE<=?";
	static String accessCars2 = "SELECT * FROM car WHERE ManufacturingYear=? AND Brand = ? AND Color = ?";
	static String accessBrand = "SELECT DISTINCT Brand From Car";
	static String count = "SELECT COUNT(*) From car WHERE Brand = ? ";
	static String countAll = "SELECT Brand, COUNT(*) FROM car GROUP BY Brand";
	static String countManuFacturingYear = "SELECT ManufacturingYear, COUNT(*) FROM car GROUP BY ManufacturingYear";
	static String countCarColor = "SELECT Color , COUNT(*) FROM car GROUP BY Color";
}
