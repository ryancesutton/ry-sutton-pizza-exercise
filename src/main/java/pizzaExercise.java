import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.objectweb.asm.Type;

import java.io.*;
import java.net.URL;
import java.util.*;

public class pizzaExercise {


//    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.olo.com/pizzas.json");
//            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//            StringBuilder jsonString = new StringBuilder();
//            String str = "";
//            while (null != (str = br.readLine())) {
////                System.out.println(str);
//                jsonString.append(str);
//
//                JSONParser parser = new JSONParser();
//                JSONArray jsonArray = (JSONArray) parser.parse(jsonString.toString());
//
//                System.out.println(jsonArray.get(1));
//
//
//
//            }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }
public static void main(String[] args) throws Exception
{
    // parsing file "JSONExample.json"
    Object obj = new JSONParser().parse(new FileReader("src/main/resources/pizza.json"));

    // typecasting obj to JSONObject
    JSONObject jo = (JSONObject) obj;


    // getting toppings
    Map toppings = ((Map)jo.get("toppings"));

    // iterating toppings Map
    Iterator<Map.Entry> itr1 = toppings.entrySet().iterator();
    while (itr1.hasNext()) {
        Map.Entry pair = itr1.next();
        System.out.println(pair.getKey() + " : " + pair.getValue());
    }


}


}