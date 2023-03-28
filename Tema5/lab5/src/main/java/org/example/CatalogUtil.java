package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Se ocupa cu operatiile externe asupra catalogului, precum salvarea acestuia intr un fisier extern si incarcacrea acestuia dintr un fisier extern.
 */
public class CatalogUtil  {
    /**
     * Metoda se ocupa salvarea Catalogului intr un fisier extern.
     * @param catalog
     * @param path
     * @throws IOException
     */
    public static void save(Catalog catalog, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new java.io.File(path), Catalog.class);
    }

    /**
     * Metoda se ocupa cu incarcarea Catalogului intr un fisier extern.
     * @param path
     * @return
     * @throws IOException
     */
    public static Catalog load(String path)  throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enableDefaultTyping();

        Catalog catalog = objectMapper.readValue(new java.io.File(path), Catalog.class);

        return catalog;
    }


}
