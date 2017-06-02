package com.netcracker.istimaldar.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by istimaldar
 */

@Entity
@Table(name = "genre")
public class Genre implements Cloneable, Serializable {
    @Id
    private int id;
    private String genre;
    private String description;

    public Genre() {

    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre1 = (Genre) o;

        return id == genre1.id && genre.equals(genre1.genre) && description.equals(genre1.description);
    }

    @Override
    public int hashCode() {
        int result = genre.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static GenreBuilder newBuilder() {
        return new Genre().new GenreBuilder();
    }

    public class GenreBuilder {
        private GenreBuilder() {

        }

        public GenreBuilder setId(int id) {
            Genre.this.id = id;
            return this;
        }

        public GenreBuilder setGenre(String genre) {
            Genre.this.genre = genre;
            return this;
        }

        public GenreBuilder setDescription(String description) {
            Genre.this.description = description;
            return this;
        }

        public Genre build() {
            return Genre.this;
        }
    }
}
