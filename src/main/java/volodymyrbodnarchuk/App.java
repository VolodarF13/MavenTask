package volodymyrbodnarchuk;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String,String> myName = new HashMap<>();
        myName.put("Name","Volodymyr");
        myName.put("lastName","Bodnarchuk");

        Gson gson = new Gson();
        String jsonOutput = gson.toJson(myName);

        System.out.println(jsonOutput);

     }
}
