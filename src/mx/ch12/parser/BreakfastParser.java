/**
 * 
 */
package mx.ch12.parser;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import mx.ch12.handler.BreakfastHandler;
import mx.ch12.model.Food;

/**
 * Class that starts the parser and calls the {@linkplain BreakfastHandler}
 * 
 * @author dhernandez
 *
 */
public class BreakfastParser {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		BreakfastHandler handler = new BreakfastHandler();
		
		parser.parse("src/menu.xml", handler);
		List<Food> breakfast = handler.getBreakfast();
		for (Food food : breakfast) {
			System.out.println("Name: " + food.getName());
            System.out.println("Description: " + food.getDescription());
            System.out.println("Price: " + food.getPrice());
            System.out.println("Calories: " + food.getCalories());
            System.out.println("---------------------------------------------------------------------------------------------");
		}
	}

}
