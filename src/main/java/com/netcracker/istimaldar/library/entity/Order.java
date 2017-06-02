package com.netcracker.istimaldar.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by istimaldar
 */

@Entity
@Table(name = "book_order")
public class Order implements Cloneable, Serializable {
    @Id
    private int id;
    private boolean subscription;
    private Date beginning;
    private Date ending;
    private boolean closed;

    @Column(name = "close_date")
    private Date closeDate;

    @Column(name = "customer_id")
    private int customerID;

    public Order() {

    }

    public int getId() {
        return id;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public Date getBeginning() {
        return beginning;
    }

    public Date getEnding() {
        return ending;
    }

    public boolean isClosed() {
        return closed;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id && subscription == order.subscription && closed == order.closed
                && customerID == order.customerID && beginning.equals(order.beginning)
                && ending.equals(order.ending) && closeDate.equals(order.closeDate);
    }

    @Override
    public int hashCode() {
        int result = (subscription ? 1 : 0);
        result = 31 * result + beginning.hashCode();
        result = 31 * result + ending.hashCode();
        result = 31 * result + (closed ? 1 : 0);
        result = 31 * result + closeDate.hashCode();
        result = 31 * result + customerID;
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", subscription=" + subscription +
                ", beginning=" + beginning +
                ", ending=" + ending +
                ", closed=" + closed +
                ", closeDate=" + closeDate +
                ", customerID=" + customerID +
                '}';
    }

    public static OrderBuilder newBuilder() {
        return new Order().new OrderBuilder();
    }

    public class OrderBuilder {
        private OrderBuilder() {

        }

        public OrderBuilder setId(int id) {
            Order.this.id = id;
            return this;
        }

        public OrderBuilder setSubscription(boolean subscription) {
            Order.this.subscription = subscription;
            return this;
        }

        public OrderBuilder setBeginning(Date beginning) {
            Order.this.beginning = beginning;
            return this;
        }

        public OrderBuilder setEnding(Date ending) {
            Order.this.ending = ending;
            return this;
        }

        public OrderBuilder setClosed(boolean closed) {
            Order.this.closed = closed;
            return this;
        }

        public OrderBuilder setCloseDate(Date closeDate) {
            Order.this.closeDate = closeDate;
            return this;
        }

        public OrderBuilder setCustomerID(int customerID) {
            Order.this.customerID = customerID;
            return this;
        }

        public Order build() {
            return Order.this;
        }
    }
}
