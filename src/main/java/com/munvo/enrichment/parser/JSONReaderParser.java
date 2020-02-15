package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class JSONReaderParser implements FileReaderParser {

    @Override
    public Subscriber parseSubscriber(String subLine)  {

        // creating JSONParser Object
        JSONParser jsonParser = new JSONParser();

        try {
            // creating JSON object
            JSONObject json = (JSONObject) jsonParser.parse(subLine);

            // Parsing values from keys
            int id = (int) json.getOrDefault("id", 0);
            String name = (String) json.getOrDefault("name","name");
            String phone = (String) json.getOrDefault("phone", "phone");

            //Returning subscriber object
            return new Subscriber(id, name, phone);
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        return null;
    }
}
