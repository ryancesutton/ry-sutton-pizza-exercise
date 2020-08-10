import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.objectweb.asm.Type;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class pizzaExercise {


    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.olo.com/pizzas.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            while (null != (str = br.readLine())) {
//                System.out.println(str);

                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(str);
                JSONArray toppings = (JSONArray) jsonObject.get("toppings");

                Iterator<String> iterator = toppings.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}