import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class pizzaExercise {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            URL url = new URL("https://www.olo.com/pizzas.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            while (null != (str = br.readLine())) {
                System.out.println(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}