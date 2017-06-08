/**
 * 
 */
package mx.ch12.model;

/**
 * Enum with the tag names in the xml file
 * 
 * @author dhernandez
 *
 */
public enum BreakfastElement {

	FOOD("food"),
	NAME("name"),
	PRICE("price"),
	DESCRIPTION("description"),
	CALORIES("calories");
	
	private String element;
	
	private BreakfastElement(String element) {
		this.element = element;
	}
	
	public String getElement() {
		return element;
	}
	
}
