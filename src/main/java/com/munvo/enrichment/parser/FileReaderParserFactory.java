package com.munvo.enrichment.parser;

// Factory pattern implementation
public class FileReaderParserFactory {

    public FileReaderParser getFileReaderParser(String type) {

        // FileReaderParserFactory returns ReaderParser based on input type
        if (type.equalsIgnoreCase("CSV")) {
            return new CSVReaderParser();

        } else if (type.equalsIgnoreCase("JSON")) {
            return new JSONReaderParser();
        }

        System.out.println("Invalid type");
        return null;
    }
}
