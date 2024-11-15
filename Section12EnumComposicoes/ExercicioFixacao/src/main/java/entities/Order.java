package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment = new Date().from(Instant.now());
    private OrderStatus status;
    private List<OrderItem> cart = new ArrayList<OrderItem>();
    private Client client;

    public  Order() {}

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getCart() {
        return this.cart;
    }

    public void addOrderItem(OrderItem item) {
        this.cart.add(item);
    }

    public void removeOrderItem(OrderItem item) {
        this.cart.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem item : cart) {
            sum += item.subTotal();
        }
        return sum;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfBirthday = new SimpleDateFormat("dd/MM/yyyy");

        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY:\n");
        sb.append("Order moment: " + sdf.format(this.moment) + "\n");
        sb.append("Order Status: " + this.status + "\n");
        sb.append("Client: " + this.client.getName() + " (" + sdfBirthday.format(this.client.getBirthDate()) + ") - " +
                this.client.getEmail() + "\n");
        sb.append("Order items:\n");
        Double sum = 0.0;
        for (OrderItem item : this.cart) {
            sb.append(
                    item.getProduct().getName() + ", $" + String.format("%.2f", item.getProduct().getPrice()) +
                            ", Quantity: " + item.getQuantity() + ", Subtotal: $" + String.format("%.2f", item.subTotal()) + "\n"
            );
            sum += item.subTotal();
        }
        sb.append("Total price: $" + String.format("%.2f", sum) + "\n");

        return sb.toString();
    }
}
