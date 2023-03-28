package org.example;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Implementeaza comanda "view" ce deschide documentul specificat.
 */
public class ViewCommand implements Commands {
    Document doc;
    public ViewCommand(Document doc) {
        this.doc = doc;
    }

    public void execute() throws InvalidCatalogException, InvalidDocException {

                if (doc == null) {
                    throw new InvalidDocException("Cannot view null document");
                }


        if (!Desktop.isDesktopSupported()) {
            throw new InvalidCatalogException("Desktop not supported");
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.OPEN)) {
            throw new InvalidCatalogException("OPEN not supported");
        }

        File file = new File(doc.getPath());

        if (!file.exists()) {
            throw new InvalidDocException("File not found");
        }
        try {
            desktop.open(file);
        } catch (IOException e) {
            throw new InvalidCatalogException("Could not open document");
        }
    }
}


