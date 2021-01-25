package sk.kosickaakademia.kolesarova;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonFile {
    public static void main(String[] args) throws JSONException {

        JSONObject obj=new JSONObject();
        JSONArray jsonArray=new JSONArray();
        
        obj.put("age",32);
        obj.put("name","Milan");
        obj.put("sport","hockey");
        obj.put("active",true);



        System.out.println(obj);

    }
}
