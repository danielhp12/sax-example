/**
 * 
 */
package mx.ch12.handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import mx.ch12.model.BreakfastElement;
import mx.ch12.model.Food;

/**
 * Handler that manages the callbacks while parsing the xml
 * 
 * @author dhernandez
 *
 */
public class BreakfastHandler extends DefaultHandler {
	
	private boolean name;
	private boolean price;
	private boolean description;
	private boolean calories;
	
	private Food currentFood = new Food();
	private List<Food> breakfast = new ArrayList<>();
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals(BreakfastElement.NAME.getElement())) {
			name = true;
		}
		
		if (qName.equals(BreakfastElement.PRICE.getElement())) {
			price = true;
		}
		
		if (qName.equals(BreakfastElement.DESCRIPTION.getElement())) {
			description = true;
		}
		
		if (qName.equals(BreakfastElement.CALORIES.getElement())) {
			calories = true;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals(BreakfastElement.FOOD.getElement())) {
			breakfast.add(currentFood);
			currentFood = new Food();
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (name) {
			currentFood.setName(new String(ch, start, length));
			name = false;
		}
		
		if (price) {
			currentFood.setPrice(Double.parseDouble(new String(ch, start, length)));
			price = false;
		}
		
		if (description) {
			currentFood.setDescription(new String(ch, start, length));
			description = false;
		}
		
		if (calories) {
			currentFood.setCalories(Integer.parseInt(new String(ch, start, length)));
			calories = false;
		}
	}

	public List<Food> getBreakfast() {
		return breakfast;
	}
	
	

}
