package org.example;

import java.io.IOException;

public class App {
    public static void main(String args[]) throws IOException {
        Catalog catalog = new Catalog();

        Document doc1 = new Document("1", "doc1.txt");
        doc1.setPath("D:\\files-jason");
        doc1.addTag("author", "Author1");

        Document doc2 = new Document("2", "doc2.txt");
        doc2.setUrl("D:\\files-jason");
        doc2.addTag("year", "2023");

        catalog.add(doc1);
        catalog.add(doc2);

        CatalogUtil.save(catalog, "catalog.json");

        Catalog catalog1 = CatalogUtil.load("catalog.json");

       Document doc3 = catalog.findById("1");
       System.out.println("doc3 "+ doc3);
       catalog.toString();
       System.out.println(catalog);
      // doc3.toString();
    }
}