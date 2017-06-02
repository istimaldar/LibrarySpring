package com.netcracker.istimaldar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by istimaldar
 */

@Entity
@Table(name = "library.author")
public class Author implements Cloneable, Serializable {
    @Id
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String description;

    private Author() {

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id == author.id && firstName.equals(author.firstName) && lastName.equals(author.lastName)
                && description.equals(author.description);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static AuthorBuilder newBuilder() {
        return new Author().new AuthorBuilder();
    }

    public class AuthorBuilder {
        private AuthorBuilder() {

        }

        public AuthorBuilder setId(int id) {
            Author.this.id = id;
            return this;
        }

        public AuthorBuilder setFirstName(String firstName) {
            Author.this.firstName = firstName;
            return this;
        }

        public AuthorBuilder setLastName(String lastName) {
            Author.this.lastName = lastName;
            return this;
        }

        public AuthorBuilder setDescription(String description) {
            Author.this.description = description;
            return this;
        }

        public Author build() {
            return Author.this;
        }
    }
}
