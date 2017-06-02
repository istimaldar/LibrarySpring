package com.netcracker.istimaldar.library.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by istimaldar
 */
@Entity
@Table(name = "customer")
public class Customer implements Cloneable, Serializable {
    @Id
    private int id;

    @Column(name = "last_name")
    private String firstName;

    @Column(name = "first_name")
    private String lastName;

    @OneToMany(targetEntity = Genre.class, cascade = { CascadeType.ALL })
    @JoinTable(name = "library.book_genre",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "genre_id")})
    private List<Order> orders;

    public Customer() {

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

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id == customer.id && firstName.equals(customer.firstName) && lastName.equals(customer.lastName)
                && orders.equals(customer.orders);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + orders.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orders=" + orders +
                '}';
    }

    public static CustomerBuilder newBuilder() {
        return new Customer().new CustomerBuilder();
    }

    public class CustomerBuilder {
        private CustomerBuilder() {

        }

        public CustomerBuilder setId(int id) {
            Customer.this.id = id;
            return this;
        }

        public CustomerBuilder setFirstName(String firstName) {
            Customer.this.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            Customer.this.lastName = lastName;
            return this;
        }

        public CustomerBuilder setOrders(List<Order> orders) {
            Customer.this.orders = orders;
            return this;
        }

        public Customer build() {
            return Customer.this;
        }
    }
}
