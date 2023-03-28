package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Creeaza obiecte de tip Catalog. Un Catalog contine documente precum carti, articole, etc.
 */
class Catalog implements Serializable {
    private List<Document> docs = new ArrayList<>();

    public Catalog() {}

    /**
     * Metoda add adauga documente in lista de documente a Catalogului.
     * @param doc
     */
    public void addDoc(Document doc) {
        docs.add(doc);
    }

    /**
     * Metoda returneaza lista de documente adaugate in catalog
     * @return docs
     */
    public List<Document> getDocs() {
        return docs;
    }


    /**
     * Metoda findById cauta in lista de documente un document anume dupa Id.
     * @param id
     * @return
     */
    public Document findById(String id) {
        return docs.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    /**
     * Afiseaza sub forma de string continutul Catalogului, cu numele documentelor si continutul fiecaruia.
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder ss = new StringBuilder();
        ss.append("Catalog:\n");
        for (Document document : docs) {
            ss.append(document.getName().toString());
            ss.append("\n");
            ss.append(document.toString());
            ss.append("\n");
        }
        return ss.toString();
    }


}