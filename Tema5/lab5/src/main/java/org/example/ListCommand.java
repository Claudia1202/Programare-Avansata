package org.example;

/**
 * Implementeaza comanda "list" de afisare a unei liste a tuturor documentelor din catalog.
 */
public class ListCommand implements Commands{

    Catalog catalog;

    public ListCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    /**
     * Metoda ce afiseaza documentele din catalog.
     */
    @Override
    public void execute() {
        for(Document d : catalog.getDocs()){
            System.out.println(d.getName());
        }
    }
}
