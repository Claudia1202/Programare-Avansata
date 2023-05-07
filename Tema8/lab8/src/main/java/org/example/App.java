package org.example;

import java.sql.Connection;
import java.sql.SQLException;

import static org.example.Database.closeConnection;

public class App {
    public static void main(String[] args) {
        try {
            Connection connection = Database.getConnection();
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            System.out.println("Artist id:" + artists.findByName("Pink Floyd"));

            var genres = new GenreDAO();
            genres.create("Rock");
            genres.create("Pop");
            System.out.println("Genre id:" + genres.findByName("Rock"));

            var albums = new AlbumDAO();
            albums.create(1979, "The Wall", "Pink Floyd", "Rock");
            albums.PrintAlbum();

            closeConnection(connection);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            Database.rollback();
        }
    }
}
