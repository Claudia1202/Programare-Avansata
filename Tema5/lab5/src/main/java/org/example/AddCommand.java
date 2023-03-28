package org.example;

/**
 * Implementeaza comanda "add" de adaugare a documentelor in catalog.
 */
public class AddCommand implements Commands {

    Catalog catalog;
    Document doc;

    public AddCommand(Catalog catalog, Document doc) {
        this.catalog = catalog;
        this.doc = doc;
    }

    /**
     * Metoda ce adauga documente in catalog.
     */
    @Override
    public void execute() {

        catalog.addDoc(doc);

        //System.out.println("Document added to catalog.");
    }

}
