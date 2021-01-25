package sk.kosickaakademia.kolesarova;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFile {
    public static void main(String[] args) {

        JSONObject obj=new JSONObject();
        JSONArray jsonArray= new JSONArray();

        jsonArray.add("sport");
        jsonArray.add("tanec");
        jsonArray.add("kniha");
        

        obj.put("age",32);
        obj.put("name","Milan");
        //obj.put("sport","hockey");
        obj.put("hobby",jsonArray);
        obj.put("active",true);


        System.out.println(obj);

    }
}