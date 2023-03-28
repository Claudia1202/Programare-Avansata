package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) throws InvalidCatalogException {
        Catalog catalog = new Catalog();
        Map<String, String> tagsDoc1 = new HashMap<>();
        tagsDoc1.put("Autor", "JK");
        Document doc1 = new Document("1", "doc1", tagsDoc1 );
        doc1.setPath("D:\\grafuri\\lab5");
        Map<String, String> tagsDoc2 = new HashMap<>();
        tagsDoc2.put("Year", "2002");
        Document doc2 = new Document("2", "doc2", tagsDoc2);
        doc2.setPath("D:\\grafuri\\lab5");
        Map<String, String> tagsDoc3 = new HashMap<>();
        tagsDoc3.put("Autor", "LM");
        Document doc3 = new Document("3", "doc3", tagsDoc3);
        doc3.setPath("D:\\grafuri\\lab5");


        AddCommand d1 = new AddCommand(catalog, doc1);
        d1.execute();
        AddCommand d2 = new AddCommand(catalog, doc2);
        d2.execute();
        AddCommand d3 = new AddCommand(catalog, doc3);
        d3.execute();



        System.out.println("Catalog docs: ");
        Commands listCommand = new ListCommand(catalog);
        Commands viewCommand = new ViewCommand(doc2);
        Commands reportCommand = new ReportCommand(catalog);

        listCommand.execute();
        viewCommand.execute();
        reportCommand.execute();
    }


}