/**
 * 
 */
package mx.ch12.model;

/**
 * Bean used to store the data from each food element in the xml
 * 
 * @author dhernandez
 *
 */
public class Food {
	
	private String name;
	private double price;
	private String description;
	private int calories;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public int getCalories() {
		return calories;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
}
