import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Main {

public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		JSONParser parser = new JSONParser();
		Reader reader = new FileReader("C:\\Users\\Hallur\\Documents\\NetBeansProjects\\AssignmentDB11ORM\\src\\main\\java\\data.json");

		Object jsonObj = parser.parse(reader);

		JSONObject jsonObject = (JSONObject) jsonObj;
                String name = (String) jsonObject.get("schemaName");
                System.out.println(name);
		reader.close();
	}
}
