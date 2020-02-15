package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;


public class CSVReaderParser implements FileReaderParser {
    @Override
    public Subscriber parseSubscriber(String subLine) {
        String delimiter = ",";

            //split string based on delimiter
            String[] content = subLine.split(delimiter);

            //subscriber's configuration
            if (content.length < 3) {
                throw new IndexOutOfBoundsException("Missing CSV variable");
            }
            int id = Integer.parseInt(content[0]);
            String name = content[1];
            String phone = content[2];

        return new Subscriber(id,name,phone);
    }
}
