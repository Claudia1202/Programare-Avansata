package org.example;

import java.util.Map;

/**
 * Creeaza obiecte de tip Document. Un document poate fi o carte, un articol etc. Documentele sunt adaugate in Catalog.
 */
public class Document  {

    private String id;
    private String name;
    private String url;
    private String path;
    private Map<String, String> tags ;

    public Document(String id, String name, Map<String, String> tags) {
        this.id=id;
        this.name=name;
        this.tags = tags;
    }

    /**
     * Metoda addTag adauga noi tag-uri pentru documente, precum autor, anul si data publicarii  etc.
     * @param name
     * @param value
     */
    public void addTag(String name, String value) {
        tags.put(name, value);
    }

    //Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public Map<String, String> getTags() {
        return tags;
    }


    /**
     * Pentru afisarea Documentelor si a detaliilor acestora(Id, nume, path/url, alte tag-uri).
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("ID: ").append(id).append("\n");
        str.append("Name: ").append(name).append("\n");
        str.append("Path: ").append(path).append("\n");
        str.append("URL: ").append(url).append("\n");
        str.append("Tags: ").append("\n");
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            str.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return str.toString();
    }
}
